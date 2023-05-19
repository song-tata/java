package practis;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		BankApplication b = new BankApplication();
		Scanner in = new Scanner(System.in);
		int menu = 0;
		
		do {
			menu = b.menu(in);
			switch (menu) {
			case 1:
				b.createAccount(in);
				break;
			case 2:
				b.accList();
				break;
			case 3:
				b.setMoney(in);
				break;
			case 4:
				b.payMoney(in);
				break;
//			case 5:
//				//종료메서드
//				break;

			default:
				b.continueMenu(menu);
				continue;
				
			}
		}while(menu < 5);
	System.out.println("시스템 종료");
	}
	

}
