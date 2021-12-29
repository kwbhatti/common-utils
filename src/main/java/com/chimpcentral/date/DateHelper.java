package com.chimpcentral.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {
	
	private static String defaultFormat = "MM/dd/yyyy HH:mm:ss aa";
	
	public Date getFutureDate(int field, int amount) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance(); 
		calendar.setTime(date);
		calendar.add(field, amount);
		date = calendar.getTime();
		return date;
	}
	
	public Date getFutureDate(int[] field, int[] amount) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance(); 
		calendar.setTime(date);
		for (int i = 0; i < field.length; i++) {
			calendar.add(field[i], amount[i]);
		}
		date = calendar.getTime();
		return date;
	}
	
	public String getCurrentTimeStamp() {
		return getCurrentTimeStamp(defaultFormat);
	}
	
	public String getCurrentTimeStamp(String dateFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		Date date = new Date();
		return simpleDateFormat.format(date);
	}
	
	public String getFutueTimeStamp(int field, int amount, String dateFormat) {
		Date date = getFutureDate(field, amount);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(date);
	}
	
	public String getFutueTimeStamp(int[] field, int[] amount, String dateFormat) {
		Date date = getFutureDate(field, amount);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(date);
	}
	
	public String getFutueTimeStamp(int field, int amount) {
		return getFutueTimeStamp(field, amount, defaultFormat);
	}
	
	public long getCurrentUnixtimeStamp() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		long unixTime = calendar.getTimeInMillis();
		return unixTime;
	}
	
	public long getFutureUnixTimeStamp(int field, int amount) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, amount);
		long unixTime = calendar.getTimeInMillis();
		return unixTime;
	}
	
	public String getDateFromUnixTimeStamp(long unixTimestamp, String dateFormat) {
		Date date = new Date(unixTimestamp);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(date);
	}
}