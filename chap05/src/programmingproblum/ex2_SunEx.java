package programmingproblum;

public class ex2_SunEx {

	public static void main(String[] args) {
		System.out.println();
	}
//
//	public static int sumExceptFirst(int...is) {
//		int sum = 0;
//		
//		for(int i =1;i<is.length;i++ ) {
//			sum = is[i];
//		}
//		return sum;
//		
//		
//	}
	public static int sumExceptFirst(int i, int...is) {
		int sum = 0;
		for(int v: is) {
			sum+=v;
		}
		return sum;
	}
}
