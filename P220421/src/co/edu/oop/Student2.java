package co.edu.oop;

public class Student2 {

	int number;
	String name;
	int korean;
	int math;
	int english;
	
	public Student2(int number, String name){
		this.number = number;
		this.name = name;
	}
	
	//메소드
//	void info(int korean, int math, int english) {
//		System.out.println("국어점수 : " + korean + "수학점수 : " + math +"영어 점수 : " + english);
//	}
	
	void info(int ko) {
		System.out.println(number + " " + name + "의 " + "국어 점수는 " + ko + "입니다.\n");
	}
	
	void info2(int ma) {
		System.out.println(number + " " + name + "의 " + "수학 점수는 " + ma + "입니다.\n");
	}
	
	void info3(int en) {
		System.out.println(number + " " + name + "의 " + "영어 점수는 " + en + "입니다.\n");
	}
	
	
    int avg(int ko, int ma, int en) {
		int sum = ko + ma + en;
		int avg =  sum/3;
		return avg;
	}
	
}
