package com.java.ejb;

import javax.ejb.Remote;

@Remote
public interface CalculationBeanRemote {

	int sum(int x, int y);
	int sub(int x, int y);
	int mult(int x, int y);
}
