package testfile;

public class Account {

	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (!(getBalance()+ balance <= MIN_BALANCE) 
				&& !(getBalance()+ balance >= MAX_BALANCE))
			this.balance += balance;
		else
			this.balance = getBalance();
	}

}
