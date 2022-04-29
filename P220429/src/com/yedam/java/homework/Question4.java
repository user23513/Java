package com.yedam.java.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
			int answer = (int) (Math.random() * 100) + 1;
					
			// 사용자입력을 저장할 공간
			int input = 0; 

			// 시도횟수를 세기 위한 변수
			int count = 0; 
			
			boolean run = true;
					
			do{   //do-while를 쓴 이유 : 조건이 성립되지 않더라도 반드시 한번은 실행된다는걸 보장한다. while은 조건이 성립되지 않으면 실행되지 않는다.
				  //출력결과를 실행하는 코드부분
				
			    //시도 횟수를 증가
				count++;
				
				//사용자가 숫자를 입력
				//-> 숫자 이외의 값을 입력할 경우 예외처리.
				try {
					System.out.println("1과 100사이의 수를 입력하세요.");
				    input = new Scanner(System.in).nextInt();
				}catch(InputMismatchException e) { //입력해서 들어온 값이랑 처리한 값의 타입이 다를때 예외.
					System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
					continue;
				}
				//컴퓨터가 가지고 있는 숫자 > 사용자가 입력한 숫자
				//-> "더 큰수를 입력하세요."
				 if(answer < input) {
					System.out.println("더 작은 수를 입력하세요");
				}
				 else if(answer > input) {
					System.out.println("더 큰수를 입력하세요.");
				}
				
				//컴퓨터가 가지고 있는 숫자 < 사용자가 입력한 숫자
				//-> "더 작은수를 입력하세요."
				
				//컴퓨터가 가지고 있는 숫자 = 사용자가 입력한 숫자
				//-> "맞혔습니다."
				//-> 시도횟수를 출력.
				else {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 " + count + "번 입니다.");
					//break;
					run = false;
				}
				
					
					}while(run);
		
		
	}

}

