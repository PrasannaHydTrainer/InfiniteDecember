package com.java.jdk8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalEx3 {
	public static void main(String[] args) {
		Date date = new Date();
		String strDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
		System.out.println(strDate);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		System.out.println("Sql Date is  " +sqlDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal.getTime());
	}
}
