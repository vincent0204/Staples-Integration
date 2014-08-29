package com.staples.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;

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
}
