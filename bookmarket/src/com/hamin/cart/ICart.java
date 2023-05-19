package com.hamin.cart;

import com.hamin.bookitem.Book;

public interface ICart {
	
	void printBookList(Book[] p);//북 리스트 보여주기
	
	boolean isCartInBook(String id);//
	
	void insertBook(Book p);//카트에 책 추가

	void removeCart(int num);//수량조절메소드, 체크는 위에 isCart에서
	
	void deleteBook();//카트 전체삭제
	
}
