package com.infinite.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="test")
@SessionScoped 
public class Test {

	public String sayHello() {
		return "Welcome to JSF Programming...";
	}
}
