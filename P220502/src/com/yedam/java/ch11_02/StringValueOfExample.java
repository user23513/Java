package com.yedam.java.ch11_02;

public class StringValueOfExample {

	public static void main(String[] args) {

		//498p
		//String외의 타입을 String으로 변환
		//정석 방법
		int intValue = 10;
		double doubleValue = 10.5;
		boolean booleanValue = true;
		
		String intStr = String.valueOf(intValue);
		String doubleStr = String.valueOf(doubleValue);
		String booleanStr = String.valueOf(booleanValue);
		
		System.out.println(intStr);
		System.out.println(doubleStr);
		System.out.println(booleanStr);

		
		//편법으로 더하기 연산자를 이용해서 
		//문자열이 하나라도 포함되면 뒤에가 문자열로 인식?
		System.out.println("" + intValue);
		System.out.println("" + doubleValue);
		System.out.println("" + booleanValue);
		
		


		
		
	}

}
