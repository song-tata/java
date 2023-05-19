package practis;

public class menberService {
	final static String ID = "hong";
	final static String PASSWORD = "12345";
			
	public boolean login(String id,String password) {
		if(id == ID && password == PASSWORD) 
			return true;
		else
			return false;
		}
	public void logout(String id) {
		System.out.printf("%s님이 로그아웃 하셨습니다.\n",id);
	
	}
}
