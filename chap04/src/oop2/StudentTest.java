package oop2;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 70;
		System.out.println("이름: "+s.name);
		System.out.println("점수의 합: "+s.getTotal());
		System.out.println("평균: "+s.getAverage());
	}

}
