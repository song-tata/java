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
		int numElements = 5;
		List<Meal> randomElements = getRandomElements(lunch, numElements);
		for(int i=0;i<numElements;i++) {
			System.out.print(randomElements.get(i) + "\n");
		}
	}

	public static <Meal> List<Meal> getRandomElements(List<Meal> lunch, int numElements) {
		List<Meal> randomlist = new ArrayList<>(numElements);
		Random rand = new Random();

		for (int i = 0; i < numElements; i++) {
			int idx = rand.nextInt(lunch.size());
			randomlist.add(lunch.get(idx));
			lunch.remove(idx);
		}
		return randomlist;
	}

}
