package com.staples.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HistoryServiceTest {
	private static HistoryService historyService;

	@BeforeClass
	public static void setup() {
		historyService = new HistoryService();
	}

	@AfterClass
	public static void teardown() {
		historyService = null;
	}

	@Test
	public void testSyncInformation(){
		historyService.syncInformation();
	}
}
