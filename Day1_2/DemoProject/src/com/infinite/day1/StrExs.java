package com.infinite.day1;

public class StrExs {

	public void show() {
		String str="Welcome to Java Programming...";
		System.out.println("Length of String is  " +str.length());
		System.out.println("First Occurrence of Char 'o' is  " +str.indexOf("o"));
		System.out.println("Char at 5th position  " + str.charAt(5));
		System.out.println("Upper Case  " +str.toUpperCase());
		System.out.println("Lower Case  " +str.toLowerCase());
		System.out.println("Replaced String  " +str.replace("Java", "J2EE"));
		String s1="Lata",s2="Makarand",s3="Lata";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}
	public static void main(String[] args) {
		new StrExs().show();
	}
}
