package com.infinite.day1;

public class CaseDemo1 {
	public void show(int sno) {
		switch(sno) {
		case 1 : 
			System.out.println("Hi I am Makarand...");
			break;
		case 2 : 
			System.out.println("Hi I am Abhishek...");
			break;
		case 3 :
			System.out.println("Hi I Am Lata...");
			break;
		case 4 : 
			System.out.println("Hi i am Akram....");
			break;
		case 5 : 
			System.out.println("Hi I am Aditya...");
			break;
		default : 
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		int sno=3;
		new CaseDemo1().show(sno);
	}
}
