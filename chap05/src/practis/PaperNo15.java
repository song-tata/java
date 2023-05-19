package practis;

public class PaperNo15 {

	public static void main(String[] args) {
		menberService m = new menberService();
		boolean result = m.login("hong", "12345");
		if(result) {
			System.out.println("로그인되었습니다.");
			m.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지않습니다.");
		}
	}

}
