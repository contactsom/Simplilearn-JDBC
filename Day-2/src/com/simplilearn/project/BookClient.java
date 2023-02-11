package com.simplilearn.project;

import java.sql.SQLException;
import java.util.List;

public class BookClient {

	public static void main(String[] args) throws SQLException {
	
		BookService bookService = new BookService();
		
		/*1. Add the Book*/
		/*Book book = new Book(104, "C++", 750, "Yashwant Kanetkar");
		int count=bookService.addBook(book);
		if(count>0) {
			System.out.println("Congratulation !!! Data Inserted Successfully");
		}*/
		
		/*2. Get all the Book*/
		List<Book> books=bookService.getAllBook();
		System.out.println(books);
		
		/*3. Update the Book details by ID*/
		/*Book bookUpdate = new Book(103, "Expert in Python", 350, "Michal Jaworski");
		int updaetCount = bookService.updateBookDetails(bookUpdate);
		if(updaetCount>0) {
			System.out.println("Congratulation !!! Data Updated Successfully");
		}*/
		
		
		/*4. Delete the Book details by ID*/
		int count = bookService.deleteBook(104);
		if(count>0) {
			System.out.println("Congratulation !!! Data deleted successfully");
		}
		List<Book> postDeletebooks=bookService.getAllBook();
		System.out.println(postDeletebooks);
		
		
		/*5. Get the Book details by ID*/
		/*Home Work*/
	}
}
