package com.school.jrin;
import java.util.ArrayList;

public class School extends Meal {
	private static int serialNumber = 1000;
	private String name;
	public static ArrayList<Meal> lunch = new ArrayList<>();
	

	public School() {}

	public School(String rice, String soup, String main, String side, String kimchi) {
		super(rice, soup, main, side, kimchi);
	}

	public School(String rice, String soup, String main, String side, String kimchi, int serialNumber, String name,
			ArrayList<Meal> lunch) {
		super(rice, soup, main, side, kimchi);
		this.serialNumber = serialNumber++;
		this.name = name;
		this.lunch = lunch;
	}

	public static int getSerialNumber() {
		return serialNumber;
	}

	public static void setSerialNumber(int serialNumber) {
		School.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static ArrayList<Meal> getLunch() {
		return lunch;
	}

	public static void setLunch(ArrayList<Meal> lunch) {
		School.lunch = lunch;
	}

}