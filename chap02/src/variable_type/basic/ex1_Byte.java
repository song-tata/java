package variable_type.basic;

public class ex1_Byte {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = 127;
		//byte var3 = 128; 컴파일에러 발생
		System.out.println(var1-1);
		System.out.println(var2+1);
		
		long l1 = 1000000000000000l;
		long l2 = 1111111111111111L;
		System.out.println(l1);
		System.out.println(l2);
		
		float f1 = 3.141592f;//f,F 상관없음. 명시만 제대로!
		
		System.out.println(f1);
		
		char c1 = 'a';
		String c2 = "b";
		System.out.println(c2);
	}

}
