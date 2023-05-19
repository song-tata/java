package singletone;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		return singleton;		
	}
	public static void setSingleton(Singleton singleton) {
		Singleton.singleton = singleton;
	}
}
