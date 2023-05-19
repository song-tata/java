package oop2;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		int an=kor+eng+math;
		
		return an;
	}
	public float getAverage() {
		int an = (kor+eng+math)/3;
		
		return an;
		
	}
}
