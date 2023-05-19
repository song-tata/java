package practis;

import java.util.Scanner;

public class BankApplication {

	private static BankAccount[] accounts = new BankAccount[100];
	private static int accCnt = 0;
	Scanner in = new Scanner(System.in);
	
	public int menu(Scanner in) {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
		System.out.print("선택 > ");
		 int menu = in.nextInt();
		return menu;
	}
	
	public void createAccount(Scanner in) {
		System.out.println("계좌 생성");
//		in.next();
//		in.nextInt();
		System.out.println("계좌번호");
		String accNum = in.next();
		System.out.println("계좌주");
		String name = in.next();
		System.out.println("초기 입금액");
		int money = in.nextInt();
		accounts[accCnt] = new BankAccount(accNum, name, money);
		
		accCnt++;
		System.out.println("결과 : 계좌 생성");
	}
	
	public void accList() {
		System.out.println("계좌 목록");
		for(int i = 0; i < accCnt; i++) {
			accounts[i].getAccNum();
		}
	}
	
	public void setMoney(Scanner in) {
		System.out.println("예금");
		System.out.println("계좌번호: ");
		String isSame = in.next();
		System.out.println("예금액: ");
		int Money = in.nextInt();
		
		
		for(int i = 0; i < accCnt; i++) {
			if(isSame.equals(accounts[i].getAccNum())) {
				accounts[i].setMoney(Money);
				}
		}
		System.out.println("입금 완료");
			
	}
	
	public void payMoney(Scanner in) {
		System.out.println("출금");
		System.out.println("계좌번호: ");
		String isSame = in.next();
		System.out.println("출금액: ");
		int Money = in.nextInt();
		
		for(int i = 0; i < accCnt; i++) {
			if(isSame.equals(accounts[i].getAccNum())){
				accounts[i].payMoney(Money);
			}
		}
	}
			
		
	
	
	
	public void continueMenu(int menu) {
		System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
		
	}
}
