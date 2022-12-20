package com.java.jdk8;

import java.util.Calendar;
import java.util.Date;

public class CalEx4 {
	
	public int count(Date end, Date start) {
		return 0;
	}
	
	public static void main(String[] args) {
		Date start = new Date();
		Date today = new Date();
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.DATE, -15);
		start = cal1.getTime();
		System.out.println(start);
		System.out.println(today);
		
	}
}
