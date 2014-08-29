package com.staples.service;

import java.io.File;

import com.sforce.async.OperationEnum;
import com.staples.bulk.BulkUtil;
import com.staples.domain.ErrorMsg;
import com.staples.util.CsvErrorUtil;
import com.staples.util.DateUtil;
import com.staples.util.PropsUtil;

public class ErrorService {
	
	private static BulkUtil bulkUtil;
	
	static {
		bulkUtil = new BulkUtil(
				PropsUtil.SF_SERVER.getProperty("staples.prod.username"), 
				PropsUtil.SF_SERVER.getProperty("staples.prod.password"),
				PropsUtil.SF_SERVER.getProperty("staples.prod.url"));
	}

	public static void sendErrorToSalesforce(Exception exception){
		ErrorMsg errorMsg = new ErrorMsg();
		errorMsg.setName("SAP Integration not complete: " + DateUtil.now());
		errorMsg.setLogFile("root@10.78.1.187:/root/salesforce/log");
		errorMsg.setErrorMsg(exception.toString());
		
		File csvFile = CsvErrorUtil.createEmptyErrorFile();
		CsvErrorUtil.createCSVFile(errorMsg, PropsUtil.ERROR_MAPPING, csvFile);
		try {
			bulkUtil.runJob("SAP_Error_Log__c", OperationEnum.insert, csvFile.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
