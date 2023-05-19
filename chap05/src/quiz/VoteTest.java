package quiz;

import java.util.Scanner;

public class VoteTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("후보자 수입력");
		int personnel = in.nextInt();
		
		int[] freq = new int[personnel];
		int candidate;// 투표번호 저장
		
		do {
			System.out.println("투표 번호 선택: ");
			candidate = in.nextInt();
			if(candidate<0)
				break;
			else if(candidate>personnel){
				System.out.printf("후보자 : %d ~ %d\n",1,personnel);
			}else {
				freq[candidate-1] +=1 ;
				System.out.printf("%d번 투표 완료\n",candidate);
			}
		}while (personnel != 0);
		
		System.out.println("---- 득표 결과 ----");
		System.out.println("   번호      득표수");
		System.out.println("-------------------");
		int idx = 1;
		for(int i : freq) {
			System.out.printf("%4d %10d\n", idx++, i);
		}
	}
	

}
