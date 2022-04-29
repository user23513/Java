package com.yedam.java.ch11_02;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "홍길동";	 //실제로 메모리상에서 하나의 객체 공유하는 형태.	
		String str2 = "홍길동";		
		
		String str3 = new String("홍길동"); //new 연산자를 쓰면 다른 객체.
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 객체를 참조합니다.");
			
		}else {
			System.out.println("str1과 str2는 다른 객체를 참조합니다.");
		}

		if(str1 == str3) {
			System.out.println("str1과 str3는 같은 객체를 참조합니다.");
			
		}else {
			System.out.println("str1과 str3는 다른 객체를 참조합니다.");
		}
		System.out.println();
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열을 가집니다.");
		}else {
			System.out.println("str1과 str2는 다른 문자열을 가집니다.");

		}
		
		if(str1.equals(str3)) {
			System.out.println("str1과 str3는 같은 문자열을 가집니다.");
		}else {
			System.out.println("str1과 str3는 다른 문자열을 가집니다.");

		}
	
		
		
	}

}
