package nameggue;

import java.util.Scanner;

class Bank {

	private static Account[] accounts = new Account[100];
	private static int accountCount = 0;

	static int menu(Scanner sc) {

		int decide;

		System.out.println("-".repeat(57));
		System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("-".repeat(57));
		System.out.print("선택 > ");
		decide = sc.nextInt();

		return decide;
	}

	static void create(Scanner sc) {

		String checkNo;
		String name;
		int money;

		try {
			System.out.println("-".repeat(9));
			System.out.println("계좌 생성");
			System.out.println("-".repeat(9));
			sc.nextLine(); // Flush

			System.out.print("계좌 번호 : ");
			checkNo = sc.nextLine();
			System.out.print("계좌주 : ");
			name = sc.nextLine();
			System.out.print("초기입금액 : ");
			money = sc.nextInt();

			accounts[accountCount] = new Account(checkNo, name, money);
			accountCount++;

			System.out.println();
			System.out.println("결과 : 계좌가 생성되었습니다.");
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void print(Scanner sc) {

		try {
			System.out.println("-".repeat(9));
			System.out.println("계좌 목록");
			System.out.println("-".repeat(9));
			sc.nextLine(); // Flush

			if (accountCount == 0) {
				System.out.println();
				System.out.println("생성된 계좌가 없습니다.");
			} else {
				for (int i = 0; i < accountCount; i++) {
					System.out.println(accounts[i].getCheckNo() + "\t\t" + accounts[i].getName() + "\t\t"
							+ accounts[i].getMoney());
				}
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void deposit(Scanner sc) {

		String checkNo;
		int money;
		boolean isExist = false;

		try {
			System.out.println("-".repeat(4));
			System.out.println("입금");
			System.out.println("-".repeat(4));
			sc.nextLine(); // Flush

			System.out.print("계좌 번호 : ");
			checkNo = sc.nextLine();
			System.out.print("예금액 : ");
			money = sc.nextInt();

			for (int i = 0; i < accountCount; i++) {
				if (accounts[i].getCheckNo().equals(checkNo)) {
					isExist = true;
					accounts[i].setMoney(accounts[i].getMoney() + money);
					System.out.println();
					System.out.println("결과 : 입금이 완료되었습니다.");
					break;
				} else {
					continue;
				}
			}
			if (isExist != true) {
				System.out.println();
				System.out.println("결과 : 입력한 계좌를 찾을 수 없습니다.");
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void withdrawal(Scanner sc) {

		String checkNo;
		int money;
		boolean isExist = false;

		try {
			System.out.println("-".repeat(4));
			System.out.println("출금");
			System.out.println("-".repeat(4));
			sc.nextLine(); // Flush

			System.out.print("계좌 번호 : ");
			checkNo = sc.nextLine();
			System.out.print("출금액 : ");
			money = sc.nextInt();

			for (int i = 0; i < accountCount; i++) {
				if (accounts[i].getCheckNo().equals(checkNo)) {
					isExist = true;
					if (accounts[i].getMoney() - money >= 0) {
						accounts[i].setMoney(accounts[i].getMoney() - money);
						System.out.println();
						System.out.println("결과 : 출금이 완료되었습니다.");
						break;
					} else {
						System.out.println();
						System.out.println("결과 : 잔액이 부족합니다.");
						break;
					}
				} else {
					continue;
				}
			}
			if (isExist != true) {
				System.out.println();
				System.out.println("결과 : 입력한 계좌를 찾을 수 없습니다.");
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
