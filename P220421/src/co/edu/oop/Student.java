package co.edu.oop;

public class Student {

	int number; 
	String name;
	int korean;
	int math;
	int english;
	
	public Student() {
		
	}
	
//  	public Student(int number, String name, int korean, int math, int english) {
//		super();
//		this.number = number;
//		this.name = name;
//		this.korean = korean;
//		this.math = math;
//		this.english = english;
//	}




	void info() {
		System.out.println("학번 : " + number + " | 이름 : " + name + " | 국어점수 : " + korean + " | 수학점수 : " + math + " | 영어점수 : " + english);
	}
	
	//평균 점수
	void avg() {
		int sum = korean + math + english;
		System.out.printf("평균 점수 : %.2f", (double) sum / 3 );
	}
	
	
}
