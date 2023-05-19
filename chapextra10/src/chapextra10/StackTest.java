package chapextra10;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean run = true;

		Stack s = null;
		System.out.println("배열");
		int capacity = in.nextInt();
		s = new Stack(capacity);
		while (run) {

			System.out.println("1. push 2. pop 3. popall");
			int menu = in.nextInt();

			if (menu == 1) {
				System.out.println("push content");
				int c = in.nextInt();
				s.push(c);
			}else if(menu == 2) {
				System.out.println("pop");
				s.pop();
			}else if(menu == 3) {
				System.out.println("popall");
				s.popAll();
			}else {
				run = false;
			}
		}
	}

}
