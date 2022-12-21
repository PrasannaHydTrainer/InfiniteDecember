package com.java.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployShow {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite", 
						"root", "root");
			System.out.println("Connected...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
