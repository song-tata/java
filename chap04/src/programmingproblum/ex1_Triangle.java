package programmingproblum;

public class ex1_Triangle {
	double a;
	double b;
	
	public ex1_Triangle() {
		
	}
	
	public ex1_Triangle(double a, double b) {
		setA(a);
		setB(b);
	}
	
	public double findArea() {
		double answer = (a*b)/2;
		return answer;
	}
	public boolean isSameArea(ex1_Triangle t) {
		boolean answer = false;
		if(this.findArea() == t.findArea()) {
			answer = true;
		}
		return answer;
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	
}
