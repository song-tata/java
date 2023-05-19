package testfile;

public class why {

	public static void main(String[] args) {
		int i = 0;
		
		while(true) {
			i++;
			if(i%10 == 3) {
				System.out.print(i);
				System.out.println();				
			}
			if(i>74) {
				break;
			}
		
		}
	}

}
