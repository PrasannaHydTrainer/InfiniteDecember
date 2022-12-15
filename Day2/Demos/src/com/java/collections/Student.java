package com.java.collections;

public class Student implements Comparable {

	int sno;
	String sname;
	String city;
	double cgp;
	
	@Override
	public String toString() {
		return String.format("%5s%15s%15s%10s", sno,sname,city,cgp);
	}
	public Student() {

	}

	public Student(int sno, String sname, String city, double cgp) {
		this.sno = sno;
		this.sname = sname;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public int compareTo(Object o) {
		Student student = (Student)o;
		return sname.compareTo(student.sname);
	}
	
	
}
