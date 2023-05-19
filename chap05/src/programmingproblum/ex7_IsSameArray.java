package programmingproblum;

public class ex7_IsSameArray {

	public static void main(String[] args) {
		
		int [] a = {3,2,4,1,5};
		int [] b = {3,2,4,1};
		int [] c = {3,2,4,1,5};
		int [] d = {2,7,1,8,5};
		boolean answer1 = isSame(a,b);
		boolean answer2 = isSame(c, d);
		boolean answer3 = isSame(a, c);
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		printSame(isSame(a,b));
	}
	public static boolean isSame(int[] is,int[] is2){
		boolean answer = false;
		if(is.length == is2.length) {
			for(int i = 0;i<is.length;i++) {
				if(is[i]!=is2[i]) {
					return false;
				}else {
					answer = true;
				}
			}
		}
		return answer;
	}
	
	public static void printSame(boolean isSame) {
		if(isSame == true)
			System.out.println("같습니다");
		else
			System.out.println("다릅니다");
	}
}
