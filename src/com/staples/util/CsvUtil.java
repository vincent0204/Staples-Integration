package com.staples.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import com.staples.domain.Output;

public class CsvUtil {

	private static final String COMMA = ",";
	private static final String DOUBLE_QUOTATION = "\"";

	public static File createCSVFile(List<Output> exportData,
			LinkedHashMap<String, String> rowMapper, String outPutPath,
			String filename) {

		File csvFile = null;
		BufferedWriter csvFileOutputStream = null;
		try {
			csvFile = createEmptyCsvFile(outPutPath, filename);
			// UTF-8使正确读取分隔符","
			csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(csvFile), "UTF-8"), 1024);
			// 写入文件头部
			writeHeader(rowMapper, csvFileOutputStream);
			// 写入文件内容
			writeDetail(exportData, rowMapper, csvFileOutputStream);
			// 将内容写到文件中
			csvFileOutputStream.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				csvFileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return csvFile;
	}

	private static void writeDetail(List<Output> exportData,
			LinkedHashMap<String, String> rowMapper,
			BufferedWriter csvFileOutputStream) throws IOException {
		
		writeGlobalRequiredFieldValues(csvFileOutputStream);
		for (Iterator<Output> iterData = exportData.iterator(); iterData.hasNext();) {
			Output output = (Output) iterData.next();
			Set<String> headers = rowMapper.keySet();
			for (Iterator<String> iterField = headers.iterator(); iterField.hasNext();) {
				String methodName = (String) iterField.next();
				boolean hasNextField = iterField.hasNext();
				outputOneline(csvFileOutputStream, output, methodName, hasNextField);
			}
			
			if(iterData.hasNext()) csvFileOutputStream.newLine();
		}
	}

	private static void outputOneline(BufferedWriter csvFileOutputStream,
			Output output, String methodName, boolean hasNextField) {
		try {
			Method method = Output.class.getMethod(methodName);
			csvFileOutputStream
					.write(DOUBLE_QUOTATION + method.invoke(output, new Object[]{}) + DOUBLE_QUOTATION);
			if(hasNextField) csvFileOutputStream.write(COMMA);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeHeader(LinkedHashMap<String, String> rowMapper,
			BufferedWriter csvFileOutputStream) throws IOException {
		Set<String> headers = rowMapper.keySet();
		
		writeGlobalRequiredFields(csvFileOutputStream);
		for (Iterator<String> iterator = headers.iterator(); iterator.hasNext();) {
			String methodName = (String) iterator.next();
			boolean hasNextField = iterator.hasNext();
			csvFileOutputStream.write(DOUBLE_QUOTATION
					+ rowMapper.get(methodName) + DOUBLE_QUOTATION);
			if(hasNextField) csvFileOutputStream.write(COMMA);
			
		}

		csvFileOutputStream.newLine();
	}

	private static void writeGlobalRequiredFields(
			BufferedWriter csvFileOutputStream) throws IOException {
		csvFileOutputStream.write(DOUBLE_QUOTATION + "Name" + DOUBLE_QUOTATION);
		csvFileOutputStream.write(COMMA);
	}
	
	private static void writeGlobalRequiredFieldValues(
			BufferedWriter csvFileOutputStream) throws IOException {
		csvFileOutputStream.write(DOUBLE_QUOTATION + DOUBLE_QUOTATION);
		csvFileOutputStream.write(COMMA);
	}

	private static File createEmptyCsvFile(String outPutPath, String filename)
			throws IOException {
		File csvFile;
		csvFile = new File(outPutPath + filename + ".csv");

		// csvFile.getParentFile().mkdir();
		File parent = csvFile.getParentFile();
		if (parent != null && !parent.exists()) {
			parent.mkdirs();
		}
		csvFile.createNewFile();
		return csvFile;
	}
}
