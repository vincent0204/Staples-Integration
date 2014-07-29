package com.staples.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sforce.async.AsyncApiException;
import com.sforce.async.OperationEnum;
import com.sforce.ws.ConnectionException;
import com.staples.bulk.BulkUtil;
import com.staples.domain.Output;
import com.staples.mapper.OutputMapper;
import com.staples.util.CsvUtil;
import com.staples.util.MyBatisSqlSessionFactory;

public class OutputService {
	private Logger logger = LoggerFactory.getLogger(getClass());

	public void theSum() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();

		Map<String, Object> params = new HashMap<String, Object>();

		OutputMapper spMapper = session.getMapper(OutputMapper.class);
		spMapper.theSum(params);

		logger.debug((Integer) params.get("sum") + "");
		
		
	}
	
	public void syncInformation(){
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		
		try {
			int countOfCusInfo = updateCustomerInformation();
			int countOfSalInfo = updateSalesInformation();
			int countOfFinInfo = updateFinanceInformation();
			sendInformationToSalesforce(
					generateCVSfile(countOfCusInfo, countOfSalInfo, countOfFinInfo));
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
	}
	
	private int updateCustomerInformation(){
		return 0;
	}
	
	private int updateSalesInformation(){
		return 0;
	}
	
	private int updateFinanceInformation(){
		return 0;
	}
	
	String generateCVSfile(int countOfCusInfo, int countOfSalInfo, int countOfFinInfo){
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		OutputMapper outputMapper = session.getMapper(OutputMapper.class);
		
		LinkedHashMap<String, String> rowMapper = new LinkedHashMap<String, String>();
		if (countOfCusInfo > 0) {
			rowMapper.putAll(getCusHeader());
		}
		
		if (countOfSalInfo > 0) {
			rowMapper.putAll(getSalHeader());
		}
		
		if (countOfFinInfo > 0) {
			rowMapper.putAll(getFinHeader());
			
		}
		
		List<Output> exportData = outputMapper.getAllUpdatedInfo();
		logger.debug("exportData: " + exportData.size());
		
		String filename = "output";
		CsvUtil.createCSVFile(exportData, rowMapper, "", filename);
		return filename;
	}
	
	private Map<String, String> getFinHeader() {
		// TODO Auto-generated method stub
		HashMap<String, String> finHeaderMap = new LinkedHashMap<String, String>();
		return finHeaderMap;
	}

	private Map<String, String> getSalHeader() {
		// TODO Auto-generated method stub
		HashMap<String, String> salHeaderMap = new LinkedHashMap<String, String>();
		return salHeaderMap;
	}

	private Map<String, String> getCusHeader() {
		// TODO Auto-generated method stub
		HashMap<String, String> cusHeaderMap = new LinkedHashMap<String, String>();
		cusHeaderMap.put("getCustomType", "Custom_Type");
		cusHeaderMap.put("getBdSales", "BD_Sales");
		cusHeaderMap.put("getSapRefNo", "SAP_Ref_No");
		
		return cusHeaderMap;
	}

	void sendInformationToSalesforce(String filename) throws ConnectionException, AsyncApiException, IOException{
		BulkUtil example = new BulkUtil("test@staples.cn.vendor", "Staples_16fAkzLepEmskwjrvEDNITupYK");
		example.runJob("Account", OperationEnum.upsert, filename);
	}
}
