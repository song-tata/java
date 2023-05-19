package practis;

public class PaperNo19 {
	
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setBalance(30000);
		System.out.println("현재 잔고" + acc.getBalance());
		
		acc.setBalance(-1);
		System.out.println("현재 잔고" + acc.getBalance());

		acc.setBalance(3000000);
		System.out.println("현재 잔고" + acc.getBalance());
		
		acc.setBalance(50000);
		System.out.println("현재 잔고" + acc.getBalance());
	}
}
