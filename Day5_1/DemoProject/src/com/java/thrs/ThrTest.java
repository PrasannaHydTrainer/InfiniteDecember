package com.java.thrs;

public class ThrTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new C1());
		Thread t2 = new Thread(new C2());
		Thread t3 = new Thread(new C3());
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
