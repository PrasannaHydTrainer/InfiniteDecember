package com.java.day2;

public class BoxRuntime {

	public void show(Object ob) {
	//	System.out.println(ob.getClass());
	//	System.out.println(ob.getClass().getName());
		String type = ob.getClass().getSimpleName();
		if (type.equals("Integer")) {
			System.out.println("Integer Casting...");
			int x = (Integer)ob;
		}
		if (type.equals("Double")) {
			System.out.println("Double Casting...");
			double x = (Double)ob;
		}
		if (type.equals("String")) {
			System.out.println("String Casting...");
			String x = (String)ob;
		}
	}
	public static void main(String[] args) {
		int x=12;
		double b=12.5;
		String str="Welcome";
		BoxRuntime obj = new BoxRuntime();
		obj.show(x);
		obj.show(b);
		obj.show(str);
	}
}
