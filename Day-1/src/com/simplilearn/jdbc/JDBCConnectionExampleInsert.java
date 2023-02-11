package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionExampleInsert {

	//naraha risetti
	public static void main(String[] args) throws SQLException {
		
		//final String SQL_STUDENT_Details="select * from Student";
		
		final String SQL_INSERT_STUDENT_Details="INSERT INTO Student VALUES (209, 'Naraha9', 'risetti9', 39)";	
		//final String SQL_INSERT_STUDENT_Details="INSERT INTO Student VALUES (209, 'Naraha9', 'risetti9', 39)";	
		//final String SQL_INSERT_STUDENT_Details="INSERT INTO Student VALUES (209, 'Naraha9', 'risetti9', 39)";	
		//final String SQL_INSERT_STUDENT_Details="INSERT INTO Student VALUES (209, 'Naraha9', 'risetti9', 39)";	
		
		try {
			//1. Load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Get the Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");
			
			//3 Create the Statement
			Statement stmt = conn.createStatement();			
			
					
			boolean isInserted=stmt.execute(SQL_INSERT_STUDENT_Details);
			
			System.out.println(isInserted);
			
			if(!isInserted) {
				System.out.println("Data inserted Successfully");
			}else {
				System.out.println("Error occured while Inserting");
			}
			
			
			
			
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
