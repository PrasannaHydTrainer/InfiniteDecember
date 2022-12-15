package com.java.test;

public interface IThree {

	default void name() {
		System.out.println("Name from IThree...");
	}
}
