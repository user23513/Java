package com.yedam.java.ch11_02;

public class StingToLowerUpperCaseExample {

	public static void main(String[] args) {

		//496p
		//알파벳 대소문자 변경
		String str1 = "java programing";
		String str2 = "JAVA programing";
        
		System.out.println(str1.equals(str2)); //자바는 대소문자를 구별하기 때문에 - false
		
		//둘다 소문자로 변경
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();

	   System.out.println(lowerStr1.equals(lowerStr2)); //true
	   
	   //대문자 소문자 상관없이 논리적인 값만 비교해서 결과를 알려준다.
	   System.out.println( str1.equalsIgnoreCase(str2));
				
		
		
	}

}
