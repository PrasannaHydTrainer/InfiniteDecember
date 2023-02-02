package com.java.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MainProg {

	public static void main(String[] args) {
		try {
			HelloWorldBeanRemote service = 
					(HelloWorldBeanRemote) new InitialContext().lookup("HelloWorldBean/remote");
			System.out.println(service.sayHello());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
