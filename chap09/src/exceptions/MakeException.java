package exceptions;

public class MakeException {

	public static void main(String[] args) {
		try {
			김밥천국("김밥");
			김밥천국("초밥");
		} catch (FoodException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("음식 주문 프로그램 정상 종료");
	}
	
	public static void 김밥천국(String food) throws FoodException{
		if(food.equals("김밥")) {
			System.out.println("주문성공");
		}else {
			throw new FoodException();
		}
	}
}
