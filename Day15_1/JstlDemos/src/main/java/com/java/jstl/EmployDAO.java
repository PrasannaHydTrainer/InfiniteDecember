package com.java.jstl;
import java.sql.SQLException;
import java.util.List;

public interface EmployDAO {

	String addUser(String userName, String passCode) throws ClassNotFoundException, SQLException;
	int authenticate(String user, String pwd) throws ClassNotFoundException, SQLException;
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
	String updateEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
	String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException;
}
