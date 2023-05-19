package project.bucket;



public class Customer {

	private int serialID;
	private String id;
	private String name;
	private String address;
	private String tel;
	private int count;
	
	public Customer(String id, String name, String address, String tel) {
		CustomerManager.setSerialID(CustomerManager.getSerialID() + 1);
		this.serialID = CustomerManager.getSerialID();
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public int getSerialID() {
		return serialID;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTel() {
		return tel;
	}

	public void setSerialID(int serialID) {
		this.serialID = serialID;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
