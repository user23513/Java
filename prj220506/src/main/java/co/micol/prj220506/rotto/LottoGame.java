package co.micol.prj220506.rotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGame {
	
	Scanner sc = new Scanner(System.in);
	public int gameNum;
	
	int line = 0; //라인수
	
	
	
	//출력되는 메소드
	public void rottoPrint() {
		System.out.print("게임수를 입력하세요 : ");
		gameNum = sc.nextInt();
		LottoArray[] arr = new LottoArray[gameNum];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new LottoArray();
			line++;
//			System.out.println(arr[i]);
			if(line%5 == 0) {
				System.out.println();
				System.out.print("===================");
			}
			System.out.println();
			
		}
		System.out.println("금액은 " + (gameNum*1000) + "원입니다.");
		
	}

	
	

}
