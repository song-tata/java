package chap03_exem;
/*
 * 별을 반복해서 찍을거야
 * 반복문이 자리를 만들도록 해야하나?
 * 반복문이 1일때 하나
 * 2일때 2개
 * 3일때 3개
 * 
 */

public class ex4_StarTree {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
		System.out.println();
		}
	}
}
