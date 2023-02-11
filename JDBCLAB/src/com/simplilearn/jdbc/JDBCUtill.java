package com.simplilearn.jdbc;

import java.sql.*;

public class JDBCUtill {

	static final String DB_URL = "jdbc:mysql://localhost/simplilearn";
	static final String USER = "root";
	static final String PASS = "root1234";
	static final String QUERY = "SELECT id, first, last, age FROM Employees";

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);) {
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				System.out.print("ID: " + rs.getInt("id"));
				System.out.print(", Age: " + rs.getInt("age"));
				System.out.print(", First: " + rs.getString("first"));
				System.out.println(", Last: " + rs.getString("last"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
