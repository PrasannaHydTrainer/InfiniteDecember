package com.java.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculationBean
 */
@Stateless
@Remote(CalculationBeanRemote.class)
public class CalculationBean implements CalculationBeanRemote {

    /**
     * Default constructor. 
     */
    public CalculationBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

}
