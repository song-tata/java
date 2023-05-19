package exam;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		double boopy = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("원기둥 밑면 반지름은? :");
		int n1 = in.nextInt();
		System.out.println("원기둥의 높이는? :");
		int n2 = in.nextInt();
		
		boopy = n1*n1*n2*3.14;
		
		System.out.println("원기둥의 부피는 "+boopy);
	}

}
