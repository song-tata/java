package com.school.jrin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Settings extends School {
	public static ArrayList<Meal> setLunch = new ArrayList<>();
	
	
	
	public void setLunch() {
		setLunch = new ArrayList<>(lunch);
        Collections.shuffle(setLunch);
	}

	public void copyLunch() {
		for (Meal m1 : lunch) {
			setLunch.add(m1);
		}
	}

}
