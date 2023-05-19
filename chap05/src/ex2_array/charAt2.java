package ex2_array;

public class charAt2 {

	public static void main(String[] args) {
		char a = 'a';
		System.out.println((int)a);
		
		char smallalp[] = new char[26];
		char[][] alphabets = new char[13][2];
		
		for(int i = 0; i < alphabets.length;i++) {
			for(int j = 0; j<alphabets[i].length;j++) {
				alphabets[i][j] = a++;
				System.out.print(alphabets[i][j]+" ");
			}
			System.out.println();
		}
//		
//			for(int i = 97;i<97+26;i++) {
//				System.out.print((char)i);
//		
				
//					System.out.println(smallalp);
//					if(a%2==1) {
//						System.out.println();
//					}
//				}
		char ch = 'a';
		for(int i = 0; i<smallalp.length;i++){
			smallalp[i] = ch++;
			}		
		for(char b:smallalp) {
			System.out.print(b);
			if(b%2 == 0){
				System.out.println();
				}
			}
	}
}
	
	
	
	

