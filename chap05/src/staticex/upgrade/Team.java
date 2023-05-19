package staticex.upgrade;

public class Team {
	
	public void useMoney(int money) {
		if(Company.getMoney()>=money) {
			Company.payMoney(money);
			System.out.println("남은 예산: "+Company.getMoney());
		}else {
			System.out.println("예산부족");
		}
	}
	
	public void earmMoney(int money) {
		Company.addMoney(money);
	}
}
