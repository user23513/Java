package com.yedam.java.ch10_02;

public class ThrowsExample {

	public static void main(String[] args) {
		try {                                  
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	
	}
	
	public static void findClass() throws ClassNotFoundException { //여기에 이런 오류가 있다고 알려주는것.
		                                                           //따로 사용자가 try-catch사용해서 예외처리해줘야함.
		Class clazz = Class.forName("java.lang.String2");
	}

}
