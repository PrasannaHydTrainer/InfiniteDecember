package com.java.abs;

public class AbsTest {
	public static void main(String[] args) {
		Employee[] employees = new Employee[] {
				new HrEmploy(1,"Joydeep",99999),
				new DeveloperEmploy(2,"Chandu",83812),
				new HrEmploy(3,"Murari",88732),
				new DeveloperEmploy(4,"Suraj",83131),
				new HrEmploy(5,"Parvathy",83144),
				new DeveloperEmploy(6,"Makarand",87412),
				new DeveloperEmploy(7,"Chetan",83111),
				new DeveloperEmploy(8,"Lata",83112),
				new HrEmploy(9,"Shambhavi",83134)
		};
		for (Employee employee : employees) {
			String type = employee.getClass().getSimpleName();
		//	System.out.println(type);
			if (type.equals("DeveloperEmploy")) {
				System.out.println(employee.showEmploy(employee));	
			}
		}
	}
}
