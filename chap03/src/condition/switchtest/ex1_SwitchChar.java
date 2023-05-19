package condition.switchtest;

public class ex1_SwitchChar {

	public static void main(String[] args) {
		char grade ='B';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("최우수회원");
			break;
		case 'B' :
			System.out.println("우수회원");
			break;
		case 'C' :
			System.out.println("일반회원");
			break;
		

		default:
			System.out.println("비회원");
			
		}
	}

}
