package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionExample {

	
	public static void main(String[] args) throws SQLException {
		
		final String SQL_STUDENT_Details="select * from Student";
		
		
		try {
			//1. Load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Get the Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");
			
			//3 Create the Statement
			Statement stmt = conn.createStatement();			
			
			//4.Prepare the Query and execute
			ResultSet rs = stmt.executeQuery(SQL_STUDENT_Details);
			
			while (rs.next()) {
				
				System.out.println(
						"ID-"+rs.getInt(1)+" "+
				        "First Name-"+rs.getString(2)+" "+
						"Last Name-"+rs.getString(3)+" "+
				        "Marks-"+rs.getInt(4));				
			}
			
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
