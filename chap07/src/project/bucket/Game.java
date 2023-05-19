package project.bucket;

public class Game {
	String productID;
	String productName;
	String productGenre;
	
	int count;
	int price;
	
	public Game(String productID, String productName, String productGenre, int price) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.productGenre = productGenre;
		this.count++;
	}

	public String getProductGenre() {
		return productGenre;
	}

	public void setProductGenre(String productGenre) {
		this.productGenre = productGenre;
	}

	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setGameName(String ProductName) {
		this.productName = ProductName;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
