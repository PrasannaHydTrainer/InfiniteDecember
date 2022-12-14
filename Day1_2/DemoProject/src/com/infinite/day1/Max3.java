package com.infinite.day1;

public class Max3 {

	public void check(int a, int b, int c) {
		int m=a;
		if (m < b) {
			m=b;
		}
		if (m < c) {
			m=c;
		}
		System.out.println("Max  " +m);
	}
	 
	public static void main(String[] args) {
		int a,b,c;
		a=5;
		b=8;
		c=3;
	}
}
