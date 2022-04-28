package com.yedam.java.ch10_01;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "a100";  
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //숫자로 변환 할 수 없다. Integer.parseInt메소드 오류/ 문자가 없는 숫자 형태여야한다.
		
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);

		
		
	}

}
