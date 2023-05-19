package ex2_array;

public class Ex2_IntArray {

	public static void main(String[] args) {
		//배열 선언 방식 총 3가지
		int[] arr1 = new int[10];
		int arr2[] = new int[10];
		int[] numbers = {10,20,30};
		
		//향상된,개선된 for문: 배열에서 사용
		
		for(int a : numbers) {
			System.out.println(a);
		}
		
		int cnt = 0;
		double[] arr3 = new double[5];
		arr3[0] = 1.1;
		cnt++;
		arr3[1] = 2.2;
		cnt++;
		arr3[2] = 3.3;
		cnt++;
		
		double sum = 0;
		
//		for(double a:arr3) {
//			
//			System.out.println(a);
//		}
		for(int i = 0; i < cnt; i++) {
			sum += arr3[i];
			System.out.println(sum);
		}
	}

}
