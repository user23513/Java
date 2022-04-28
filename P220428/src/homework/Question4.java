package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
	
		//출력결과가 나오도록 실행코드를 수정하세요.
		//조건 try~catch문을 이용하여 "유효하지 않은 값입니다. 다시 값을 입력해주세요."를 출력하세요.
		//랜덤값을 사용자가 입력해서 맞추는거
		Scanner sc = new Scanner(System.in);
		//1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random()*100)+1;
		
		
		//사용자입력을 저장할 공간
		int input = 0;
		
		//시도횟수를 세기위한 변수
		int count = 0;
		
		
		do {         //출력결과를 실행하는 코드부분
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			count++;
			try {
				input = Integer.parseInt(sc.nextLine());
				
				if(answer < input) {
					System.out.println("더 작은 수를 입력하세요");
					
				}else if(answer > input) {
					System.out.println("더 큰 수를 입력하세요.");
					
				}else if(answer == input) {
					System.out.println("맞췄습니다.");
					
					System.out.printf("시도횟수는 %d번입니다.\n",count);
				    break;
				}
				
			}catch(NumberFormatException e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				
			}
		
			
		}while(true);
		
		
	}

}
//출력결과
//1과 100사이의 값을 입력하세요 : 50
//더 작은 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : asdf
//유효하지 않은 값입니다. 다시 값을 입력해주세요.
//1과 100사이의 값을 입력하세요 : 25
//더 큰 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : 38
//더 큰 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : 44
//맞췄습니다.
//시도횟수는 5번입니다.
