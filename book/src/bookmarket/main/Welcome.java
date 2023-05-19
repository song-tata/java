package bookmarket.main;

import java.util.Scanner;

import bookmarket.bookitem.Book;

public class Welcome {
	static Manager m1 = new Manager();

	public static void main(String[] args) {
		Book[] mBookList = new Book[Manager.NUM_BOOK];

		Scanner input = new Scanner(System.in);

		String tagline = "Welcome to Book Market!";

		boolean quit = false;

		while (!quit) {
			System.out.println("***********************************************");
			System.out.println("\t" + tagline);

			m1.menuIntroduction();

			System.out.print("메뉴 번호를 선택해주세요 ");
			int n = input.nextInt();

			if (n < 1 || n > 6) {
				System.out.println("1부터 7까지의 숫자를 입력하세요.");
			} else {
				switch (n) {
				case 1:
					// 주문하기
					m1.menuCartAddItem(mBookList);
					break;
				case 2:
					// 장바구니 목록 보기
					m1.menuCartItemList();
					break;
				case 3:
					// 항목 삭제
					m1.menuCartRemoveItem();
					break;
				case 4:
					// 전체 삭제
					m1.menuCartClear();
					break;
				case 5:
					// 영수증 표시
					m1.menuCartBill();
					break;
				case 6:
					// 종료
					m1.menuExit();
					quit = true;
					break;	
				}
			}
		}

	}


}