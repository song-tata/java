package bookmarket.main;

import bookmarket.bookitem.Book;

public interface IManager {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;
	
	void menuIntroduction();
	void menuCartItemList();
	void menuCartClear();
	void menuCartAddItem(Book[] booklist);
	void menuCartBill();
	void menuExit();
	boolean isCartInBook(String bookId);
	void printBill(String name, String phone, String address);
}
