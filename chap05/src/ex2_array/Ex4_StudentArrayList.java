package ex2_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_StudentArrayList {
	public static void main(String[] args) {
//	Ex4_Student[] s1 = new Ex4_Student[3];
//	s1[0] = new Ex4_Student(1000, "james");
//	s1[1] = new Ex4_Student(1001, "tomas");
//	s1[2] = new Ex4_Student(1002, "edward");
//	
//	ArrayList<Ex4_Student> s = new ArrayList<>();
//	s.add(s1[0]);
//	s.add(s1[1]);
//	s.add(s1[2]);
//	
//	System.out.println(s);
//	for(Ex4_Student a : s) {
//		a.showStudentInfo();
//	}
	
//	Ex4_Student s1 = new Ex4_Student();
//	Ex4_Student s2 = new Ex4_Student();
//	Ex4_Student s3 = new Ex4_Student();
//	
//	s1 = new Ex4_Student("james");
//	s2 = new Ex4_Student("tomas");
//	s3 = new Ex4_Student("edward");
//	
//	ArrayList<Ex4_Student> s = new ArrayList<>();
//	s.add(s1);
//	s.add(s2);
//	s.add(s3);
//	
//	System.out.println(s);
//	for(Ex4_Student a : s) {
//		a.showStudentInfo();
//	}
	Ex4_Student student = new Ex4_Student();
	Scanner in = new Scanner(System.in);
	ArrayList<Ex4_Student> s = new ArrayList<>();
	
	
	
	while(true) {
		System.out.println("메뉴");
		System.out.println("1.학생 추가 2.학생 확인 3. 종료");
		int a = in.nextInt();
		
		if(a == 3) {
			System.out.println("시스템종료");
			break;
		}else if (a == 1) {
			System.out.println("학생명: ");
			String name = in.next();
			student = new Ex4_Student(name);
			s.add(student);
			continue;
		}else if(a == 2) {
			for(Ex4_Student c: s) {
				c.showStudentInfo();
				continue;
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
			continue;
		}
		
	}
}
}