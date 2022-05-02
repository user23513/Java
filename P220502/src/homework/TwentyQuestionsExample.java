package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwentyQuestionsExample {

	public static void main(String[] args) {

		//스무고개 구현
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int menu;
		String input; //입력하는 문자열
		String answer; //정답 문자열
		int count=0;
		List<String> list = new ArrayList<String>(); //입력한 문자열 list
		String[] questions = {"orange", "game", "phone", "smart"}; //정답 배열
		int num = (int) (Math.random()*4);
		
		while(run) {
			System.out.println("\n--------------------------------------");
			System.out.println("1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료");
			System.out.println("--------------------------------------");
			//프로그램이 실행되면 문제는 Orange, Game, Phone, Smart 중 하나가 랜덤으로 선정되도록 합니다.
			//System.out.println(num);
			answer = questions[num]; //answer가 랜덤으로 선정된 하나.
			System.out.println(answer);
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
//		- 메뉴 1.문자하나 ] 
//				1) 문자 하나를 입력하여 문제를 구성하는 문자가 맞는 지 확인합니다.
//				2) 순서와 상관없이 문제를 구성하는 모든 문자가 입력되면 더이상 입력할 수 없습니다.
				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
				//포함된 문자열 출력
				for(int i =0; i<list.size(); i++) {
					String str = list.get(i);
				    System.out.print(str + " ");
				}
				if(count == answer.length()) {
					System.out.println("\n문자열을 구성하는 문자를 다 입력하셨습니다.\n");
					break;
				}
				
				System.out.println("\n입력 값>>");
				input = sc.nextLine(); //문자열 입력.
				
				
				//입력한 문자열이 answer에 구성되는 문자열에 포함되어 있는지
				//indexOf() 사용
				if(answer.indexOf(input) != -1) {
					System.out.print("문자열을 구성하는 문자입니다.");
				    list.add(input);
				    count++;
					
				}else {
					System.out.print("문자열을 구성하는 문자가 아닙니다.");
				}
				
				
				break;
            case 2:
//			- 메뉴 2.단어 ]
//				1) 단어를 입력하여 문제를 구성하는 문자가 순서에 맞게 입력되었는 지 확인합니다.
//				2) 단어의 길이와 문제의 길이가 다를 경우 안내 메세지를 출력합니다.
            	System.out.print("입력값 >>");
            	String check = sc.nextLine();
            	for(int i = 0; i<answer.length(); i++) {
            		if(answer.equals(list.get(i))) {
            			System.out.print("O");
            		}else {
            			System.out.print("X");
            		}
            	}
				
				break;
            case 3:
//			- 메뉴 3.입력내역 ]
//				1) 현재까지 맞게 입력한 문자들을 출력합니다.
	            System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
	            for(String str : list) {
	            	System.out.print(str + " ");
	            }
	            break;
            case 4:
//			- 메뉴 4.새 게임 ]
//				1) 새 문제를 선정하고 입력된 내역을 초기화합니다.
	
            	break;
            case 5:
//			- 메뉴 5.종료 ]
//				1) 프로그램을 종료합니다.
	
            	break;
 
			
			}
			
			
		}

		
		
		
		
	}

}
