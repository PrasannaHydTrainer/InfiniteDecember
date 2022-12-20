package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaEx2 {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Avesh", 48234));
		employList.add(new Employ(2, "Lata", 90323));
		employList.add(new Employ(3, "Chetan", 77423));
		employList.add(new Employ(4, "Subodh", 46533));
		employList.add(new Employ(5, "Azhar", 90323));
		employList.add(new Employ(6, "Priya", 49999));
        // using lambda to filter data  
		employList.stream().filter(p -> p.getBasic() > 50000).forEach(x -> {
			System.out.println(x);
		});
//        Stream<Employ> filtered_data = employList.stream()
//        		.filter(p -> p.getBasic() > 50000); 
//        System.out.println("Filterd Data ");
//        filtered_data.forEach(x -> {
//        	System.out.println(x);
//        });
	}
}
