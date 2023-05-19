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
		setLunch = getRandomElements(lunch, numElements);
		for(int i=0;i<numElements;i++) {
			System.out.print(day[i]+setLunch.get(i) + "\n");
		}
	}

	public static <Meal> ArrayList<Meal> getRandomElements(ArrayList<Meal> lunch1, int numElements) {
		ArrayList<Meal> randomlist = new ArrayList<>(numElements);
		Random rand = new Random();

		for (int i = 0; i < numElements; i++) {
			int idx = rand.nextInt(lunch1.size());
			randomlist.add(lunch1.get(idx));
			lunch1.remove(idx);
		}
		
		return randomlist;
	}

}
