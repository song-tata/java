package ex2_interface.q2;

public class Main {
	
	public static void main(String[] args) {
		MyCalc calc1 = new MyCalc();
		
	
		System.out.println(calc1.add(1, 5));
		System.out.println(calc1.divide(5, 0));
		System.out.println(calc1.substract(60, 4));
		System.out.println(calc1.multi(2, 3));
		System.out.println(calc1.divide(6, 1));
		System.out.println(calc1.square(3));
		ArrayCalc arr = new ArrayCalc();
		
		int[] a = {1,3,5,7};
		
		arr.arrayadd(a);
		System.out.println(arr.arrayadd(a));
	}
}
