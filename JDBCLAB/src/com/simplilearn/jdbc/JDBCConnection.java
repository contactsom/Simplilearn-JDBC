package com.simplilearn.jdbc;

import java.sql.*;

public class JDBCConnection {

	public static void main(String[] args) {

		try {

			//Class.forName("com.mysql.jdbc.Driver");

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root",	"root12345");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from Employees");

			while (rs.next())

				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
