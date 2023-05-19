package chap03_exem;

public class ex5_Pita {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		for(a=1; a<=20; a++) {
			for(b=1;b<=20;b++) {
				for(c=1;c<=20;c++) {
					if(a*a+b*b == c*c && a + b + c <= 20) {
						System.out.println(a+","+b+","+c);
					}
				}
			}
		}
		
		
		
		
	}

}
