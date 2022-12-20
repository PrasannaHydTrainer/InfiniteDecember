package com.java.thrs;

public class Data {
	synchronized void dispMsg(String name) {
		System.out.print("Hello " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" How are u...");
	}
}
