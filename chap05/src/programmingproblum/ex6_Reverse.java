package programmingproblum;

public class ex6_Reverse {

	public static void main(String[] args) {
		int a1[] = {4,3,2,1};
		int answer[] = new int[a1.length];
		
		answer = reverse(a1);
		for(int a2 : answer ) {
			System.out.println(a2);
		}
	}
//	public static int[] reverse(int[] org) {
//		int a[] = new int[org.length];
//		
//		for(int i = 0 ; i<=org.length;i++) {
//			a[i] = org[(org.length - i - 1)];
//									
//		}
//		return a;
//	}
	public static int[] reverse(int[] org) {
		int a[] = new int[org.length];
		
		for(int i = 0, j = org.length-1; i < org.length; i++,j-- ) {
			a[i] = org[j];
		}
		return a;
		
	}
}
