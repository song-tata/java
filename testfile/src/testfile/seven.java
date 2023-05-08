package testfile;

import java.util.Random;

public class seven {

	public static void main(String[] args) {
		Random a = new Random();
		boolean flag = true;

		while (flag) {

			int nun1 = a.nextInt(6) + 1;
			int nun2 = a.nextInt(6) + 1;

			System.out.printf("(%d, %d)\n", nun1, nun2);
			if (nun1 + nun2 == 6)
				flag = false;
		}

	}

}
