package oop3;

public class Bus {
	public int busNum;
	public int passenger;
	public int income;

	public Bus() {
		
	}
	
	public Bus(int busNum) {
		this.busNum= busNum;
	}
	
	public void take(int income) {
		passenger++;
		this.income += income;
	}
	
	public void showInfo() {
		System.out.println("버스: "+busNum+"번의 승객은"+passenger+"명이고 수입은 "+income+"원 입니다");
	}
}
