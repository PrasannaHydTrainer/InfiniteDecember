package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		List numbers = new ArrayList();
		numbers.add(new Integer(32));
		numbers.add(new Integer(7));
		numbers.add(new Integer(4));
		numbers.add(new Integer(17));
		numbers.add(new Integer(19));
		numbers.add(new Integer(20));
		
		int sum=0;
		for (Object object : numbers) {
			sum+=(Integer)object;
		}
		System.out.println("Sum is  " +sum);
	}
}
