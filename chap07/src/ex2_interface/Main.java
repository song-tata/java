package ex2_interface;

public class Main {

	public static void main(String[] args) {
		
		Flyer airplane = new Airplane();
		Flyer bird = new Bird();
		
		airplane.fly();
		bird.fly();
		
		System.out.println(airplane.isAnimal()? "동물이다":"동물이아니다" );
		System.out.println(bird.isAnimal()? "동물이다":"동물이아니다" );
	}

}
