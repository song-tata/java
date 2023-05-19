package programming.five;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundTest {

	public static void main(String[] args) {
		List<Animal> lists = new ArrayList<>();
		lists.add(new Dog());
		lists.add(new Cuckoo());
		printSound(lists);

		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());
		printSound(dogs);
	}

//	public static <T extends Animal> void printSound(List<T> a) {
//		for (Animal b : a) {
//			b.sound();
//		}
//
//	}
	public static void printSound(List<? extends Animal> a) {
		for (Animal b : a) {
			b.sound();
		}
	}
}
