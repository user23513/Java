package co.edu.homework;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		
		int menu = 0;
		int[] ary = null;
		
		while(true) {
			System.out.println("==========================================================");
			System.out.println("1. 학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
			System.out.println("==========================================================");
			System.out.println("선택 > ");
			menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("학생 수 > ");
				int stuNum = sc.nextInt();
				stu.stuNo(stuNum);
				ary = new int[stuNum];
			}else if(menu == 2) {
		        
				for(int i = 0; i < ary.length; i++) {
					
				System.out.println("학번 > ");
				int stuNo =  sc.nextInt();
				
				System.out.println("이름 > ");
				String stuName = sc.next();
				
				System.out.println("국어 > ");
				int kor = sc.nextInt();
				
				System.out.println("영어 > ");
				int eng = sc.nextInt();
				
				System.out.println("수학 > ");
				int math = sc.nextInt();
				
				stu.setInfo(stuNo, stuName, kor, eng, math);
				
				System.out.println("=============================");
				}
				
				
			}else if(menu == 3) {
				System.out.println("학번 입력 > ");
				int no = sc.nextInt();
				System.out.println(stu.getInfo());
				
			}
			
			
			
		}
		
		
		
	}
}
