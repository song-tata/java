package operation;

public class ex3_ShortCircuit {

	public static void main(String[] args) {
		int num = 10;
		int i = 2;
		// 단락 회로 평가
		//&&(and) 연산식1의 결과가 false 라면 뒤 연산식은 실행x
		//||(or) 연산식 1의 결과가 true라면 뒤 연산식은 실행x
		boolean value = ((num = num+10) < 10) && ((i=i+2) < 10);
		System.out.println(num);//20
		System.out.println(i); //2
		System.out.println(value);
		
		value = ((num = num+10) < 10) || ((i=i+2) < 10);
		System.out.println(num);
		System.out.println(i);
		System.out.println(value);
	}

}
