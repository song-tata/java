package exceptions;

public class FoodException extends Exception {

	public FoodException() {
		super("주문한 메뉴가 존재하지않습니다.");
	}
}
