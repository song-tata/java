package oop3;

public class Student3 {
	public String name;
	public int grade;
	public int money;
	
	public Student3() {
		
	}
	public Student3(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1250);
		this.money -= 1250;
	}
	public void showInfo() {
		System.out.println(name+"의 남은 돈은 "+money);
	}
	
}
