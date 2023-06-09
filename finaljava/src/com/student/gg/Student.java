package com.student.gg;

import java.io.FileWriter;
import java.util.Scanner;

import com.manager.gg.User;
import com.school.jrin.Meal;
import com.school.jrin.Settings;

public class Student implements User {

	Scanner in = new Scanner(System.in);

	@Override
	public int login() {

		return 0;
	}

	public void showLunchList() {
		System.out.println("이번 주 식단입니다.");
		System.out.println("=".repeat(30));
		System.out.println(" ".repeat(3) + "월" + " ".repeat(3) + " ".repeat(3) + "화" + " ".repeat(3) + " ".repeat(3)
				+ "수" + " ".repeat(3) + " ".repeat(3) + "목" + " ".repeat(3) + " ".repeat(3) + "금" + " ".repeat(3));

		for (Meal m1 : Settings.setLunch) {
			System.out.printf("3%s %9s %15s %21s %27s\t\n", m1.getRice(), m1.getSoup(), m1.getMain(), m1.getSide(),
					m1.getKimchi());
		}
	}

	public void setFeedback() {
		
		boolean flag = true;
		String yesOrNo;
		while (flag) {
			System.out.println("학생 여러분께 올림!");
			System.out.println("우리 학교 급식에 바라는 점을 적어주세요!");
			String feedback = in.next();

			try (FileWriter fw = new FileWriter("StudentFeedback.txt")) {
				fw.write(feedback);

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("더 바라는 점이 있으신가요?Y/N");
			yesOrNo = in.next();
			if (yesOrNo.toUpperCase().equals("Y")) {
				flag = true;

			} else if (yesOrNo.toUpperCase().equals("N")) {
				flag = false;
				System.out.println("소중한 의견 감사합니다!");

			} else {
				System.out.println("잘못 입력하셨습니다. 종료합니다.");
				flag = false;
			}
		}
	}
	public void showMenu() {
		System.out.println("=".repeat(60));
		System.out.println("".repeat(20)+"학생 메뉴입니다.");
		System.out.println("=".repeat(60));
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 우리 학교의 식단보기");
		System.out.println("2. 우리 학교 피드백작성");
		System.out.println("3. 상위 메뉴로 이동하기");
	}
	
	public void main() {
		boolean run = true;

		int menu;

		while (run) {
			showMenu();
			menu = in.nextInt();

			switch (menu) {
			case 1:
				showLunchList();
				break;
			case 2:
				setFeedback();
				break;

			case 3:
				System.out.println("학생 메뉴를 종료합니다.");
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}

	
	}

}
