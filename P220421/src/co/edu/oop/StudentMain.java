package co.edu.oop;

public class StudentMain {

	public static void main(String[] args) {

		Student stu = new Student();
		
		stu.number = 220421;
		stu.name = "홍길동";
		stu.korean = 80;
		stu.math = 50;
		stu.english = 75;
		
		stu.info();
		
		stu.avg();
		
	}

}
