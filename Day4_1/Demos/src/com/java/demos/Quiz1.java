package com.java.demos;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz1 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("d:/files/Quiz1.txt");
			fw.write("Hi 2 2.5 true 4 false 3 22.3 24 hello 52 23.44");
			fw.close();
			System.out.println("*** File Created ***");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
