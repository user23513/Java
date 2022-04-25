package co.edu.homework;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
				
		Student[] stuArr = null;
		
		while(true) {
			System.out.println("===============================");
			System.out.println("1. 학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
			System.out.println("===============================");
			System.out.println("선택 > ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("학생 수 > ");
				int number = sc.nextInt();
				stuArr = new Student[number];
			}else if (menu == 2) {
				
				for(int i = 0; i < stuArr.length; i++) {
					stuArr[i] = new Student();
				
				System.out.println("학번 > ");
				int id = sc.nextInt();
				stuArr[i].setStudentNo(id);
						
				System.out.println("이름 > ");
				String name = sc.next();
				stuArr[i].setStudentName(name);
				
				System.out.println("국어 > ");
				int kor = sc.nextInt();
				stuArr[i].setKor(kor);
				
				System.out.println("영어 > ");
				int eng = sc.nextInt();
				stuArr[i].setEng(eng);
				
				System.out.println("수학 > ");
				int math = sc.nextInt();
				stuArr[i].setMath(math);
				
				}
			}else if(menu == 3) {
				System.out.println("학번 입력 > ");
				int id2 = sc.nextInt();
				for(int j = 0; j<stuArr.length; j++) {
				if(id2 == stuArr[j].getStudentNo() ) {
					stuArr[j].stuInfo();
				       }
					}
			}else if(menu == 4) {
				System.out.println("순위 > ");
				double a = 0;
				
				for(int n = 0; n<stuArr.length; n++) {
					if( a < stuArr[n].avg()) {
						
					}
					
				}
				
				
			}
		}
			
			
		
		
		
	}



		
	}


