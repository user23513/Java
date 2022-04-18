package co.edu.condition;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

//  1. 섭씨,화씨 -> c = 5/9(F-32)
//		   scanner -> 화씨 데이터를 받고,
//		   화씨 -> 섭씨 변환 프로그램
//		   주의)0.0 나올수도 있음.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("화씨온도를 입력하세요 : ");
		Double inputData = (double) Integer.parseInt(scanner.nextLine());
		Double result = (inputData-32)*5/9;
		System.out.println(result);
		
	}
}
		
		
		
		
	
		
		

		



