package bookmarket.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import bookmarket.bookitem.Book;
import bookmarket.cart.Cart;

public class Manager implements IManager {

	static Cart mCart = new Cart();
	
	public void menuIntroduction() {
		System.out.println("***********************************************");
		System.out.println(" 1. 주문하기   \t\t 2. 장바구니 목록");
		System.out.println(" 3. 장바구니 항목 삭제 \t 4. 장바구니 전체 삭제");
		System.out.println(" 5. 영수증 표시하기 \t 6. 종료");
		System.out.println("***********************************************");
	}

	public void menuCartItemList() {
		if (mCart.mCartCount >= 0) {
			mCart.printCart();
		}
	}

	public void menuCartClear() {
		if (mCart.mCartCount == 0)
			System.out.println("장바구니에 항목이 없습니다");
		else {
			System.out.println("장바구니에 모든 항목을 삭제하겠습니까?  Y  | N ");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();

			if (str.toUpperCase().equals("Y")) {
				System.out.println("장바구니에 모든 항목을 삭제했습니다");
				mCart.deleteBook();
			}
		}
	}

	public void menuCartAddItem(Book[] booklist) {

		BookList(booklist);

		mCart.printBookList(booklist);

		boolean quit = false;

		while (!quit) {

			System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");

			Scanner input = new Scanner(System.in);
			String str = input.nextLine();

			boolean flag = false;
			int numId = -1;

			for (int i = 0; i < NUM_BOOK; i++) {
				if (str.equals(booklist[i].getBookId())) {
					numId = i;
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("장바구니에 추가하겠습니까?  Y  | N ");
				str = input.nextLine();
				if (str.toUpperCase().equals("Y")) {
					System.out.println(booklist[numId].getBookId() + " 도서가 장바구니에 추가되었습니다.");
					// 카트에 넣기
					if (!isCartInBook(booklist[numId].getBookId())) {
						mCart.insertBook(booklist[numId]);
					}
				}
				quit = true;
			} else
				System.out.println("다시 입력해 주세요");

		}
	}

	public void menuCartRemoveItem() {
		if (mCart.mCartCount == 0)
			System.out.println("장바구니에 항목이 없습니다");
		else {
			menuCartItemList();
			boolean quit = false;
			while (!quit) {
				System.out.print("장바구니에서 삭제할 도서의 ID를 입력하세요 :");
				Scanner input = new Scanner(System.in);
				String str = input.nextLine();
				boolean flag = false;
				int numId = -1;

				for (int i = 0; i < mCart.mCartCount; i++) {
					if (str.equals(mCart.mCartItem[i].getBookID())) {
						numId = i;
						flag = true;
						break;
					}
				}

				if (flag) {
					System.out.println("장바구니의 항목을 삭제하겠습니까?  Y  | N ");
					str = input.nextLine();
					if (str.toUpperCase().equals("Y")) {

						System.out.println(mCart.mCartItem[numId].getBookID() + " 장바구니에서 도서가 삭제되었습니다.");
						mCart.removeCart(numId);
					}
					quit = true;
				} else
					System.out.println("다시 입력해 주세요");
			}
		}
	}

	public void menuCartBill() {
		if (mCart.mCartCount == 0)
			System.out.println("장비구니에 항목이 없습니다");
		else {
			Scanner input = new Scanner(System.in);
			System.out.print("배송받을 고객명을 입력하세요 ");
			String name = input.nextLine();
			System.out.print("배송받을 고객의 연락처를 입력하세요 ");
			String phone = input.nextLine();
			System.out.print("배송받을 고객의 배송지를 입력해주세요 ");
			String address = input.nextLine();
			printBill(name, phone, address);
			
		}
	}

	public void menuExit() {
		System.out.println("프로그램이 종료되었습니다.");
	}

	public boolean isCartInBook(String bookId) {

		return mCart.isCartInBook(bookId);
	}

	public static void BookList(Book[] booklist) {

		booklist[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000);
		booklist[0].setAuthor("송미영");

		booklist[0].setDescription("단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍 ");
		booklist[0].setCategory("IT전문서");
		booklist[0].setReleaseDate("2018/10/08");

		booklist[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000);
		booklist[1].setAuthor("우재남");
		booklist[1].setDescription("실습 단계별 명쾌한 멘토링!");
		booklist[1].setCategory("IT전문서");
		booklist[1].setReleaseDate("2022/01/22");

		booklist[2] = new Book("ISBN1236", "스크래치", 22000);
		booklist[2].setAuthor("고광일");
		booklist[2].setDescription("컴퓨팅 사고력을 키우는 블록 코딩");
		booklist[2].setCategory("컴퓨터입문");
		booklist[2].setReleaseDate("2019/06/10");
	}

	public void printBill(String name, String phone, String address) {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		System.out.println();
		System.out.println("---------------배송 받을 고객 정보----------------");
		System.out.println("고객명 : " + name + "   \t\t연락처 : " + phone);
		System.out.println(" 배송지 : " + address + "t\t발송일 : " + strDate);
		mCart.printCart();

		int sum = 0;
		for (int i = 0; i < mCart.mCartCount; i++)
			sum += mCart.mCartItem[i].getTotalPrice();

		System.out.println("\t\t\t주문 총금액 : " + sum + "원\n");
		System.out.println("----------------------------------------------");
		System.out.println();
	}
}
