package com.yedam.java.ch10_02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();//여기에 java.lang.String2이 메세지 
//			System.out.println(e.getMessage()); //getMessage() - String 출력
			
			System.out.println("존재하지 않는 클래스입니다.");
		} 
		
		
	}

}
