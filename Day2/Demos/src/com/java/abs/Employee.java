package com.java.abs;

public abstract class Employee {
	int empno;
	String name;
	double basic;
	
	public Employee(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	public abstract Employee showEmploy(Employee employee);

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	
}
