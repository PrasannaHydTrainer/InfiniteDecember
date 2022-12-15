package com.java.intf;

public class IntfEx {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Pavan(), new Sarathi(),
			new Swetha()
		};
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
