package function;

import java.util.Scanner;

public class FunctoinTest {
	static int n1;
	static int n2;
	
	public static void main(String[] args) {
	
		int a1;
		int a2;
		int calculater;
		
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("메뉴 선택 : 1. 덧셈 2. 뺄셈 3. 나눗셈 4. 곱셈 5. 종료");
			calculater = in.nextInt();
			if(calculater == 5) {
				System.out.println("계산기 종료");
					break;	
					}
			
			System.out.println("두 숫자 입력");
			
			a1 = in.nextInt();
			a2 = in.nextInt();
			
			if(calculater<5) {
				switch (calculater) {
				case 1:
					add(a1,a2);
					break;
				case 2:
					minus(a1,a2);
					break;
				case 3:
					division(a1, a2);
					break;
				case 4:
					multiful(a1, a2);
					break;				
				}
				continue;
			}
			else if(calculater > 5) {
				System.out.println("다시 입력하세요");
				continue;
			}
		
		}
		
//		System.out.println("나눗셈의 답: "+answer);
		
		
		
	}
	
	public static void add(int a1, int a2) {
		int answer=0;
		answer = a1+a2;
		System.out.println("덧셈의 답: "+answer);
	}
	
	public static void minus(int a1, int a2) {
		int an = a1-a2;
		System.out.println("뺄셈의 답: "+an);
	}
	
	public static void division(int a1, int a2) {
		int an = 0;
		an = a1/a2;
		System.out.println("나눗셈의 답 :"+an);
	
		int rem = remainder(a1,a2);
		
		if(rem != 0) {
			System.out.printf("나머지는 %d입니다\n",rem);
		}else if(rem == 0) {
			System.out.println("나머지는 0입니다.");
		}
	}
	
	public static int remainder(int a1, int a2) {
		int an;
		an = a1%a2;
		return an;
	}
	
	public static void multiful(int a1, int a2) {
		int an = a1*a2;
		
		System.out.println("곱셈의 답: "+an);
	}
}
