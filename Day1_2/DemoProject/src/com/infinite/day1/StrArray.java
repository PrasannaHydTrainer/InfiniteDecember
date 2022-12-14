package com.infinite.day1;

public class StrArray {

	public void show() {
		String[] names = new String[] {"Abhishek","Priyanka","Aditya",
				"Lata","Darshan"
		};
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		new StrArray().show();
	}
}
