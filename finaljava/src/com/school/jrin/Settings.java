package com.school.jrin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Settings extends School {
	public static ArrayList<Meal> setLunch = new ArrayList<>();

	public void copyLunch() {
		Stream<Meal> stream = lunch.stream();
		stream.forEach(n -> System.out.print(n.toString() + "\n"));
	}

	public void setLunch() {
		
	}

}
