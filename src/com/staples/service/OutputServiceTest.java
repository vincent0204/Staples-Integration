package com.staples.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sforce.async.AsyncApiException;
import com.sforce.ws.ConnectionException;
import com.staples.util.PropsUtil;

public class OutputServiceTest {

	private static OutputService outputService;

	@BeforeClass
	public static void setup() {
		outputService = new OutputService();
	}

	@AfterClass
	public static void teardown() {
		outputService = null;
	}

	@Test
	public void testGenerateCsvFile(){
		outputService.generateCVSfile();
	}
	
//	@Test
	public void testSendInformationToSalesforce() throws ConnectionException, AsyncApiException, IOException{
		outputService.sendInformationToSalesforce(
				PropsUtil.SF_SERVER.getProperty("staples.test.username"), 
				PropsUtil.SF_SERVER.getProperty("staples.test.password"),
				PropsUtil.SF_SERVER.getProperty("staples.test.url")
				);
	}
	
//	@Test
	public void testUpdateOutputStatusY(){
		outputService.updateOutputStatusY();
	}
	
//	@Test
	public void testUpdateOutputStatusN(){
		outputService.updateOutputStatusN();
	}
	
//	@Test
	public void testFileUpload() throws FileNotFoundException{
		System.out.println(PropsUtil.getOutputUrI());
	}
}
