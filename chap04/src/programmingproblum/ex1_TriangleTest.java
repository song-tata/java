package programmingproblum;

public class ex1_TriangleTest {

	public static void main(String[] args) {
		ex1_Triangle t1 = new ex1_Triangle(10.0,5.0);
		ex1_Triangle t2 = new ex1_Triangle(5.0,10.0);
		ex1_Triangle t3 = new ex1_Triangle(8.0,8.0);
		System.out.println(t1.findArea());
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
