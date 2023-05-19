package oop2student;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	public MyDate() {
		
	}
	public MyDate(int a, int b, int c) {
		setDay(a); 
		setMonth(b);
		setYear(c);
		
	}
	
	public boolean isValid() {
		isValid = (day > 28 || day < 1) && (month < 1 || month > 12);
		if(isValid) {
			System.out.println("유효하지않은 날짜입니다.");
		}else {
			System.out.println("유효한 날짜입니다.");
		}
		return isValid;
	}
		
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
