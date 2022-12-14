package com.infinite.day1;

public class Quiz7 {

	int n;
	public static void main(String[] args) {
		Quiz7 obj1 = new Quiz7();
		obj1.n=12;
		Quiz7 obj2 = obj1;
		obj2.n = 13;
		System.out.println(obj1.n);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
