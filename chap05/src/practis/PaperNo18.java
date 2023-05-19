package practis;

public class PaperNo18 {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같음");
		}else
			System.out.println("다름");
	}

}
