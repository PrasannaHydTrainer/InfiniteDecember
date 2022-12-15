package com.java.day2;

public class EmployArray {

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.empno=1;
		employ1.name="Aditya";
		employ1.basic=83823;
		
		Employ employ2 = new Employ();
		employ2.empno=2;
		employ2.name="Ashwin";
		employ2.basic=90311;
		
		Employ employ3 = new Employ();
		employ3.empno=3;
		employ3.name="Lata";
		employ3.basic=90211;
		
		Employ[] arrEmploy = new Employ[] {employ1, employ2,
					employ3};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
