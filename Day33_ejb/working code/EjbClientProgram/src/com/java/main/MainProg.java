package com.java.main;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.java.ejb.HelloWorldInfiniteRemote;

public class MainProg {

	public static void main(String[] args) throws NamingException {
		HelloWorldInfiniteRemote service = (HelloWorldInfiniteRemote)
				new InitialContext().lookup("HelloWorldInfinite/remote");
		System.out.println(service.sayHello());
	}
}
