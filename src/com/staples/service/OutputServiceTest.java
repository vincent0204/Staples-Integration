package com.staples.service;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sforce.async.AsyncApiException;
import com.sforce.ws.ConnectionException;

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

//	@Test
	public void testTheSum() {
		outputService.theSum();
	}
	
//	@Test
	public void testGenerateCsvFile(){
		outputService.generateCVSfile(5, 5, 5);
	}
	
	@Test
	public void testSendInformationToSalesforce() throws ConnectionException, AsyncApiException, IOException{
		outputService.sendInformationToSalesforce("output.csv");
	}
}
