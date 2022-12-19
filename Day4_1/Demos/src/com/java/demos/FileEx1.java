package com.java.demos;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		File f1 = new File("D:/JavaTraining_Infinite/Day3/Demos/src/com/java/demos/DateExs.java");
		System.out.println("File Name  " +f1.getName());
		System.out.println("Full Name  " +f1.getPath());
		System.out.println("Parent   " +f1.getParent());
	}
}
