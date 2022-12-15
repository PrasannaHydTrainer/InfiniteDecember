package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Pavan");
		names.add("Chandu");
		names.add("Lata");
		names.add("Azhar");
		names.add("Chetan");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.add(2, "Akhila");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.set(2, "Akhila Priya");
		System.out.println("Names  are");
		for (Object object : names) {
			System.out.println(object);
		}
		names.remove("Chetan");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
