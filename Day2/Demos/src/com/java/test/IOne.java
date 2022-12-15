package com.java.test;

public interface IOne {
	default void name() {
		System.out.println("Name from IOne...");
	}
}
