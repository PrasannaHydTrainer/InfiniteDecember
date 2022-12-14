package com.infinite.day1;

public class CaseDemo2 {
	public void show(String dayName) {
		switch(dayName) {
		case "MONDAY" : 
			System.out.println("Its Monday...");
			break;
		case "TUESDAY" : 
			System.out.println("Its Tuesday...");
			break;
		case "WEDNESDAY" : 
			System.out.println("Its Wednesday...");
			break;
		case "THURSDAY" : 
			System.out.println("Its Thursday...");
			break;
		case "FRIDAY" : 
			System.out.println("Its Friday...");
			break;
		case "SATURDAY" : 
			System.out.println("Its Saturday...");
			break;
		default : 
			System.out.println("Invalid...");
		}
	}
	public static void main(String[] args) {
		String dayName="MONDAY";
		new CaseDemo2().show(dayName);
	}
}
