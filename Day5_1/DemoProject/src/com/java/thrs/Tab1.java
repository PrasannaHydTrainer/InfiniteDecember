package com.java.thrs;

public class Tab1 implements Runnable {

	MTable mtable;
	Tab1(MTable mtable) {
		this.mtable = mtable;
	}
	
	@Override
	public void run() {
		mtable.dispTable(12);
	}
	
}
