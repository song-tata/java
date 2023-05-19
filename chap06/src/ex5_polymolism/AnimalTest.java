package ex5_polymolism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest a = new AnimalTest();
		//형변환
		a.moveAnimal(new Human());
		a.moveAnimal(new Tiger());
		a.moveAnimal(new Eagle());
		//Animal 객체로 업캐스팅중!(묵시적으로 적용가능)
	}
	
	public void moveAnimal(Animal animal) { 
		// 매개변수의 자료형이 상위 클래스(부모클래스)
		animal.move();//재정의 된 메서드 호출
	}
}
