package nameggue.teach;

import java.util.Scanner;

public class BankApplication {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			int select = scanner.nextInt();
			if (select==1) {
				// account 객체 생성 후 배열에 저장.
				System.out.println("------------");
				System.out.println("계좌 생성");
				System.out.println("------------");
				System.out.print("계좌 번호: ");
				String ano = scanner.next();
				System.out.print("계좌주: ");
				String name = scanner.next();
				System.out.print("초기입금액: ");
				int balance = scanner.nextInt();
				
				Bank.createAccount(name, ano, balance);
				
			}else if(select==2) {
				
				// 배열 출력(개설된 계좌만)
				Bank.accountList();
				
			}else if(select==3) {
				// 입력된 계좌번호 계좌로 입력한 금액 입금
				System.out.println("------------");
				System.out.println("예금");
				System.out.println("------------");
				System.out.print("계좌 번호: ");
				String ano = scanner.next();
				System.out.println("예금액: ");
				int balance = scanner.nextInt();
				Bank.add(ano,balance);
				
			}else if(select == 4) {
				// 입력된 계좌번호 계좌로 입력한 금액 출금
				System.out.println("------------");
				System.out.println("출금");
				System.out.println("------------");
				System.out.print("계좌 번호: ");
				String ano = scanner.next();
				System.out.println("출금액: ");
				int balance = scanner.nextInt();
				Bank.minus(ano,balance);
			}else {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}
	

	

	

	

	
	
	
	
}
