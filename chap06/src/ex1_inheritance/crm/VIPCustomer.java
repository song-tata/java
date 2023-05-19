package ex1_inheritance.crm;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
	}
	
	public VIPCustomer(int customerID, String customerName,int agentID) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.setAgentID(agentID);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		
		return price - (int)(price * saleRatio);
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
}
