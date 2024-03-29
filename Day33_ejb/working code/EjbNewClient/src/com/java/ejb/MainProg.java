package com.java.ejb;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MainProg {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		p.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		p.put("java.naming.provider.url", "localhost:1099");
		try {
			HelloWorldBeanRemote service = 
					(HelloWorldBeanRemote) new InitialContext(p).lookup("HelloWorldBean/remote");
			System.out.println(service.sayHello());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
