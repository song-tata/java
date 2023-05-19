package ex1_string;

public class Ex3_Equals {

	public static void main(String[] args) {
		String var1 = "정한기";
		String var2 = "정한기";
		
		var2 = "이호영";
		
		if(var1 == var2) {
			System.out.println("var1과 var2 참조가 같다");
		}else {
			System.out.println("var1과 var2 참조가 다르다");
		}
		
		if (var1.equals(var2)) {
			System.out.println("var1과 var2 문자열 같다");
		}else {
			System.out.println("var1과 var2 문자열 다르다");
		}
	}

}
