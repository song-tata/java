package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		boolean run = true;
		Scanner input = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
		
		while(run) {
			System.out.println("메뉴 선택");
			System.out.println("1.학생추가 2.학생삭제 3.종료");
			int menu = input.nextInt();
			if(menu == 1) {
				//학생추가(학번 자동생성,이름 입력받아 배열에 저장)
				System.out.print("학생 이름: ");
				String name = input.next();
				students.add(new Student(name)); 
				
			}else if(menu == 2) {
				//학생삭제(이름 입력받은 후 배열에 이름 있으면 삭제)
				System.out.print("학생 이름: ");
				String name = input.next();
				boolean isHas = false;
				
				for(Student s : students) {
					if(s.getName().equals(name)) {
					isHas = true;
					break;
					}
				}
				if(isHas) {
					for(Student s : students) {
						if(s.getName().equals(name)) {
							students.remove(s);
							break;
						}else {
							System.out.println("없는 학생입니다.");
							}
					}
				}
			}
			else if (menu == 3) {
				run = false;
			}else {
				System.out.println("메뉴는 1~3중에 골라주세요");
	}
		
		
	
	for(Student s : students) {
		s.showInfo();
	}
	

		}
	}
}
