package com.java.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("D:/JavaTraining_Infinite/Day3/Demos/src/com/java/demos/DateExs.java");
			FileOutputStream fout = new FileOutputStream("d:/files/filecopy.txt");
			int ch;
			while((ch=fin.read())!=-1) {
				fout.write((char)ch);
			}
			System.out.println("*** File Copied ***");
			fout.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
