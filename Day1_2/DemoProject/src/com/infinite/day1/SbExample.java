package com.infinite.day1;

public class SbExample {

	public void show() {
		StringBuilder sb = new StringBuilder("Welcome to Java Programming...");
		System.out.println(sb);
		sb.append("\n Training @ vizag...");
		System.out.println(sb);
		sb.insert(10, "Aditya");
		System.out.println(sb);
		sb.delete(10, 15);
		System.out.println(sb);
	}
	public static void main(String[] args) {
		SbExample obj = new SbExample();
		obj.show();
	}
}
