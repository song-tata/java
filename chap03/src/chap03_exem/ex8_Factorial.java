package chap03_exem;

public class ex8_Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		
	}
	static int factorial(int n) {
		int answer = 1;
		for(int i=1;i<=n;i++) {
			answer *= i; 
			}
		return answer;
		
	}

	static int switchFactorial(int n) {
		int answer = 0;
		switch (n) {
		case 0:
		case 1:
			return 1;
		default:
			return n*switchFactorial(n-1);
//			for(int i=1;i<=n;i++) {
//				answer *= i; 
//			}
//			break;				
		}
//		return answer;
	}
}
