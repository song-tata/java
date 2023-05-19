package variable_type.vartype;

public class ex4_vartype {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i+j);
		System.out.println(j);
		System.out.println(str+j);
		
		str = "test";
			
		j = 5;
		//전역 변수
		int v1 = 15;
		int v2 = 0;
		if(v1>10) {
			// 지역변수
			//int v2;
			v2 = v1 - 10;
		}
		int v3 = v1+v2;
		
		System.out.println(v3);
		
		for(int a=0;a<1;a++) {
			int v4 = 0;
			v4 += 10;
			System.out.println(v4);
		}
		//{} 블록 내에서 선언한 변수는 블록 밖에서 사용이 불가능
		//VarialbeScope 변수 범위
		//System.out.println(v4);
	}
	
}
