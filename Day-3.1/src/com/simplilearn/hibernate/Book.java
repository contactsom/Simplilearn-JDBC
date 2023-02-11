package com.simplilearn.hibernate;

public class Book {

	private int bookid;	 
	private String bookName;
	private long bookPrice;
	private String bookAuthor;
	
	public Book() {
		
	}
	
	public Book(int bookid, String bookName, long bookPrice, String bookAuthor) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
	}
	
	public Book(String bookName, long bookPrice, String bookAuthor) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public long getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(long bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor="
				+ bookAuthor + "]";
	}
	
}
