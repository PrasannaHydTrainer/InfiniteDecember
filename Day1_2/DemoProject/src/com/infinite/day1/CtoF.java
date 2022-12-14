package com.infinite.day1;

public class CtoF {

	public void calc(double c) {
		double f;
		f=((9*c)/5) +32;
		System.out.println("Fahrenheit Value   " +f);
	}
	public void kelvin(double c) {
		double k=c+273;
		System.out.println("Kelvin  " +k);
	}
	public static void main(String[] args) {
		double c=37;
		new CtoF().calc(c);
		new CtoF().kelvin(c);
	}
}
