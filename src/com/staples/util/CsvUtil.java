package com.staples.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import com.staples.domain.Output;

public class CsvUtil {

	private static final String COMMA = ",";
	private static final String DOUBLE_QUOTATION = "\"";
	private static final Logger logger = Logger.getLogger(CsvUtil.class); 

	public static File createCSVFile(List<Output> exportData,
			Properties rowMapper) {

		File csvFile = null;
		BufferedWriter csvFileOutputStream = null;
		try {
			csvFile = createEmptyCsvFile();
			csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(csvFile), "UTF-8"), 1024);

			writeHeader(rowMapper, csvFileOutputStream);
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
			Output output = (Output) iterData.next();
			Set<String> headers = rowMapper.stringPropertyNames();
			for (Iterator<String> iterField = headers.iterator(); iterField
					.hasNext();) {
				String methodName = (String) iterField.next();
				boolean hasNextField = iterField.hasNext();
				outputOneline(csvFileOutputStream, output, methodName,
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
		if (("1".equals(output.getCusStatus()) && "sap_cus"
				.equals(fieldCategory))
				|| ("1".equals(output.getSalStatus()) && "sap_sal"
						.equals(fieldCategory))
				|| ("1".equals(output.getFinStatus()) && "sap_fin"
						.equals(fieldCategory))
				|| ("1".equals(output.getIsNewAccount()) && "sap_acc"
						.equals(fieldCategory))) {
			value = method.invoke(output, new Object[] {});
			if (value == null) {
				value = "";
			} else if (value instanceof Date) {
				value = DateUtil.format((Date) value);
			}
		}

		csvFileOutputStream.write(DOUBLE_QUOTATION + value + DOUBLE_QUOTATION);
		if (hasNextField)
			csvFileOutputStream.write(COMMA);
	}

	private static File createEmptyCsvFile() throws IOException {
		File csvFile = new File(PropsUtil.getOutputUrI());

		File parent = csvFile.getParentFile();
		if (parent != null && !parent.exists()) {
			parent.mkdirs();
		}

		if (csvFile.exists()) {
			csvFile.renameTo(new File(csvFile.getAbsoluteFile() + ".backup"
					+ DateUtil.timestamp()));
		}
		csvFile.createNewFile();
		return csvFile;
	}
}
