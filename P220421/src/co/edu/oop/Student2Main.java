package co.edu.oop;

import java.util.Scanner;

public class Student2Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student2 stu = new Student2(220421, "홍길동");
		
		int menu = 0;
		int ko = 0;
		int ma = 0;
		int en = 0;
		
		while(true) {
			System.out.println("1.국어 점수 | 2.수학 점수 | 3.영어점수 | 4.평균 | 5.종료 ");
			System.out.print("선택하세요 : ");
			menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("국어 점수를 입력하세요 : ");
			   ko = sc.nextInt();
			   stu.info(ko);
			} else if(menu == 2) {
				System.out.print("수학 점수를 입력하세요 : ");
				ma = sc.nextInt();
				stu.info2(ma);
				
			}else if(menu == 3) {
				System.out.print("영어 점수를 입력하세요 : ");
				en = sc.nextInt();
				stu.info3(en);
				
			} else if(menu == 4) {
				System.out.printf("평균값은 " + stu.avg(ko, ma, en) + "입니다.");
			
			} else if(menu == 5) {
				System.out.println("\n종료합니다.");
				break;
			}
			
			
			
		
		
		
		
		}
		
		
		
		
	}

}
