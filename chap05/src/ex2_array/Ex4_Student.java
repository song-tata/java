package ex2_array;

public class Ex4_Student {
	static int ID = 1000 ;
	String name;
	int stuNum;
	
	public Ex4_Student() {
		}
	public Ex4_Student(String name) {
		this.stuNum = ID;
		ID++;
		setName(name);
	}
	
	
	public void showStudentInfo() {
		System.out.printf("%d, %s\n",this.stuNum,this.name);
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
}

