package oop;

public class Students {
	//students 멤버 변수(필드)
	int stuNum;
	String stuName;
	int grade;
	
	public Students(int stuNum, String stuName, int grade) {
		this.stuNum =stuNum;
		this.stuName = stuName;
		grade = grade;
	}
	//students 메소드
	
	public String selfIn() {
		return "학번은 "+stuNum +"이름은 "+stuName+" 학년은 "+grade+"입니다.";
	}
}
