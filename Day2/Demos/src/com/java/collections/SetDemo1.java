package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set names = new HashSet();
		names.add("Pavan");
		names.add("Chandu");
		names.add("Lata");
		names.add("Azhar");
		names.add("Chetan");
		names.add("Pavan");
		names.add("Chandu");
		names.add("Lata");
		names.add("Azhar");
		names.add("Chetan");
		names.add("Pavan");
		names.add("Chandu");
		names.add("Lata");
		names.add("Azhar");
		names.add("Chetan");
		System.out.println("Names are ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
