package practis;

import java.util.Scanner;


public class PaperNo20 {

	public static void main(String[] args) {
		
		BankAccount bankaccount = new BankAccount();
		
		BankAccount[] b = new BankAccount[100]; 
		int ACCCNT = 0; 
		Scanner in = new Scanner(System.in);
		String accNum = ""; 
		
		
		while(true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			int menu = 0;
			menu = in.nextInt();
			
			if(menu < 0 || menu > 5) {
				System.out.println("잘못입력했습니다. 다시 입력");
				continue;
			}
			
			switch (menu) {
			case 1:
				bankaccount = new BankAccount();
				System.out.println("계좌생성");
				System.out.println("계좌번호");
				String accNum1 = in.next();
				
				for(int i = 0; i < ACCCNT; i++) {
					if(accNum1.equals(b[i].getAccNum())) {
						System.out.println("계좌번호 중복. 다시 입력하세요");
					
					}else
						accNum = accNum1;						
				}
				
				System.out.println("계좌주");
				String name = in.next();
				System.out.println("초기 입금액");
				int money = in.nextInt();
				bankaccount.setAccNum(accNum1);
				bankaccount.setName(name);
				bankaccount.setMoney(money);
				b[ACCCNT] = bankaccount;
				ACCCNT++;
				System.out.println("결과 : 계좌 생성");
				break;
			case 2:
				System.out.println("계좌 목록");
				for(int i = 0; i < ACCCNT; i++) {
					b[i].accList();
				}
				break;
			case 3:
				System.out.println("예금");
				System.out.println("계좌번호: ");
				String isSame = in.next();
				System.out.println("예금액: ");
				int Money = in.nextInt();
				
				for(int i = 0; i < ACCCNT; i++) {
					if(isSame.equals(b[i].getAccNum())) {
						b[i].setMoney(Money);
						}
				}						
				break;
			case 4:
				System.out.println("출금");
				System.out.println("계좌번호: ");
				isSame = in.next();
				System.out.println("출금액: ");
				Money = in.nextInt();
				
				for(int i = 0; i < ACCCNT; i++) {
					if(isSame.equals(b[i].getAccNum())){
						b[i].payMoney(Money);
						}
				}
				System.out.println("출금 성공");
				break;
			case 5:
				return;
			
			}
		}
	
		
		
	}
	
}
