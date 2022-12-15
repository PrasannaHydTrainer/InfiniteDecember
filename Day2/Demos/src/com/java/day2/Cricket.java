package com.java.day2;

public class Cricket {

	static int score;
	
	public void increment(int x) {
		score+=x;
	}
	
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
		
		fb.increment(42);
		sb.increment(12);
		ext.increment(21);
		System.out.println("Total Score  " +Cricket.score);
	}
}
