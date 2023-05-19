package practis;

public class JavaProgramming {

	public static void main(String[] args) {
		String s = "Java Programming";
		String answer ="";
		int cnt=0;
		answer = s.substring(2, 5);
		
		System.out.println(answer);
		
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i)=='r') {
				cnt++;
			}
		}
		System.out.printf("r의 갯수: %d\n",cnt);
	}
	
	
}
