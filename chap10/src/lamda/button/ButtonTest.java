package lamda.button;

public class ButtonTest {

	public static void main(String[] args) {
		//확인 버튼 객체 생성
		Button btnOk = new Button();
		//취소 버튼 객체 생성
		Button btnCancle = new Button();
		
		//ok버튼 객체에 람다식을 매개변수로 전달.
		btnOk.setCl(()->{
			System.out.println("확인 버튼 클릭!");
		});
		
		btnOk.click();
		
		btnCancle.setCl(()->{
			System.out.println("취소 버튼 클릭!");
		});
		
		btnCancle.click();
	}

}
