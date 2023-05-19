package oop2student;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Student park = new Student();
		
		String korean = "한국어";
		int koreanGrade = in.nextInt();
		
		
		park.korean.score = 80;
		System.out.println("hello");
		park.inputKorean(korean, koreanGrade);
		System.out.println(park.korean.score);
		System.out.println(park.korean.subjectName);
	}

}
