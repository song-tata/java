package com.hamin.cart;

import com.hamin.bookitem.Book;

public class Cart implements ICart{
	static final int NUM_BOOK = 3;
	public CartItem[] mCartItem = new CartItem[NUM_BOOK];
 	
	@Override
	public void printBookList(Book[] p) {
		for(int i = 0; i < p.length; i++) {
			System.out.print(p[i].getBookId()+"|");
			System.out.print(p[i].getName()+"|");
			System.out.print(p[i].getPrice()+"|");
			System.out.println();
		}
		
	}
	

	@Override
	public boolean isCartInBook(String id) {
		boolean flag = false;
		for(int i = 0; i < mCartItem.length; i++) {
			if(id == mCartItem[i].getBookID()) {
				flag = true;
			}
		}
		return false;
	}

	
	@Override
	public void insertBook(Book p) {
		
	}

	@Override
	public void removeCart(int num) {
		
	}

	@Override
	public void deleteBook() {
		
	}


	public static int getNumBook() {
		return NUM_BOOK;
	}

	
}
