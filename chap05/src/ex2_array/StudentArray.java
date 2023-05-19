package ex2_array;

public class StudentArray {

	public static void main(String[] args) {
		Ex4_Student[] s = new Ex4_Student[3];
		s[0] = new Ex4_Student(1000, "james");
		s[1] = new Ex4_Student(1001, "tomas");
		s[2] = new Ex4_Student(1002, "edward");
		
		for(int i=0; i<s.length;i++) {
			s[i].showStudentInfo();
		}
		
		for(Ex4_Student a : s) {
			a.showStudentInfo();
		}
	}

}
