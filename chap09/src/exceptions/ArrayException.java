package exceptions;

public class ArrayException {

	public static void main(String[] args) {
		int[] a = new int[6];
		String[] array = {"java","pathon","100","12"};
		
		for(int i = 0; i < 8; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println(array[i]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스가 초과됨.");
				System.out.println(e.getMessage());
			}catch (NumberFormatException e) {
			System.out.println("숫자 변환 불가");
			System.out.println(e.getMessage());
			}catch (Exception e) {
				System.out.println("실행 문제 있음.");
				e.printStackTrace();
			}
		}
	}

}
