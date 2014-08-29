package com.staples.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.sforce.async.BatchInfo;
import com.sforce.async.JobInfo;
import com.sforce.async.OperationEnum;
import com.staples.bulk.BulkUtil;
import com.staples.mapper.OutputMapper;
import com.staples.util.CsvUtil;
import com.staples.util.MyBatisSqlSessionFactory;
import com.staples.util.PropsUtil;

public class OutputService {
	private static Logger logger = Logger.getLogger(OutputService.class);
	private static BulkUtil bulkUtil;
	private static SqlSession session;
	private static OutputMapper mapper;
	
	static {
		try {
			bulkUtil = new BulkUtil(
					PropsUtil.SF_SERVER.getProperty("staples.prod.username"), 
					PropsUtil.SF_SERVER.getProperty("staples.prod.password"),
					PropsUtil.SF_SERVER.getProperty("staples.prod.url"));
			session = MyBatisSqlSessionFactory.openSession();
			mapper = session.getMapper(OutputMapper.class);
		} catch (Exception e) {
			logger.info(e.getMessage());
			ErrorService.sendErrorToSalesforce(e);
		}
		
		logger.info("OpenSession --> Database Environment: "
				+ session.getConfiguration().getEnvironment().getId());
	}
	
	public static void main(String[] args) {
		new OutputService().syncInformation();
	}

	public void syncInformation() {
		if(!isDatabaseScheduleCompleted()) return;
		
		try {
			JobInfo job = bulkUtil.createJob("Account", OperationEnum.upsert);
			List<BatchInfo> batchInfoList = new ArrayList<BatchInfo>();

			int numberOfRecords = getNumberOfRecords();
			int offset =0 , limit = 2500;
			for (; offset < numberOfRecords; offset = offset + limit) {
				File csvFile = CsvUtil.createEmptyOutputFile();
				logger.info("Output csvFile: " + csvFile.getAbsolutePath());
				
				RowBounds rowBounds = new RowBounds(offset, limit);
				CsvUtil.createCSVFile(mapper.getAllUpdatedInfo(rowBounds), PropsUtil.FIELDS_MAPPING, csvFile);
				batchInfoList.addAll(bulkUtil.createBatchesFromCSVFile(job, csvFile.getAbsolutePath()));
				
				int total = offset + limit;
				if(total > numberOfRecords) total = numberOfRecords;
				logger.info("offset: " + offset + ", limit: " + limit + ", total: " + total);
			}
			
			bulkUtil.closeJob(job.getId());
			bulkUtil.awaitCompletion(job, batchInfoList);
			updateOutputStatus();
		} catch (Exception e) {
			logger.info(e.getMessage());
			ErrorService.sendErrorToSalesforce(e);
		} finally {
			session.close();
		}
	}

	private int getNumberOfRecords() {
		int numberOfRecords = mapper.getCountOfUpdatedInfo();
		logger.info("count of total exportData: " + numberOfRecords);
		return numberOfRecords;
	}

	private void updateOutputStatus(){
		int noOfRowsUpdated = mapper.updateOutputStatus();
		logger.info("update output status: " + noOfRowsUpdated);
		session.commit();
	}
	
	private boolean isDatabaseScheduleCompleted(){
		int statusTrackNumber = mapper.getStatusTrack();
		logger.info("status Track: " + statusTrackNumber);
		return statusTrackNumber == 1;
	}
}
