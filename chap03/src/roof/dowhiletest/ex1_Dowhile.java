package roof.dowhiletest;

public class ex1_Dowhile {
	public static void main(String[] args) {
		
		final int LIMIT = 10;
		int i = 1;
		
		while(i<=LIMIT) {
			System.out.println(i);
			i++; //n += 1;
		}
		
		i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i <= LIMIT); // 세미콜론 찍어야댐 
		}

}
