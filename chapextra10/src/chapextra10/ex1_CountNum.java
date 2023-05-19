package chapextra10;

public class ex1_CountNum {

	public static void main(String[] args) {
//		oneToTwenty(20);
		count(8,6);
		count(1,3);
	}
	
	public static void oneToTwenty(int n) {
		if(n>1) {
			oneToTwenty(n-1);
		}
		System.out.println(n);
	}
	public static void count(int a, int b) {
		if(a<b) {
			if(a<b) {
				count(a,b-1);
			}
			System.out.println(b);
		}else{
			if(a>b) {
				count(a-1,b);
			}
			System.out.println(a);
		}
		
	}
}
