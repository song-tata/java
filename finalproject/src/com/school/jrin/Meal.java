package com.school.jrin;

public class Meal {

	private String rice;
	private String soup;
	private String main;
	private String side;
	private String kimchi;

	public Meal() {}

	public Meal(String rice, String soup, String main, String side, String kimchi) {
		this.rice = rice;
		this.soup = soup;
		this.main = main;
		this.side = side;
		this.kimchi = kimchi;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getSoup() {
		return soup;
	}

	public void setSoup(String soup) {
		this.soup = soup;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getKimchi() {
		return kimchi;
	}

	public void setKimchi(String kimchi) {
		this.kimchi = kimchi;
	}

	
}

