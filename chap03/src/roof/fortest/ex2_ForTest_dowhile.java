package roof.fortest;
/*
 * 사용자에게 자연수 입력받기
 * 그 자연수가 소수인지, 합성수인지를 알려주고
 * 합성수라면 약수의 갯수가 몇개인지를 알려준다.
 */

import java.util.Scanner;

public class ex2_ForTest_dowhile {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int num,yaksu;
		
		do {
				System.out.println("자연수 입력");
				num = x.nextInt();
				yaksu = 0;
				
				
					for(int i=1;i<=num; i++) {
						if(num%i==0) {
							yaksu++;				
						}
					}
					
					if (yaksu == 2) {
						System.out.println("입력한 숫자는 소수입니다.");
					}else if(yaksu > 2) {
						System.out.println("입력한 숫자는 합성수입니다. 약수의 갯수는 "+yaksu+"입니다.");
					}
					
				}while(num>0);
			System.out.println("음수를 입력하셨습니다. 프로그램 종료");
	}
	
}	
