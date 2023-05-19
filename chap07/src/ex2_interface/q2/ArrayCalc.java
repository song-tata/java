package ex2_interface.q2;



public class ArrayCalc extends MyCalc {
	
	public int arrayadd(int[] a) {
		int answer = 0;
		for(int b : a) {
			answer += b;
		}
		return answer;
	}
}
