package gamestore.model;

public class Game {

	private String productID;
	private String productName;
	private String productGenre;
	private int price;
	private int count ;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Game(String productID, String productName, String productGenre, int price) {
		this.productID = productID;
		this.productName = productName;
		this.productGenre = productGenre;
		this.price = price;
		this.count=1;
	}

	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductGenre() {
		return productGenre;
	}

	public int getPrice() {
		return price;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductGenre(String productGenre) {
		this.productGenre = productGenre;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
