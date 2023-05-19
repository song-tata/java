package practis;

import java.util.Scanner;

public class PaperNo9 {

	public static void main(String[] args) {
		int menu;
		int i = 0;//학생수
		
		int stuNum[] = new int[100];
		int highestScore = 0;
		double avg = 0;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료 ");
			System.out.print("선택>");
			menu = in.nextInt();
			
			System.out.println(i);
			switch (menu) {
			case 1:
				System.out.println("학생수>");
				i = in.nextInt();
				break;
			case 2:
				
				for(int j = 0; j<i; j++) {
					System.out.printf("score[%d]>",j);
					int score = in.nextInt();
					stuNum[j] = score;
				}
				break;
			case 3:
				for(int j = 0;j<i; j++) {
					System.out.printf("score[%d]: %d\n",j,stuNum[j]);
				}
				break;
			case 4:
				for(int j = 0;j<i; j++) {
					avg += stuNum[j];
					if(highestScore < stuNum[j]) {
						highestScore = stuNum[j];
					}
				}
				System.out.printf("최고 점수: %d\n",highestScore);
				System.out.printf("평균: %f\n",avg/i);
				break;
			
			case 5:
				System.out.println("시스템 종료");
				return;
		
			}
			}
		}
	}


