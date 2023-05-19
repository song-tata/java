package practis;

public class BankAccount {
	private static String accNum;
	private String name;
	private  int  money;
	
	public BankAccount() {
	}
	public BankAccount(String accNum, String name, int money) {
		if(accNum != BankAccount.accNum)
			BankAccount.accNum = accNum;
		else {
			System.out.println("같은 계좌번호 존재");
			
		}
			
		this.name = name;
		this.money = money;
	}
	public static String getAccNum() {
		return accNum;
	}
	public  String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	public void setAccNum(String accNum) {
		
		this.accNum = accNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(int money) {
		this.money += money;
	}
	public void payMoney(int money) {
		this.money -= money;
	}
	public void accList() {
		System.out.printf("%s %4s %10d\n",BankAccount.accNum,this.name,this.money);
		
	}
	
}
