package oop3;

public class Subway {
	public String lineNum;
	public int passenger;
	public int income;
	
	
	public Subway() {
		
	}
	
	//버스 번호를 받는 생성자 만들기
	
	public Subway(String lineNum) {
		this.lineNum = lineNum;
	}
	
	//돈을 받았을 때 버스의 수입 증가, 승객 수 증가 메소드 만들기
	
	public void take(int income) {
		passenger++;
		this.income += income;
	}
	
	//정보 출력 메소드도 클래스 내부에서 만들어짐.
	
	public void showInfo() {
		System.out.println("버스: "+lineNum+"호선 승객은"+passenger+"명이고 수입은 "+income+"원 입니다");
		
	}
	
}
