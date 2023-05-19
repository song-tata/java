package departments;

public class IncomeStore extends Store{
	public IncomeStore(String name, String location, String type) {
		super(name, location, type);
	}
	private int money;
	
	

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		
		this.money = money;
	}
	
	public void income(int money) {
		this.money += money;
		
	}
	public void useMoney(int money) {
		this.money -= money;
		if(money < 0) {
			System.out.println("적자발생");
		}
	}
}
