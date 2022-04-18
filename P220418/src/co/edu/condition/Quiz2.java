package co.edu.condition;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

//		2. 가위바위보 (반복문x)
//		   scanner, random
//		   가위(0), 바위(1), 보(2) 게임.
//		   컴퓨터와 가위바위보해서 승리/패배 출력
		//Player
		Scanner sc=new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) 입력 :");
		int a = sc.nextInt();
		
		if(a==0) {
			System.out.println("Player : 가위");
		}else if(a==1) {
			System.out.println("Player : 바위");
		}else if (a==2) {
			System.out.println("Player : 보");
		}
		
		//computer
		int com = (int) (Math.random() * 3);
		
		if (com == 0) {
			System.out.println("가위");
		} else if (com == 1) {
			System.out.println("바위");
		} else if (com == 2) {
			System.out.println("보");
		}
		
		int score = a-com;
		if(score==0){
			System.out.println("비겼습니다.");
			}else if(score ==-2 || score ==1) {
				System.out.println("이겼습니다.");
			}else if(score == -1 || score == 2) {
				System.out.println("졌습니다.");
				
		}
		
				
		
		
		
	}
		
			
				
			
		
		}
		
		

			
	

	



