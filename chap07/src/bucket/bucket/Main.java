package project.bucket;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static Scanner getScanner() {
		return scanner;
	}

	public static void setScanner(Scanner scanner) {
		Main.scanner = scanner;
	}


	public static void main(String[] args) {

		CustomerManager cm = new CustomerManager();
		BucketManager bm = new BucketManager();
		
		int menu;
		boolean run = true;
		
		while(true) {
			System.out.println("환영합니다 게임샵입니다.");
			System.out.println("메뉴 선택 1. 로그인 2. 게임 목록 3. 장바구니 4. 종료");
			Scanner in = new Scanner(System.in);
			menu = in.nextInt();
			switch (menu) {
			case 1:
				cm.main();
				break;
			case 2:
				bm.showbasket();
				break;
			case 3:
				bm.main();
			case 4:
				System.out.println("이용해주셔서 감사합니다");
				run = false;
			default:
				break;
			}
			
		}
		
	}

	
}
