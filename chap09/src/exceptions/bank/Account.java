package exceptions.bank;


public class Account {
	private long balance;
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) throws InsufficientResourcesException  {
		if(balance < money) {
			throw new InsufficientResourcesException("잔고 부족");
		}
		balance -= money;
	}
	
	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	
}
