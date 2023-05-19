package ex2_interface;

public class Bird implements Flyer{

	@Override
	public void fly() {
		System.out.println("파닥파닥");
	}

	@Override
	public boolean isAnimal() {
		return true;
	}

}
