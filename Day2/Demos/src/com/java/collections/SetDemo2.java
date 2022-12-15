package com.java.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
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
