package Generics;

public class ex2_ProductTest {

	public static void main(String[] args) {
		//k는 TV, M은 String으로 대체
		ex2_Product<ex2_TV, String> product1 = new ex2_Product<>();
		
		//Setter (설정자) 매개값을 반드시 지정할것.
		product1.setKind(new ex2_TV());
		product1.setModel("스마트 TV");
		
		//getter(접근자) 사용하여 값 리턴
		System.out.println(product1);
		
		ex2_Product<String, String> product2 = new ex2_Product<>();
		
		product2.setKind("Car");
		product2.setModel("람보르기니");
		System.out.println(product2);
	}

}
