package nameggue;

class Account {

	private String checkNo;
	private String name;
	private int money;

	Account(String checkNo, String name, int money) {
		setCheckNo(checkNo);
		setName(name);
		setMoney(money);
	}

	String getCheckNo() {
		return checkNo;
	}

	String getName() {
		return name;
	}

	int getMoney() {
		return money;
	}

	void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	void setName(String name) {
		this.name = name;
	}

	void setMoney(int money) {
		this.money = money;
	}

}
