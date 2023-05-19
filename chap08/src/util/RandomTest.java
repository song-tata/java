package util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random jo = new Random();
		System.out.println(jo.nextInt(3)+1+"조");
				
		//로또(1~45); + 6개의 숫자
		int[] lotto = new int[6];
		int[] sort = new int[6];
		Random n = new Random();
		boolean over = true;
		System.out.println("로또 번호 출력");
//		lotto[0] = n.nextInt(6)+1;
		
		for(int i = 0; i<lotto.length; i++) {
			System.out.println("i: "+i);
			over = true;
			int num = n.nextInt(6)+1;
			for(int j = 0; j<i; j++) {
				if(lotto[j]==num) {
					i--;
					over = false;
					break;
				}
			}
			if(over) {
				lotto[i] = num;
			}
		}
		
		for(int i : lotto) {
			System.out.print(i);
		}
		System.out.println(Arrays.toString(lotto));
		
	}

}
