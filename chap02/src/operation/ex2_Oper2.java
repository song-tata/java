package operation;

public class ex2_Oper2 {

	public static void main(String[] args) {
		int a = 10, b = 8;
		boolean result = a > b;
		System.out.println(result);// true
		
		result = a == b;
		System.out.println(result);//false
		
		// 논리 연산
		// &&, ||, ! 
		System.out.println(!true); // false
		
		int age = 35;
		result = age >= 20;
					//조건식? 연산1:연산2 >> 조건 true :연산1 , 조건 false : 연산2
		String r = result? "성인":"미성년";
		//String r = age >= 20? "성인":"미성년";
		System.out.println(r);
		
		
		
	}

}
