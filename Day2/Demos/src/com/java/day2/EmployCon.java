package com.java.day2;

public class EmployCon {

	public static void main(String[] args) {
		Employ employ1 = new Employ(1, "Makarand", 88232.33);
		System.out.println(employ1);
		Employ employ2 = new Employ(2, "Ojaswi", 90311.33);
		Employ employ3 = new Employ(3, "Azhar", 90211.33);
		Employ employ4 = new Employ(4, "Suraj", 90133.33);

		Employ[] arrEmploy = new Employ[] {employ1, employ2,
					employ3, employ4};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
