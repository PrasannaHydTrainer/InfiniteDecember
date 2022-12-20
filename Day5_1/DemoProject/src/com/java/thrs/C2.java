package com.java.thrs;

import java.util.LinkedList;

public class C2 implements Runnable {

	@Override
	public void run() {	
		LinkedList<String> names = new LinkedList<String>();
		names.add("Chandu");
		names.add("Aditya");
		names.add("Avesh");
		names.add("Sujay");
		names.add("Lata");
		names.add("Azhar");
		names.addFirst("Afzal");
		names.addLast("Priyanka");
		for (String s : names) {
			System.out.println("Linked List   " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
