package co.edu.getset;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		System.out.print("학번을 입력하세요 : ");
		int number = sc.nextInt();
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
	
		
		System.out.print("국어 점수를 입력하세요 : ");
		int ko = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int en = sc.nextInt();
		
		st.info(number, name, ko, math, en);
		
		System.out.printf("\n(국어, 영어, 수학) 평균점수 : %.2f", st.avg(ko, math, en) );
		
		
	}

}
