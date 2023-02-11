package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CallableExample {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root",	"root12345");
			PreparedStatement stmt=con.prepareCall("{call GetAllEmployee}");  
			boolean isExecuted = stmt.execute();
			if(isExecuted) {
				 ResultSet rs = stmt.getResultSet();	
				 while(rs.next()) {
					 	 /*System.out.println(
							 	" ID-"+rs.getInt(1)+" "+
							 	" Age-"+rs.getInt(2)+" "+
							 	" First Name-"+rs.getString(3)+" "+
							    " Last Name-"+rs.getString(4)	
							 );*/
					 
					 System.out.println(
					 	" ID-"+rs.getInt("id")+" "+
					 	" Age-"+rs.getInt("age")+" "+
					 	" First Name-"+rs.getString("first")+" "+
					    " Last Name-"+rs.getString("last")	
					 );
					 
				 }
			}else {
				System.out.println("Error Occured while fatching the data");
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
