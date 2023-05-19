package com.manager.gg;

import java.io.FileReader;
import java.util.Scanner;

import com.school.jrin.Meal;
import com.school.jrin.School;
import com.school.jrin.Settings;

public class Admin implements IAdmin, User {

	public Admin() {
	}

	Scanner in = new Scanner(System.in);

	public void adddummy() {
		School.lunch.add(new Meal("흑   미   밥", "시래기된장국", "너 비  아 니", "시금치 무침", "깍   두   기"));
		School.lunch.add(new Meal("잡   곡   밥", "김 치  찌 개", "오징어불고기", "계 란 말 이", "배 추  김 치"));
		School.lunch.add(new Meal("검 은  콩 밥", "선   지   국", "제 육  볶 음", "무 말 랭 이", "겉   절   이"));
		School.lunch.add(new Meal("현   미   밥", "소고기  무국", "닭   강   정", "어 묵 볶 음", "볶 음  김 치"));
		School.lunch.add(new Meal("흰   쌀   밥", "토   란   국", "돈   까   스", "계란 후라이", "백   김   치"));
	}

	@Override
	public void addMeal() {
		String soup;
		String rice;
		String kimchi;
		String side;
		String main;

		System.out.println("메뉴 추가");
		System.out.print("국 > ");
		soup = in.next();
		System.out.print("밥 > ");
		rice = in.next();
		System.out.print("김치 > ");
		kimchi = in.next();
		System.out.print("사이드 > ");
		side = in.next();
		System.out.print("메인 > ");
		main = in.next();

		Meal m1 = new Meal(rice, soup, main, side, kimchi);
		School.lunch.add(m1);
	}

	@Override
	public void delMeal(String main) {
		boolean flag = true;

		while (flag) {
			System.out.printf("%s 가 들어간 식단을 삭제합니다\n", main);
			if (isContain(main)) {
				System.out.println("삭제 하시겠습니까? Y/N");
				String menu = in.next();
				if (menu.toUpperCase().equals("Y")) {
					for (Meal m1 : School.lunch) {
						if (m1.getMain().equals(main)) {
							School.lunch.remove(m1);
							break;
						}
					}
					System.out.println("삭제 완료");
					flag = false;
				} else if (menu.toUpperCase().equals("N")) {
					System.out.println("상위 메뉴로 돌아갑니다.");
					flag = false;
				}
			} else {
				System.out.println("같은 메뉴가 없습니다.");
				flag = false;
			}
		}
	}

	public boolean isContain(String main) {
		boolean isContain = false;
		for (Meal m : School.lunch) {
			if (m.getMain().equals(main)) {
				isContain = true;
				break;
			}
		}
		return isContain;
	}

	Settings s = new Settings();

	@Override
	public void setLunch() {
		s.setLunch();
	}

	@Override
	public void copyLunch() {
		s.copyLunch();
	}

	@Override
	public void checkFeedback() {
		try (FileReader fr = new FileReader("StudentFeedback.txt")) {
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("아무 키나 입력하면 이전 메뉴로 돌아갑니다.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine(); // 사용자 입력 대기
	}

	@Override
	public void showSetLunch() {
		System.out.println("이번 주 식단입니다.");
		System.out.println("=".repeat(76));
		System.out.printf("%6s %14s %14s %14s %14s\n","월","화","수","목","금");
		System.out.println("=".repeat(76));
		for(Meal m1: Settings.setLunch) {
			System.out.printf("%s\t",m1.getRice());
		}
		System.out.println();
		for(Meal m1: Settings.setLunch) {
			System.out.printf("%s\t",m1.getSoup());
		}
		System.out.println();
		for(Meal m1: Settings.setLunch) {
			System.out.printf("%s\t",m1.getMain());
		}
		System.out.println();
		for(Meal m1: Settings.setLunch) {
			System.out.printf("%s\t",m1.getSide());
		}
		System.out.println();
		for(Meal m1: Settings.setLunch) {
			System.out.printf("%s\t",m1.getKimchi());
		}
		System.out.println();
		System.out.println("아무 키나 입력하면 이전 메뉴로 돌아갑니다.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine(); // 사용자 입력 대기
	
	}
	@Override
	public int login() {

		return 1;
	}

	public void showLunch() {
		for (Meal m1 : School.lunch) {
			System.out.printf("%s %s %s %s %s\t\n", m1.getRice(), m1.getSoup(), m1.getMain(), m1.getSide(),
					m1.getKimchi());
		}
	}

	public void submenu() {
		boolean flag = true;

		while (flag) {
			System.out.println("1.하루 식단 추가 2.하루 식단 삭제 3. 상위 메뉴로 이동");
			int submenu = in.nextInt();

			if (submenu == 1) {
				addMeal();
			} else if (submenu == 2) {
				showLunch();
				System.out.println("삭제할 식단의 메인 메뉴를 골라주세요.");
				String main = in.next();
				delMeal(main);
			} else if (submenu == 3) {
				System.out.println("상위 메뉴로 이동합니다.");
				return;
			} else
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
		}

	}

	public void setsubmenu() {
		boolean flag = true;

		while (flag) {
			System.out.println("식단 만들기 메뉴입니다.");
			System.out.println("1.식단 생성 2.랜덤 식단 생성 3. 상위 메뉴로 이동");
			int submenu = in.nextInt();

			if (submenu == 1) {
				System.out.println("=".repeat(76));
				copyLunch();
				System.out.println("=".repeat(76));
			} else if (submenu == 2) {
				System.out.println("=".repeat(76));
				setLunch();
				System.out.println("=".repeat(76));
			} else if (submenu == 3) {
				System.out.println("상위 메뉴로 이동합니다.");
				return;
			} else
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
		}

	}

	public void showMenu() {
		System.out.println("=".repeat(60));
		System.out.println(" ".repeat(20)+"관리자 메뉴입니다.");
		System.out.println("=".repeat(60));
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 학교의 식품 관리하기");
		System.out.println("2. 일주일 식단 생성하기");
		System.out.println("3. 일주일 식단 조회하기");
		System.out.println("4. 학생 피드백 조회하기");
		System.out.println("5. 상위 메뉴로 이동하기");
	}

	public void main() {
		boolean run = true;
		
		int menu;

		while (run) {
			showMenu();
			menu = in.nextInt();
			
			switch (menu) {
			case 1:
				submenu();
				break;
			case 2:
				setsubmenu();
				break;

			case 3:
				showSetLunch();
				break;

			case 4:
				checkFeedback();
				break;

			case 5:
				System.out.println("관리자 메뉴를 종료합니다.");
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}

	}
}
