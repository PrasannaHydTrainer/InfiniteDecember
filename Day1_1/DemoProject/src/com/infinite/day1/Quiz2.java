package com.infinite.day1;

public class Quiz2 {

	public static void main(String[] args) {
		int i=12;
		i=i++ + i-- + ++i - i-- + --i;
		// 12 + 13 + 13 - 13 + 11
		System.out.println(i);
	}
}
