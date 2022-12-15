package com.java.sup;

public class SupCon {

	public static void main(String[] args) {
//		Employ obj1 = new Suraj(1, "Suraj", 94211);
//		System.out.println(obj1);
		Employ[] arrEmploy = new Employ[] {
				new Suraj(1, "Suraj", 94211),
				new Akhila(2, "Akhila", 93231)
		};
		
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
