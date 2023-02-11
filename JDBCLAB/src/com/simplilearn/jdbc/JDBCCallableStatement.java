package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCCallableStatement {
		
	public static void main(String args[]){  

	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");			
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root",	"root12345");	
		
		PreparedStatement stmt=con.prepareCall("{call GetAllEmployee}");  	
		
		boolean isExecuted = stmt.execute();
		
		if(isExecuted==true) {
		
			System.out.println(isExecuted);
			
			 ResultSet rs = stmt.getResultSet();
			 
			 while (rs.next()) {
					//System.out.println(rs.getInt(1) + "  " + rs.getInt(2) + "  " + rs.getString(3)+" "+rs.getString(4));
				   System.out.println(rs.getInt("id") + "  " + rs.getInt("age") + "  " + rs.getString("first")+" "+rs.getString("last"));
				   
			  }
						
		}else {
			
			System.out.println("Error occured while executing the GetAllEmployee ");
		}			
		
		con.close();		

	} catch (Exception e) {
		System.out.println(e);
	}

}

}
