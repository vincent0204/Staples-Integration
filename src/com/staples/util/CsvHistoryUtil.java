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

import com.staples.domain.History;

public class CsvHistoryUtil {

	private static final String COMMA = ",";
	private static final String DOUBLE_QUOTATION = "\"";
	private static final Logger logger = Logger.getLogger(CsvUtil.class);

	public static File createCSVFile(List<History> exportData,
			Properties rowMapper, File csvFile) {

		BufferedWriter csvFileOutputStream = null;
		try {
			csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(csvFile), "UTF-8"), 1024);

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

	private static void writeDetail(List<History> exportData,
			Properties rowMapper, BufferedWriter csvFileOutputStream)
			throws IOException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		for (Iterator<History> iterData = exportData.iterator(); iterData
				.hasNext();) {
			Object obj = iterData.next();
			Set<String> headers = rowMapper.stringPropertyNames();
			for (Iterator<String> iterField = headers.iterator(); iterField
					.hasNext();) {
				String methodName = (String) iterField.next();
				boolean hasNextField = iterField.hasNext();
				historyOneline(csvFileOutputStream, (History) obj, methodName,
						hasNextField);
			}

			if (iterData.hasNext())
				csvFileOutputStream.newLine();
		}
	}

	private static void historyOneline(BufferedWriter csvFileOutputStream,
			History history, String methodName, boolean hasNextField)
			throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, IOException {
		
		Method method = History.class.getMethod("get" + methodName.substring(0,1).toUpperCase() + methodName.substring(1));

		Object value = method.invoke(history, new Object[] {});

		csvFileOutputStream.write(DOUBLE_QUOTATION + value + DOUBLE_QUOTATION);
		if (hasNextField)
			csvFileOutputStream.write(COMMA);
	}

	public static File createEmptyHistoryFile() {
		File csvFile = new File(PropsUtil.getHistoryUrI());

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
