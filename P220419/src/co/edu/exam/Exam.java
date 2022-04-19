package co.edu.exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
  
		//1.화씨를 섭씨로 변환하는 프로그램
		Scanner sc=new Scanner(System.in);
//		System.out.println("화씨를 입력하세요");
//		int c_temp=sc.nextInt();
//		double f_temp = 5/9.0*(c_temp-32);
//		System.out.printf("%.2f\n", f_temp);
		
		//2.가위(0) 바위(1) 보(2)
		//0,0 | 0,1| 0,2
		//1,0 | 1,1| 1,2
		//2,0 | 2,1| 2,2
		
//		System.out.println("가위(0) 바위(1) 보(2)");
//		int user = sc.nextInt();
//		int random=(int)(Math.random()*3);
//		
//		switch(user) {
//		case 0 : 
//			if(random ==1) {
//				System.out.println("졌습니다");
//			}else if(random==2) {
//			 System.out.println("이겼습니다.");
//			}else {
//				System.out.println("비겼습니다.");
//			}break;
//	    case 1 :
//		
//			}
//		}
		
		//3.학점관리 프로그램
	System.out.println("점수를 입력하세요");
	int point=sc.nextInt();
	//100보다 큰 숫자가 들어올때 10으로 처리.
	if(point/10>100) {
		point=10;
	}
	
	//100-90 89-80 79-70
	switch(point) {
	case 10:
	case 9:
		System.out.println("A학점");
		break;
	case 8:
		System.out.println("B학점");
		break;
	case 7:
		System.out.println("C학점");
		break;
		
		
		
	}
			
	
				
		
	}
}

