package programming.six;

public class MaxTest {

	public static void main(String[] args) {
		Max2<Number> n = new Max2<>();
		System.out.println(n.max(10.0, 8.0));
		System.out.println(n.max(5, 8.0));

		Max2<String> s = new Max2<>();
		System.out.println(s.max("hello", "hi"));
		System.out.println(s.max("good", "morning"));
	}
}

class Max2<Object> {
	String s1, s2;
	double n1, n2;

	public Object max(Object ns1, Object ns2) {
		if (ns1 instanceof Number) {
			n1 = ((Number) ns1).doubleValue();
			n2 = ((Number) ns2).doubleValue();
			return (n1 > n2) ? ns1 : ns2;
		} else {
			s1 = (String) ns1;
			s2 = (String) ns2;
			return (s1.length() > s2.length()) ? ns1 : ns2;
		}

	}
}
