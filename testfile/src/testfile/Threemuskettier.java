package testfile;

public class Threemuskettier {
	public static int solution(int[] number) {
		int answer = 0;
		
		for(int i= 0; i<number.length;i++) {
			for(int j = 1; j<number.length-1;i++) {
				for(int k = 2; k<number.length-2;k++) {
					if(number[i]+number[j]+number[k]==0) {
						answer++;
					}
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] a = {-2,3,0,2,-5};
		solution(a);
	}

}
