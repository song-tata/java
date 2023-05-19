package com.hamin.cart;

import com.hamin.bookitem.Book;

public class CartItem {
	private Book itemBook;
	private String bookID;
	private int totalPrice;
	private int count;
	
	public CartItem(Book booklist) {
		this.itemBook = booklist;
		this.bookID = booklist.getBookId();
		this.count = 1;
		
	}
	public void updateTotalPrice() {
		totalPrice = this.itemBook.getPrice();
	}
	public Book getItemBook() {
		return itemBook;
	}

	public String getBookID() {
		return bookID;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public int getCount() {
		return count;
	}

	public void setItemBook(Book itemBook) {
		this.itemBook = itemBook;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
