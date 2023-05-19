package Generics;

public class ex1_BoxTest {

	public static void main(String[] args) {
		ex1_Box<String> box1 = new ex1_Box<>();
		box1.content = "hi";
		System.out.println(box1.content);

		ex1_Box<Integer> box2 = new ex1_Box<>();
		box2.content = 10;
		System.out.println(box2.content);
	}

}
