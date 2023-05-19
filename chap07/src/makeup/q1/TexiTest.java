package makeup.q1;

public class TexiTest {

	public static void main(String[] args) {
		Texi texi = new Texi();
		Meter texi2 = new Texi();
		
		
		boolean a = Meter.class.isInstance(texi);
		
		if(a) {
			System.out.println("택시 클래스는 미터 인터페이스를 구현합니다.");
		}else {
			System.out.println("택시 클래스는 미터 인터페이스 구현안함");
		}
		
		texi.start();
		System.out.println(texi.stop(500));
		texi2.start();
		System.out.println(texi2.stop(600));
	}

}
