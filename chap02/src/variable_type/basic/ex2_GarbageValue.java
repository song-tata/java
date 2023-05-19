package variable_type.basic;

public class ex2_GarbageValue {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1 : "+var1+"\t vat2 : "+var2);
		}
	}
	// 논리적으로 오류가 있는 값들을 가비지값이라고 한다!
}
