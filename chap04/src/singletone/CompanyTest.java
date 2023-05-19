package singletone;

public class CompanyTest {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getSingleton();
		Singleton obj2 = Singleton.getSingleton();
		
		if(obj1 == obj2) {
			System.out.println("같다!");
		}
	}

}
