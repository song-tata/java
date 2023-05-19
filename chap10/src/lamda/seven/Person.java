package lamda.seven;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
	String name;
	int tall;
	int weight;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int tall, int weight) {
		this.name = name;
		this.tall = tall;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getTall() {
		return tall;
	}

	public int getWeight() {
		return weight;
	}

	public static ArrayList<Person> persons = new ArrayList<>(
			Arrays.asList(new Person("황진이", 160, 45), new Person("순신", 180, 85), new Person("삿갓", 175, 65),
					new Person("길동", 170, 68), new Person("장화", 155, 48)));
}
