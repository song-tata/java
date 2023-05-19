package practis;

public class ArrrTest {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println();
			for(int j = 0; j< arr.length; j++) {
				if(i==j) {
					arr[i][j] = 1;
				}else {
					arr[i][j] = 0;
				}
				System.out.print(arr[i][j]);
			}
		}
		
		for(int[] i : arr) {
			for(int y : i) {
				System.out.println(y);
			}
			System.out.println();
		}
	}	

}
