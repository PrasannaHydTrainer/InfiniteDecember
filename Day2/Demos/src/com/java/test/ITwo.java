package com.java.test;

public interface ITwo {

	default void name() {
		System.out.println("Name from ITwo...");
	}
}
