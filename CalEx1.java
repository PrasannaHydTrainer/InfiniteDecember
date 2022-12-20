package com.java.jdk8;

import java.util.Calendar;
import java.util.Date;

public class CalEx1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println("The current date is : " + cal.getTime());  
		cal.add(Calendar.DATE, -15);  
		System.out.println("The current date is : " + cal.getTime());  
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		
		Date newDate = cal.getTime();
		System.out.println(newDate);
	}
}
