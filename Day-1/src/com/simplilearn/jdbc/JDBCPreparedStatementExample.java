package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class JDBCPreparedStatementExample {

	
public static void main(String[] args) throws SQLException {
		
				
		try {
			//1. Load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");			
			
			//2. Get the Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
			
		
			//3 Create the Statement
			
			PreparedStatement stmt=conn.prepareStatement("INSERT INTO Student VALUES (?, ?, ?, ?)");
			//INSERT INTO Student VALUES (205, 'Robert', 'downey', 70);
			
						
			stmt.setInt(1, 211);
			stmt.setString(2, "rmkatkar1");
			stmt.setString(3, "StackRadius1");
			stmt.setInt(4, 91);
			
			stmt.setInt(1, 212);
			stmt.setString(2, "rmkatkar2");
			stmt.setString(3, "StackRadius3");
			stmt.setInt(4, 92);
			
			stmt.setInt(1, 213);
			stmt.setString(2, "rmkatkar3");
			stmt.setString(3, "StackRadius3");
			stmt.setInt(4, 93);
			
			
			
			boolean isInsert=stmt.execute();
			
			System.out.println(isInsert);
			
			if(!isInsert) {
				System.out.println("Data Inserted Successfully");
			}else {
				System.out.println("Error occured while inseerting the Data");
			}
			
		
			 // Sir can you please explain how to take user input to insert data ??


						
			// 5. Close the Connection
			conn.close();		
			
		} catch (ClassNotFoundException e) {						
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	


	}

}
