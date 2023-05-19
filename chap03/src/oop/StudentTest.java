package oop;

public class StudentTest {

	public static void main(String[] args) {
		Students stu1 = new Students(123,"suzy",6);
		String info = stu1.selfIn();
		System.out.println(info);
		
		Students zysu = new Students(1234, "zysu", 3);
//		String inf = ;
		System.out.println(zysu.selfIn());
	}

}
