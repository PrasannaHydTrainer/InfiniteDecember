package com.infinite.hib;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Test {

	@Enumerated(EnumType.STRING)
	private Gender gender;
	
}
