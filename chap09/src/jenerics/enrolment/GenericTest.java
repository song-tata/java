package jenerics.enrolment;

public class GenericTest {

	public static void main(String[] args) {
		Course.basicCourse(new Generic<Person>(new Person()));
		Course.basicCourse(new Generic<Worker>(new Worker()));
	
		Course.studentCourse(new Generic<HighStudent>(new HighStudent()));
		Course.studentCourse(new Generic<Student>(new Student()));
	
		Course.workerCourse(new Generic<Worker>(new Worker()));
	}

}
