package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JDBCPreparedStatement {
	
	public static void main(String args[]){  

	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");			
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root",	"root12345");	
		
		PreparedStatement stmt=con.prepareStatement("INSERT INTO Employees VALUES (?, ?, ?, ?)");
		
		//PreparedStatement stmt=con.prepareStatement("UPDATE Employees set first = ? where id=?");
		//PreparedStatement stmt=con.prepareStatement("DELETE from Employees where id=?");
		////PreparedStatement stmt=con.prepareStatement("SELECT * from Employees");
		//ResultSet rs=stmt.executeQuery();  
		//while(rs.next()){  
		//System.out.println(rs.getInt(1)+" "+rs.getString(2));  
		//}  
		
		
		// INSERT INTO Employees VALUES (100, 21, 'JACK', 'EDITION');		
		
		stmt.setInt(1,106); 
		stmt.setInt(2,31);  
		stmt.setString(3,"MOHAN"); 
		stmt.setString(4,"P"); 
		
		int count=stmt.executeUpdate();
		System.out.println("Total Record Inserted in to DB"+count);
		
		con.close();		

	} catch (Exception e) {
		System.out.println(e);
	}

}
}
