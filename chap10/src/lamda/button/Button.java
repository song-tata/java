package lamda.button;

public class Button {
	//정적 중첩 인터페이스
	@FunctionalInterface
	public static interface ClickListener{
		//추상 메소드
		void onClick();
	}
	// 필드 (캡슐화: 정보은닉)
	private ClickListener cl;
	
	//메소드
	public void click() {
		this.cl.onClick();
	}

	public ClickListener getCl() {
		return cl;
	}

	public void setCl(ClickListener cl) {
		this.cl = cl;
	}
	
}
