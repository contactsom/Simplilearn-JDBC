package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConcurrency {
	
	//Sir where i will abl eto know all these terms that you are using?
	//Like sir TYPE_SCROLL_INSENSTIVE  etc etc ....?



	public static void main(String[] args) {
	
		try {
					
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root",	"root12345");
		    //Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    
		    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		    ResultSet rs = stmt.executeQuery("select * from Employees");

  	        System.out.println("***Before Update : Contents of the table:*** ");

		    rs.beforeFirst();

		    while(rs.next()) {
		         System.out.print("ID: " + rs.getInt("id"));
		         System.out.print(", Age: " + rs.getInt("age"));
		         System.out.print(", First Name: " + rs.getString("first"));
		         System.out.println(", Last Name: " + rs.getString("last"));
		      }
		    
		    //***********************
		    
		    rs.beforeFirst();
		    
		    //Updating the age of each employee by 50
		    while(rs.next()) {
		    	if(rs.getInt("id")==102) {
			    	 int age = rs.getInt("age") + 50;//23+50 = 73 Wrong
			    	 rs.updateInt( "age", age );
			         rs.updateRow();
			    }
		    }
		    
		    
  	        System.out.println("***After Update : Contents of the table:*** ");

		    rs.beforeFirst();

		    while(rs.next()) {
		         System.out.print("ID: " + rs.getInt("id"));
		         System.out.print(", Age: " + rs.getInt("age"));
		         System.out.print(", First Name: " + rs.getString("first"));
		         System.out.println(", Last Name: " + rs.getString("last"));
		      }
  
		      
		    con.close();	      
		      
		      
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
