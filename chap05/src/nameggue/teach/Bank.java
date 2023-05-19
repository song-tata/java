package nameggue.teach;

public class Bank {
	private static Account[] accountArray = new Account[100];
	
	// 계좌 생성 메서드
	public static void createAccount(String name, String ano, int balance) {
		Account newAccount = new Account(name, ano, balance);
		// 예외 처리
		for (int i = 0; i<accountArray.length; i++ ) {
			if(accountArray[i] == null) {
				
				accountArray[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;
				}else if(accountArray[i].getAno().equals(ano)) {
					System.out.println("계좌중복");
					break;
				}
				
			}
		}
		
//	}
	// 계좌 목록 출력 메서드
	public static void accountList() {
		System.out.println("------------");
		System.out.println("계좌 목록");
		System.out.println("------------");
		for (int i = 0; i<accountArray.length; i++ ) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAno()+"     "+account.getName()+"     "+account.getBalance());
				System.out.println();
			}
		}
	}
	
	// 예금 
	public static void add(String ano,int balance) {
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()+balance);
		System.out.println("결과 : 예금이 성공되었습니다.");
	}
	
	// 출금
	public static void minus(String ano, int balance) {
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		if(account.getBalance()>=balance) {
		account.setBalance(account.getBalance()-balance);
		System.out.println("결과 : 출금이 성공되었습니다.");
		}else if(account.getBalance()<balance) {
			System.out.println("잔액 부족");
		}
	}
	
	
	// Acccount 배열에서 ano와 동일한 Account객체 찾기.
	public static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0 ; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)){
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
