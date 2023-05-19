package lamda.seven;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class PersonTest {

	public static void main(String[] args) {
		double aveT = average(Person.persons, d -> d.getTall());
		double aveW = average(Person.persons, d -> d.getWeight());
		
		System.out.println("평균 키: "+ aveT);
		System.out.println("평균 몸무게"+aveW);
	}
	public static double average(List<Person> p, ToDoubleFunction<Person> df) {
		double sum = 0;
		for(Person pe : p) {
			sum += df.applyAsDouble(pe);
		}
		
		return sum / p.size();
		
	}
}
