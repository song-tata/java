package oop;

public class StudentTest {

	public static void main(String[] args) {
		//자료형 > 클래스
		Student stu1 = new Student();
		stu1.studentId = 123;
		stu1.setName("u lang");
		
		Student stu2 = new Student();
		stu2.name = "lang u";
		
		
		System.out.println(stu1.studentId);
		System.out.println(stu1.getName());
		
		System.out.println(stu2.name);
		
	}

}
