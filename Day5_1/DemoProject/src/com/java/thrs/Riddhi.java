package com.java.thrs;

public class Riddhi implements Runnable {
	Data data;
	Riddhi(Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		data.dispMsg("Riddhi");
	}
}
