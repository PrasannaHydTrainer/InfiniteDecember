package com.java.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloWorldInfiniteRemote {

	String sayHello();
}
