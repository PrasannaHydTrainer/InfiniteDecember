package com.java.thrs;

import java.util.Vector;

public class C3 implements Runnable {

	@Override
	public void run() {
		Vector<String> names = new Vector<String>();
		names.add("Chandu");
		names.add("Aditya");
		names.add("Avesh");
		names.add("Sujay");
		names.add("Lata");
		names.add("Azhar");
		for (String s : names) {
			System.out.println("Vector   " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
