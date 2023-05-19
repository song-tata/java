package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Five {

	public static void main(String[] args) {
		ArrayList<Integer> jumsu = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int score = 1;

		while (score > 0) {
			System.out.println("점수를 입력하세요");
			score = in.nextInt();
			if (score > 0)
				jumsu.add(score);
		}

		System.out.printf("전체 학생은 %d 명이다.\n", jumsu.size());
		System.out.print("학생들의 성적 : ");
		for (int a : jumsu) {
			System.out.print(a + " ");
		}
		System.out.println();

		int maxJumsu = Integer.MIN_VALUE;

		for (int s : jumsu) {
			if (s > maxJumsu) {
				maxJumsu = s;
			}
		}

		for (int s : jumsu) {
			String grade;
			if (s >= maxJumsu - 10) {
				grade = "A";
			} else if (s >= maxJumsu - 20) {
				grade = "B";
			} else {
				grade = "C";
			}
			System.out.println(s + " : " + grade);
		}
		Iterator<Integer> it = jumsu.iterator();
		while (it.hasNext()) {
			String grade;
			int s = it.next();
			if (s >= maxJumsu - 10) {
				grade = "A";
			} else if (s >= maxJumsu - 20) {
				grade = "B";
			} else {
				grade = "C";
			}
			System.out.println(s + " : " + grade);
		}

//		jumsu.sort(null);
//		
//		Collections.sort(jumsu);

//		System.out.println(jumsu);
//		int max = jumsu.get(jumsu.size()-1);

//		System.out.println(max);
//		for(int i = 0; i <jumsu.size();i++) {
//			System.out.print(i+"번 학생의 성적은 "+jumsu.get(i)+"이며 등급은 ");
//			
//		}
//		
//		
		// 람다식 사용하여 배열 출력
		jumsu.forEach(e -> System.out.println(e));

	}

}