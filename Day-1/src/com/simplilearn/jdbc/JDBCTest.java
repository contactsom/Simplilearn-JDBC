package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("Welcome to JDBC");
		
		try {
			//1. Load the Driver 
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");			
			
			//2. Get the Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
			
			//3 Create the Statement
			Statement stmt = conn.createStatement();
			
			//4.Prepare the Query and execute
			ResultSet rs = stmt.executeQuery("select * from Employees");
			
			while (rs.next()) {
				
				System.out.println(
						"ID- "+rs.getInt(1)+" "+
						"AGE- "+rs.getInt(2)+ " "+
						"First Name- "+rs.getString(3)+" "+
						"Last Name- "+rs.getString(4));			
			}			
			// 5. Close the Connection
			conn.close();		
			
		} catch (ClassNotFoundException e) {						
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	


	}
}
