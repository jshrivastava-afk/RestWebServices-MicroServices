package com.ltts.LibraryInfo.model;



public class Books {
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookCatagory;
	private int bookCopies;
	
	
	
	
	public Books() {
		super();
	}
	public Books(int bookId, String bookName, String bookAuthor, String bookCatagory, int bookCopies) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookCatagory = bookCatagory;
		this.bookCopies = bookCopies;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookCatagory() {
		return bookCatagory;
	}
	public void setBookCatagory(String bookCatagory) {
		this.bookCatagory = bookCatagory;
	}
	public int getBookCopies() {
		return bookCopies;
	}
	public void setBookCopies(int bookCopies) {
		this.bookCopies = bookCopies;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookCatagory="
				+ bookCatagory + ", bookCopies=" + bookCopies + "]";
	}
	
	
	
	

}