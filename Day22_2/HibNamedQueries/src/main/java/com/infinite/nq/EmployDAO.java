package com.infinite.nq;

import java.util.List;

public interface EmployDAO {

	List<Employ> showEmployDao();
	String searchEmployDao(int empno);
	String validateMe(Login login);

}
