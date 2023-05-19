package exceptions.bank;

public class Test {

	
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(50000);
		System.out.println("예금액"+account.getBalance());
		
		try {
			account.withdraw(60000);
		} catch (InsufficientResourcesException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
