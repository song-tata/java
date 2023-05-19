package arraylist;

public class Student {
	private static int serialNum = 0000;
	private String name;
	private int stuNum;
	
	public Student() {
	}
	public Student(String name) {
		this.name = name;
		
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public String getName() {
		return name;
	}

	public int getStuNum() {
		return stuNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	
	//출력 스타일 지정 메서드
	public void showInfo() {
		System.out.println("[" + stuNum + " , " + name + "]" );
	}

	
}
