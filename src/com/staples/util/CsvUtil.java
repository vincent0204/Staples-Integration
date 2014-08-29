package com.staples.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import com.staples.domain.Output;

public class CsvUtil {

	private static final String COMMA = ",";
	private static final String DOUBLE_QUOTATION = "\"";
	private static final String ENCODE = PropsUtil.getEncode();
	private static final Logger logger = Logger.getLogger(CsvUtil.class);

	public static File createCSVFile(List<Output> exportData,
			Properties rowMapper, File csvFile) {

		BufferedWriter csvFileOutputStream = null;
		try {
			csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(csvFile), ENCODE), 1024);

			if (rowMapper != null) {
				writeHeader(rowMapper, csvFileOutputStream);
			}
			writeDetail(exportData, rowMapper, csvFileOutputStream);
			csvFileOutputStream.flush();
		} catch (Exception e) {
			logger.info(e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				csvFileOutputStream.close();
			} catch (IOException e) {
				logger.info(e.getMessage());
				throw new RuntimeException(e.getMessage());
			}
		}
		return csvFile;
	}

	private static void writeHeader(Properties rowMapper,
			BufferedWriter csvFileOutputStream) throws IOException {
		Set<String> headers = rowMapper.stringPropertyNames();

		for (Iterator<String> iterator = headers.iterator(); iterator.hasNext();) {
			String methodName = (String) iterator.next();
			boolean hasNextField = iterator.hasNext();
			csvFileOutputStream.write(DOUBLE_QUOTATION
					+ rowMapper.get(methodName) + DOUBLE_QUOTATION);
			if (hasNextField)
				csvFileOutputStream.write(COMMA);
		}

		csvFileOutputStream.newLine();
	}

	private static void writeDetail(List<Output> exportData,
			Properties rowMapper, BufferedWriter csvFileOutputStream)
			throws IOException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		for (Iterator<Output> iterData = exportData.iterator(); iterData
				.hasNext();) {
			Object obj = iterData.next();
			Set<String> headers = rowMapper.stringPropertyNames();
			for (Iterator<String> iterField = headers.iterator(); iterField
					.hasNext();) {
				String methodName = (String) iterField.next();
				boolean hasNextField = iterField.hasNext();
				outputOneline(csvFileOutputStream, (Output) obj, methodName,
						hasNextField);
			}

			if (iterData.hasNext())
				csvFileOutputStream.newLine();
		}
	}

	private static void outputOneline(BufferedWriter csvFileOutputStream,
			Output output, String key, boolean hasNextField)
			throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, IOException {
		String fieldCategory = key.substring(0, 7);
		String methodName = "get" + key.substring(8, 9).toUpperCase()
				+ key.substring(9);
		Method method = Output.class.getMethod(methodName);

		Object value = "";
		if ((methodName.endsWith("SapRefNo")
				||"1".equals(output.getCusStatus()) && "sap_cus"
				.equals(fieldCategory))
				|| ("1".equals(output.getSalYtdStatus()) && "sap_ytd"
						.equals(fieldCategory))
				|| ("1".equals(output.getSalMtdStatus()) && "sap_mtd"
						.equals(fieldCategory))
				|| ("1".equals(output.getSalClsStatus()) && "sap_cls"
						.equals(fieldCategory))
				|| ("1".equals(output.getFinStatus()) && "sap_fin"
						.equals(fieldCategory))
				|| ("1".equals(output.getIsNewAccount()) && "sap_acc".
						equals(fieldCategory))) {
			value = method.invoke(output, new Object[] {});
			if (value == null) {
				value = "";
			} else if (methodName.endsWith("Date")) {
				value = DateUtil.format((String) value);
			} else if (methodName.endsWith("Address") || methodName.endsWith("Name")) {
				value = value.toString().replace(',', '_').replace('"', ' ')
						.replace('，', '_').replace('\n', ' ').replace('\r', ' ');
			}
		}

		csvFileOutputStream.write(DOUBLE_QUOTATION + value + DOUBLE_QUOTATION);
		if (hasNextField)
			csvFileOutputStream.write(COMMA);
	}

	public static File createEmptyOutputFile() {
		File csvFile = new File(PropsUtil.getOutputUrI());

		File parent = csvFile.getParentFile();
		if (parent != null && !parent.exists()) {
			parent.mkdirs();
		}

		if (csvFile.exists()) {
			csvFile.renameTo(new File(csvFile.getAbsoluteFile() + ".backup"
					+ DateUtil.timestamp()));
		}
		try {
			csvFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return csvFile;
	}
}
