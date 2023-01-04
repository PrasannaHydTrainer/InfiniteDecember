package com.infinite.beans;

public class Calculation {

	private int firstNo;
	private int seconNo;
	
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getSeconNo() {
		return seconNo;
	}
	public void setSeconNo(int seconNo) {
		this.seconNo = seconNo;
	}
	
	public int sum() {
		return getFirstNo() + getSeconNo();
	}
	
	public int sub() {
		return getFirstNo() - getSeconNo();
	}
	
	public int mult() {
		return getFirstNo() * getSeconNo();
	}
}
