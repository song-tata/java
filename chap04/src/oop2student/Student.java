package oop2student;



public class Student {
	int id;
	String name;
	
	Subject math;
	Subject korean;
	
	public Student() {
		korean = new Subject();
		math = new Subject();
	}
	public void inputKorean(String a,int b) {
		korean = new Subject(a);
		
		korean.score = b;
	}
	
}
