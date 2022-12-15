package com.java.day2;

public class EnumEx1 {

	public static void main(String[] args) {
		WeekDays wd = WeekDays.THURSDAY;
		System.out.println(wd);
		String dayName = "SUNDAY";
		WeekDays wd1 = WeekDays.valueOf(dayName);
		System.out.println(wd1);
	}
}
