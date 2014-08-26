package com.staples.util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropsUtil {

	public static Properties FIELDS_MAPPING = new Properties();
	public static Properties HISTORY_MAPPING = new Properties();
	public static Properties LOG_MAPPING = new Properties();
	public static Properties FILE_PATH = new Properties();
	public static Properties SF_SERVER = new Properties();
	private static final String FILETYPE_CSV = ".csv";
	private static String outputUrl = "";
	private static String historyUrl = "";
	
	static {
		try {
			FILE_PATH.load(new FileInputStream("/root/salesforce/config/path.properties"));
			FIELDS_MAPPING.load(new FileInputStream(getConfigPath() + "sap_fields_mapping.properties"));
			HISTORY_MAPPING.load(new FileInputStream(getConfigPath() + "sap_history_mapping.properties") );
//			LOG_MAPPING.load(new FileInputStream(getConfigPath() + "log_mapping.properties"));
			SF_SERVER.load(new FileInputStream(getConfigPath() + "salesforce.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static String getOutputUrI(){
		if(outputUrl.isEmpty())
			outputUrl = getOutputPath() + getOutputFile() + "-" + DateUtil.now() + FILETYPE_CSV;
		return outputUrl;
	}
	
	public static String getConfigPath(){
		return FILE_PATH.getProperty("path.config");
	}

	private static String getOutputPath(){
		return FILE_PATH.getProperty("path.output");
	}

	private static String getOutputFile() {
		return FILE_PATH.getProperty("file.output");
	}
	
	private static String getHistoryFile() {
		return FILE_PATH.getProperty("file.history");
	}

	public static String getHistoryUrI() {
		if(historyUrl.isEmpty())
			historyUrl = getOutputPath() + getHistoryFile() + "-" + DateUtil.now() + FILETYPE_CSV;
		return historyUrl;
	}
}