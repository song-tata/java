package project.bucket;

public class Basket {
	
	private int count = 0;
	private String deliverAddress;
	
	public Basket(Game game) {
		this.count++;
	}

	public int getCount() {
		return count;
	}

	public String getDeliverAddress() {
		return deliverAddress;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setDeliverAddress(String deliverAddress) {
		this.deliverAddress = deliverAddress;
	}
	
	
}
