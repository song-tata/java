package com;

import java.util.Scanner;

import com.manager.gg.Admin;
import com.student.gg.Student;

public class Main {

	public static void main(String[] args) {
		Admin a = new Admin();
		Student s = new Student();
		Scanner in = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("-".repeat(40));
			System.out.println("환영합니다 우리 학교 급식 사이트입니다.");
			System.out.println("-".repeat(40));
			System.out.println("1.관리자 메뉴 2.학생 메뉴 3.시스템 종료");
			System.out.print(" > ");
			int menu = in.nextInt();
			switch (menu) {
			case 1:
				a.main();
				break;
			case 2:
				s.main();
				break;
			case 3:
				System.out.println("시스템을 종료합니다. 이용해주셔서 감사합니다.");
				return;
			default:
				break;
			}
		}
	}

}
