package com.infinite.day1;

public class Voting {

	public void check(int age) {
		if (age >= 18) {
			System.out.println("You are Elligible for voting...");
		} else {
			System.out.println("You are not elligible for voting...");
		}
	}
	public static void main(String[] args) {
		int age=17;
		new Voting().check(age);
	}
}
