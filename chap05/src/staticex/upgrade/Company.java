package staticex.upgrade;

public class Company {
	public static int money = 1000;
	
	public static void addMoney(int money) {
		Company.money += money;
		System.out.println("남은 예산: "+Company.money);
	}
	
	public static void payMoney(int money) {
		Company.money -= money;
//		System.out.println("남은 예산: "+Company.money);
		
	}

	public static int getMoney() {
		return money;
	}

	public static void setMoney(int money) {
		Company.money = money;
	}
	
	
}
