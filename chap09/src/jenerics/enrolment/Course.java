package jenerics.enrolment;

public class Course {

	public static void basicCourse(Generic<? extends Person> p) {
		System.out.println("기본 과정 등록");
	}
	public static void studentCourse(Generic<? extends Student> p) {
		System.out.println("학생 과정 등록");
	}
	public static void workerCourse(Generic<? extends Worker> p) {
		System.out.println("직장인 과정 등록");
	}
}
