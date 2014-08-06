package com.staples.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.sforce.async.AsyncApiException;
import com.sforce.async.OperationEnum;
import com.sforce.ws.ConnectionException;
import com.staples.bulk.BulkUtil;
import com.staples.domain.Output;
import com.staples.mapper.OutputMapper;
import com.staples.util.CsvUtil;
import com.staples.util.MyBatisSqlSessionFactory;
import com.staples.util.PropsUtil;

public class OutputService {
	private static Logger logger = Logger.getLogger(OutputService.class);
	
	public static void main(String[] args) {
		new OutputService().syncInformation();
	}

	public void syncInformation() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();

		try {
			generateCVSfile();
			boolean isSuccess = sendInformationToSalesforce(
					PropsUtil.SF_SERVER.getProperty("staples.username"), 
					PropsUtil.SF_SERVER.getProperty("staples.password"),
					PropsUtil.SF_SERVER.getProperty("staples.url")
					);
			if(isSuccess) updateOutputStatusY();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	void generateCVSfile() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		logger.info("OpenSession --> Database Environment: "
				+ session.getConfiguration().getEnvironment().getId());
		OutputMapper outputMapper = session.getMapper(OutputMapper.class);

		List<Output> exportData = outputMapper.getAllUpdatedInfo();
		logger.info("count of exportData: " + exportData.size());
		CsvUtil.createCSVFile(exportData, PropsUtil.FIELDS_MAPPING);
	}

	boolean sendInformationToSalesforce(String server, String password, String url)
			throws ConnectionException, AsyncApiException, IOException {
		return new BulkUtil(server, password, url).runJob("Account", OperationEnum.upsert);
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
