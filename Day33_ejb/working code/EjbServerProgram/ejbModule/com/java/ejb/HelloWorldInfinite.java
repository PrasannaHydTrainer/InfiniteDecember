package com.java.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldInfinite
 */
@Stateless
@Remote(HelloWorldInfiniteRemote.class)
public class HelloWorldInfinite implements HelloWorldInfiniteRemote {

    /**
     * Default constructor. 
     */
    public HelloWorldInfinite() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Welcome to EJB3 Vizag Infinite...";
	}

}
