package gamestore.view;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		CustomerManager cm = new CustomerManager();
		GameManager gm = new GameManager();

		System.out.println("* 게임 패키지샵에 오신 것을 환영합니다. *");
		System.out.println();
		do {
			System.out.println("---- 메인 메뉴 ----");
			System.out.println("1. 로그인 / 회원 가입");
			if (CustomerManager.isAdmin()) {
				System.out.println("2. 게임 관리");
			} else {
				System.out.println("2. 게임 구매");
				System.out.println("3. 장바구니");
			}
			System.out.println("9. 종료");
			System.out.print(">> ");
			int decide = scanner.nextInt();

			switch (decide) {
			case 1:
				cm.main();
				break;
			case 2:
				if (CustomerManager.isLogin()) {
					gm.main();
				} else {
					System.out.println("로그아웃 상태입니다. 먼저 로그인해주세요.");
					System.out.println();
				}
				break;
			case 3:

				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력값입니다. 다시 입력하세요.");
				System.out.println();
				break;
			}
		} while (true);
	}

	public static Scanner getScanner() {
		return scanner;
	}

	public static void setScanner(Scanner scanner) {
		Main.scanner = scanner;
	}

}
