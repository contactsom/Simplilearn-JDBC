package com.simplilearn.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService {

	// we are going to Implement the CRUD operation for BOOK
	// C-CREATE, R-READ, U-UPDATE, D-DELETE
	
	/*Add the Book*/
    public int addBook(Book b) throws SQLException {
    	int count=0;
    	Connection conn = null;
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
			PreparedStatement pstmt=conn.prepareStatement("INSERT INTO BOOK VALUES (?, ?, ?, ?)");
			pstmt.setInt(1, b.getBookId());
			pstmt.setString(2, b.getBookName());
			pstmt.setInt(3, b.getBookPrice());
			pstmt.setString(4, b.getBookAuthor());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("**** Error Occure while Inserting ********");
		}
    	conn.close();
    	return count;		
    }
    
    public List<Book> getAllBook() throws SQLException {
    	  List<Book> list= new ArrayList<Book>();
    	  Connection conn = null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
			PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM BOOK ");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setBookPrice(rs.getInt(3));
				book.setBookAuthor(rs.getString(4));
				list.add(book);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	conn.close();
      return list;
    }
    
    
    public int updateBookDetails(Book book) throws SQLException {
    	// UPDATE BOOK set BOOK_PRICE = ? , BOOK_AUTHOR = ? , BOOK_NAME = ? where BOOK_ID = ?
    	Connection conn=null;
    	int count =0;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
			PreparedStatement pstmt=conn.prepareStatement("UPDATE BOOK set BOOK_PRICE = ? , BOOK_AUTHOR = ? , BOOK_NAME = ? where BOOK_ID = ? ");
			pstmt.setString(2, book.getBookAuthor());
			pstmt.setInt(1, book.getBookPrice());
			pstmt.setString(3, book.getBookName());
			pstmt.setInt(4, book.getBookId());
			count= pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	conn.close();
    	return count;
    }
    
    
    public int deleteBook(int bookid) throws SQLException {
    	Connection conn=null;
    	int count=0;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
			PreparedStatement pstmt=conn.prepareStatement("DELETE FROM BOOK WHERE BOOK_ID = ?");
			pstmt.setInt(1, bookid);
			count= pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	conn.close();
    	return count;
    }
    
}
