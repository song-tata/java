package oop2student;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(3, 2, 2000);
		System.out.println(date2.isValid());
	}

}
