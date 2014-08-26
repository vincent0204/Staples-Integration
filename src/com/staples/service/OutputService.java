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
import com.staples.domain.Output;
import com.staples.mapper.OutputMapper;
import com.staples.util.CsvUtil;
import com.staples.util.MyBatisSqlSessionFactory;
import com.staples.util.PropsUtil;

public class OutputService {
	private static Logger logger = Logger.getLogger(OutputService.class);
	private static BulkUtil bulkUtil;
	private static SqlSession session;
	
	static {
		bulkUtil = new BulkUtil(
				PropsUtil.SF_SERVER.getProperty("staples.full.username"), 
				PropsUtil.SF_SERVER.getProperty("staples.full.password"),
				PropsUtil.SF_SERVER.getProperty("staples.full.url"));
		session = MyBatisSqlSessionFactory.openSession();
	}
	
	public static void main(String[] args) {
		new OutputService().syncInformation();
	}
	
	public void salesforceSync(){
		try {
			bulkUtil.runJob("Account", OperationEnum.upsert, PropsUtil.getOutputUrI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void syncInformation() {
		try {
			SqlSession session = MyBatisSqlSessionFactory.openSession();
			logger.info("OpenSession --> Database Environment: "
					+ session.getConfiguration().getEnvironment().getId());
			OutputMapper outputMapper = session.getMapper(OutputMapper.class);
			
			int cntOfRecords = outputMapper.getCountOfUpdatedInfo();
			logger.info("count of total exportData: " + cntOfRecords);
			
			int offset =0 , limit = 2500;
			
			long totalStartTime = new Date().getTime();
			JobInfo job = bulkUtil.createJob("Account", OperationEnum.upsert);
			List<BatchInfo> batchInfoList = new ArrayList<BatchInfo>();
			
			for (; offset < cntOfRecords; offset = offset + limit) {
				long startTime = new Date().getTime();
				File csvFile = CsvUtil.createEmptyOutputFile();
				logger.info("Output csvFile: " + csvFile.getAbsolutePath());
				
				RowBounds rowBounds = new RowBounds(offset, limit);
				List<Output> exportData = outputMapper.getAllUpdatedInfo(rowBounds);
				logger.info("Data offset: " + offset + ", batch count of exportData: " + exportData.size());
				CsvUtil.createCSVFile(exportData, PropsUtil.FIELDS_MAPPING, csvFile);
				
				batchInfoList.addAll(bulkUtil.createBatchesFromCSVFile(job, csvFile.getAbsolutePath()));
//				bulkUtil.runJob("Account", OperationEnum.upsert, PropsUtil.getOutputUrI());
				
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

	void updateOutputStatusY(){
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		OutputMapper outputMapper = session.getMapper(OutputMapper.class);
		int noOfRowsUpdated = outputMapper.updateOutputStatusY();
		session.commit();
		logger.info("update output status Y : " + noOfRowsUpdated);
	}

	public void updateOutputStatusN() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		OutputMapper outputMapper = session.getMapper(OutputMapper.class);
		int noOfRowsUpdated = outputMapper.updateOutputStatusN();
		session.commit();
		logger.info("update output status N : " + noOfRowsUpdated);
	}
}
