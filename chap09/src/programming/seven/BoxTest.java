package programming.seven;

public class BoxTest {

	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(new Integer(100));
		System.out.println(i.get());
		Box<String> v = new Box<>();
		v.set(new String("100"));
		System.out.println(i.get());
	}

}

class Box<T>{
	T r;

	public T get() {
		return r;
	}

	public void set(T r) {
		this.r = r;
	}
	
}