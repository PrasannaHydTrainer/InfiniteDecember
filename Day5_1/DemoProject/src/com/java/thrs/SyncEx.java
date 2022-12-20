package com.java.thrs;

public class SyncEx {

	public static void main(String[] args) {
		Data data = new Data();
		Subodh obj1 = new Subodh(data);
		Riddhi obj2 = new Riddhi(data);
		Chetan obj3 = new Chetan(data);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
