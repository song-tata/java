package ex1_inheritance.crm;

public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public GoldCustomer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
		
	}
}
