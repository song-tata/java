package com.hamin.bookitem;

public abstract class Item {
	String bookId;
	String name;
	int price;
	
	public Item(String bookId,String name,int price) {
		this.bookId = bookId;
		this.name = name;
		this.price = price;
	}

	public String getBookId() {
		return bookId;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
