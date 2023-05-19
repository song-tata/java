package nameggue;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int decide;
		Scanner sc = new Scanner(System.in);

		try {
			do {
				decide = Bank.menu(sc);

				switch (decide) {
				case 1:
					Bank.create(sc);
					break;
				case 2:
					Bank.print(sc);
					break;
				case 3:
					Bank.deposit(sc);
					break;
				case 4:
					Bank.withdrawal(sc);
					break;
				case 5:
					System.out.println("프로그램 종료");
					return;
				default:
					System.out.println("잘못된 입력값입니다. 다시 입력하세요.");
					System.out.println();
					break;
				}
			} while (true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
