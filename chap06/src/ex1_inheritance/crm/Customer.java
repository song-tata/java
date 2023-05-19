package ex1_inheritance.crm;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected enum customerGrade {BRONEZ, SILVER, GOLD, PLATINUM};
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price;
		
//		int calcPrice = 0;
//		calcPrice = (int)((double)price*bonusRatio);
//		this.bonusPoint += this.bonusRatio;
//		System.out.printf("비용 : %d\n 할인된 비용 : %d\n 적립된 포인트%f\n");
	}
	public String showCustomerInfo() {
		return "고객 이름 :"+ customerName + ", 고객 등급 :" +customerGrade+" 현재 적립된 포인트 :"+bonusPoint;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
}
