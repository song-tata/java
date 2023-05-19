package ex2_interface;

public class Airplane implements Flyer{
	
	@Override
	public void fly() {
		System.out.println("부웅부웅");
	}

	@Override
	public boolean isAnimal() {
		return false;
	}

}
