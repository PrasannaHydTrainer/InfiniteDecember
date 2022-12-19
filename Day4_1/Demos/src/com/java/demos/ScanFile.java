package com.java.demos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

	public static void main(String[] args) {
		File f1 = new File("D:/JavaTraining_Infinite/Day3/Demos/src/com/java/demos/DateExs.java");
		try {
			Scanner sc = new Scanner(f1);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
