package oop;

public class Student {
	int studentId;
	String name;
	int grade;
	String adress;
	
	public String getName() {
		//예외처리가 되기때문에 메소드로 사용
		return name;
	}
	public void setName(String n) {
		name = n;
		
	}
}
