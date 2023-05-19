package com.hamin.bookitem;

public class Book extends Item {

	private String author;
	public Book(String bookId, String name, int price) {
		super(bookId, name, price);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
}

