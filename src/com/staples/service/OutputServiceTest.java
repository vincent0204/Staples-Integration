package com.staples.service;

import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.junit.BeforeClass;

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

//	@Test
	public void testSyncInformation(){
		outputService.syncInformation();
	}
	
//	@Test
	public void testSalesforceSync(){
		outputService.salesforceSync();
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
