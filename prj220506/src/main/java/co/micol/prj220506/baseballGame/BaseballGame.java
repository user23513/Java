package co.micol.prj220506.baseballGame;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {
	//컴퓨터가 1~9에서 3개의 수 선택
	
	//랜덤으로 선택된 숫자를 배열에 넣는 메소드
	//중복되는 숫자 없애야
	int[] computer = new int[3];
	private void computerInput() {
		for(int i = 0; i < computer.length; i++) {
			int random = (int)(Math.random()*8)+1;
			computer[i] = random;
			if(i != 0) {
				for(int j = 0; j < i; j++) {
					if(computer[i] == computer[j]) {
						i--;
					}
				}
			}
		}
		for(int a : computer) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	//사용자가 숫자 3개 입력하는 메소드
	Scanner sc = new Scanner(System.in);
	int[] user = new int[3];
	private void userInput() {
		System.out.println("숫자 3개를 입력하세요.");
		for(int i = 0; i < user.length; i++) {
			int num = sc.nextInt();
			user[i] = num;
		}
		for(int a : user) {
			System.out.print(a + " ");
		}
		
	}
	
	//숫자와 위치가 모두 다를 때 : noball
	//숫자는 같고 위치가 다를 때 : ball
	//숫자와 위치 모두 같을 때 : strike
	//숫자와 위치를 맞추는 메소드
//	indexOf : 자료구조에서 특정 문자의 인덱스를 찾기 위해 사용된다.
//	자바 배열에서는 indexOf()를 지원하지 않고 ArrayList자료구조에서만 지원하므로 asList()를 통해 변환시켜 인덱스를 구해야 한다.
	int ballCount = 0;
	int strikeCount = 0;
	boolean run = false;
	public void matchRun() {
		computerInput();
		do {
		userInput();
		//숫자는 같고 위치가 다를 때 : ball
		for(int i = 0; i<3; i++) {
			if(computer[i] == user[i]) {
				strikeCount++;
				continue;
			}
			for(int j = 0; j<computer.length; j++) {
				if(computer[i] == user[j]) {
					ballCount++;
				}
			}
		}
	
		System.out.println();
		if(ballCount == 0 && strikeCount == 0) { //숫자와 위치가 모두 다를 때 : noball
			System.out.println("Noball");
		}
		if(ballCount>0){
		System.out.println(ballCount + "ball");
		ballCount = 0;
		}
		if(strikeCount>0) {
			System.out.println(strikeCount + "strike");
			if(strikeCount == 3) {
				run = true;
				System.out.println("정답입니다!!");
		}
			strikeCount = 0;
		}
	}while(!run);
	}
	
	

}
