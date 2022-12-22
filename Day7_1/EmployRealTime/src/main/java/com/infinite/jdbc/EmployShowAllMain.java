package com.infinite.jdbc;

import java.sql.SQLException;
import java.util.List;

public class EmployShowAllMain {

	public static void main(String[] args) {
		EmployDAO dao = new EmployDaoImpl();
		List<Employ> employList;
		try {
			employList = dao.showEmployDao();
			for (Employ employ : employList) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
