package ex2_array;

public class Ex1_CharArray {

	public static void main(String[] args) {
		//array 선언과 초기화
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i< alphabets.length; i ++) {
			alphabets[i] = ch++;
		}
//		System.out.println(alphabets);
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i]);
		}
		//향상된 for문
		for(char alpha : alphabets) {
			System.out.println("향상된"+alpha);
		}
	}
	

}
