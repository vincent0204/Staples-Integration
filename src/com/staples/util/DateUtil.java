package com.staples.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static String now() {
		return format(new Date());
	}
	
	public static String format(Date date){
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.setTime(date);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(cal.get(Calendar.YEAR)).append("-");
		
		int month = cal.get(Calendar.MONTH) + 1;
		if(month > 9) {
			sb.append(month).append("-");
		} else {
			sb.append("0").append(month).append("-");
		}
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		if(day > 9){
			sb.append(day);
		} else {
			sb.append("0").append(day);
		}
		
		return sb.toString();
	}
	
	public static long timestamp() {
		return new Date().getTime();
	}
}
