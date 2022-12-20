package com.java.thrs;

public class MTable {
	void dispTable(int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p = n * i;
			System.out.println(n + " * " +i+ " =  " +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
