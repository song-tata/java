package com.school.jrin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Settings extends School {
	public static ArrayList<Meal> setLunch = new ArrayList<>();
	
	public static String[] day = {"월요일 : ","화요일 : ","수요일 : ","목요일 : ","금요일 : "};

	public void copyLunch() {
		for(int i =0 ;i<lunch.size();i++) {
			System.out.print(day[i] +lunch.get(i).toString() +"\n");
		}
//		Stream<Meal> stream = lunch.stream();
//		stream.forEach(n -> System.out.print(n.toString() + "\n"));
	}

	public void setLunch() {
		int numElements = 5;
		List<Meal> randomElements = getRandomElements(lunch, numElements);
		for(int i=0;i<numElements;i++) {
			System.out.print(day[i]+randomElements.get(i) + "\n");
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
