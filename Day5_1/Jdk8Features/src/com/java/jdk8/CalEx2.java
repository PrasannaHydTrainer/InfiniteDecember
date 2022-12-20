package com.java.jdk8;

import java.util.Calendar;
import java.util.Date;

public class CalEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
	}
}
