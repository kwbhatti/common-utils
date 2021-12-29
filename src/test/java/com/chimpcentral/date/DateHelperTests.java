package com.chimpcentral.date;

import java.util.Calendar;

public class DateHelperTests {

	public static void main(String[] args) {
		DateHelper dateHelper = new DateHelper();
		System.out.println(dateHelper.getCurrentTimeStamp("yyyy-MM-dd"));
		System.out.println(dateHelper.getFutueTimeStamp(Calendar.DATE, 1, "yyyy-MM-dd"));
		System.out.println(dateHelper.getFutueTimeStamp(new int[] {Calendar.HOUR}, new int[] {3}, "yyyy-MM-dd-HH-mm-ss"));
		System.out.println(dateHelper.getFutueTimeStamp(new int[] {Calendar.HOUR, Calendar.SECOND}, new int[] {5, 1}, "yyyy-MM-dd-HH-mm-ss"));
		System.out.println(dateHelper.getFutureUnixTimeStamp(Calendar.DATE, -1));
		System.out.println(dateHelper.getCurrentTimeStamp());
		System.out.println(dateHelper.getFutueTimeStamp(Calendar.DATE, -5, "yyyy-MM-dd"));
		System.out.println(dateHelper.getFutureUnixTimeStamp(Calendar.DATE, -20));
		System.out.println(dateHelper.getFutureUnixTimeStamp(Calendar.DATE, -2));
		System.out.println(dateHelper.getFutueTimeStamp(Calendar.SECOND, 1, "yyyyMMddHHmmss"));
		System.out.println(dateHelper.getDateFromUnixTimeStamp(1631469484000L, "yyyy-MM-dd"));
	}
}
