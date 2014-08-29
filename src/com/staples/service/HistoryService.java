package com.staples.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.sforce.async.BatchInfo;
import com.sforce.async.JobInfo;
import com.sforce.async.OperationEnum;
import com.staples.bulk.BulkUtil;
import com.staples.domain.History;
import com.staples.mapper.HistoryMapper;
import com.staples.util.CsvHistoryUtil;
import com.staples.util.MyBatisSqlSessionFactory;
import com.staples.util.PropsUtil;

public class HistoryService {
	private static Logger logger = Logger.getLogger(OutputService.class);
	private static BulkUtil bulkUtil;
	private static SqlSession session;
	
	static {
		bulkUtil = new BulkUtil(
				PropsUtil.SF_SERVER.getProperty("staples.prod.username"), 
				PropsUtil.SF_SERVER.getProperty("staples.prod.password"),
				PropsUtil.SF_SERVER.getProperty("staples.prod.url"));
		session = MyBatisSqlSessionFactory.openSession();
	}
	
	public static void main(String[] args) {
		new HistoryService().syncInformation();
	}

	public void syncInformation() {
		try {
			SqlSession session = MyBatisSqlSessionFactory.openSession();
			logger.info("OpenSession --> Database Environment: "
					+ session.getConfiguration().getEnvironment().getId());
			HistoryMapper historyMapper = session.getMapper(HistoryMapper.class);
			
			int cntOfRecords = historyMapper.getCountOfInsertedInfo();
			logger.info("count of total exportData: " + cntOfRecords);
			
			int offset =0 , limit = 5000;
			
			long totalStartTime = new Date().getTime();
			JobInfo job = bulkUtil.createJob("SAP_Sales_Margin_History__c", OperationEnum.upsert);
			List<BatchInfo> batchInfoList = new ArrayList<BatchInfo>();
			
			for (; offset < cntOfRecords; offset = offset + limit) {
				long startTime = new Date().getTime();
				File csvFile = CsvHistoryUtil.createEmptyHistoryFile();
				logger.info("Output csvFile: " + csvFile.getAbsolutePath());
				
				RowBounds rowBounds = new RowBounds(offset, limit);
				List<History> exportData = historyMapper.getAllInsertedInfo(rowBounds);
				logger.info("Data offset: " + offset + ", batch count of exportData: " + exportData.size());
				CsvHistoryUtil.createCSVFile(exportData, PropsUtil.HISTORY_MAPPING, csvFile);
				
				batchInfoList.addAll(bulkUtil.createBatchesFromCSVFile(job, csvFile.getAbsolutePath()));
				
				long endTime = new Date().getTime();
				logger.info("Round Used Time: " + (endTime - startTime) + " millis");
			}
			
			bulkUtil.closeJob(job.getId());
			bulkUtil.awaitCompletion(job, batchInfoList);
			
			long totalEndTime = new Date().getTime();
			logger.info("Total Used Time: " + (totalEndTime - totalStartTime) + " millis");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
