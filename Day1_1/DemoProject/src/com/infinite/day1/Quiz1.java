package com.infinite.day1;

public class Quiz1 {

	public static void main(String[] args) {
		int i=12;
//		System.out.println(i++);
//		System.out.println(i);
		i=i++ + ++i + i++ + ++i;
		// 12 + 14 + 14 + 16
		System.out.println(i);
	}
}
