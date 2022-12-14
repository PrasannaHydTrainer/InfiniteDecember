package com.infinite.day1;

public class PosNeg {

	public void check(int n) {
		if (n%2==0) {
			System.out.println("Even Number...");
		} else {
			System.out.println("Odd Number...");
		}
	}
	
	public static void main(String[] args) {
		int n=9;
		PosNeg obj = new PosNeg();
		obj.check(n);
	}
}
