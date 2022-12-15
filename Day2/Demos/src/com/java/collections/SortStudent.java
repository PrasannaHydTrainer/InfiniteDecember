package com.java.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Comparator c = new CgpComparator();
		SortedSet names = new TreeSet(c);
		names.add(new Student(1, "Riddhi", "Pune", 9.2));
		names.add(new Student(2, "Chetan", "Mumbai", 8.9));
		names.add(new Student(3, "Abhishek", "Delhi", 7.3));
		names.add(new Student(4, "Lata", "Hyderabad", 9.0));
		names.add(new Student(5, "Suraj", "Vizag", 9.8));
		names.add(new Student(6, "Mitesh", "Nanded", 8.7));
		names.add(new Student(7, "Partha", "Nagpur", 8.5));
		System.out.println("Names are ");
		for (Object object : names) {
			Student student = (Student)object;
			System.out.println(student);
		}
	}
}
