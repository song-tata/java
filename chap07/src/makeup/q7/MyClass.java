package makeup.q7;

public class MyClass implements UseInterface{


	@Override
	public void y() {
		System.out.println("y");
	}

	@Override
	public void x() {
		System.out.println("x");
	}

	@Override
	public void useMethod() {
		System.out.println("Method");
	}

}
