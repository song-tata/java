package practis;

public class PaperNo7_8 {

	public static void main(String[] args) {

		int[] arr = {1,5,3,8,2};
		int a=0;
		for(int i = 0; i<arr.length;i++) {
			if(a<arr[i]) {
				a = arr[i];
			}
		}
		System.out.println(a);
		
		int arr2[][] = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		a=0;
		for(int i = 0;i<arr2.length;i++) {
			for(int j = 0; j<arr2[i].length;j++) {
				a += arr2[i][j];
			}
		}
		System.out.println(a);
		a=0;
		for(int[] j : arr2) {
			for(int y : j) {
				a += y;
			}
		}
		System.out.println(a);
		
		
	}
	
	

}
