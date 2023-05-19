package condition.switchtest;

public class ex2_Grade {

	public static void main(String[] args) {
		int jumsu = 0;
		char grade;
		
		switch(jumsu/10) {
		case 10:
		case 9:
			grade ='A';
			break;
		case 8:
			grade ='B';
			break;
		case 7:
			grade ='C';
			break;
		case 6:
			grade ='D';
			break;
		default:
			grade = 'F';
			
		}
		System.out.println("당신의 학점은 "+ grade);
	}

}
