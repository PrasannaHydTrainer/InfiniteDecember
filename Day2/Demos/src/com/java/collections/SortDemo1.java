package com.java.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo1 {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Pavan");
		names.add("Chandu");
		names.add("Lata");
		names.add("Azhar");
		names.add("Chetan");
		names.add("Pavan");
		System.out.println("Names are ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
