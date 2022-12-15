package com.java.test;

public class Test implements IOne, ITwo, IThree {

	@Override
	public void name() {
		IOne.super.name();
		ITwo.super.name();
		IThree.super.name();
	}

	public static void main(String[] args) {
		new Test().name();
	}
}
