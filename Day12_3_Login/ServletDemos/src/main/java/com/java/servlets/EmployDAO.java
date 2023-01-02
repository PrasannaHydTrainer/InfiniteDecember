package com.java.servlets;
import java.sql.SQLException;
import java.util.List;

public interface EmployDAO {

	int authenticate(String user, String pwd) throws ClassNotFoundException, SQLException;
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
}
