package com.java.thrs;

import java.util.ArrayList;
import java.util.List;

public class C1 implements Runnable {
	@Override
	public void run() {
		List<String> names = new ArrayList<String>();
		names.add("Chandu");
		names.add("Aditya");
		names.add("Avesh");
		names.add("Sujay");
		names.add("Lata");
		names.add("Azhar");
		for (String s : names) {
			System.out.println("ArrayList Name is  " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
