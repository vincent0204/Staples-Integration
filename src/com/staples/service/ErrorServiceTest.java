package com.staples.service;

import org.junit.Test;

public class ErrorServiceTest {

	@Test
	public void testSyncInformation(){
		try{
			int i = 1/0;
		} catch (Exception e) {
			ErrorService.sendErrorToSalesforce(e);
		}
	}
}
