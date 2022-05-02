package com.yedam.java.ch11_02;

public class StringIndexOfExample {
	public static void main(String[] args) {
		//491p
		String subject = "자바 프로그래밍";
		String subject1 = "JAVA PROGRAMING"; //자바는 대문자랑 소문자를 구분하기 때문에 한쪽으로 몰아야한다.
		
		int location = subject.indexOf("프로그래밍");
		//프로그래밍이 시작되는 위치를 알려줌 (인덱스로 몇번째인지)
		//정수로 인덱스 값을 알려줌 
		System.out.println(location);
		
//		개발자가 사용하는 식
//		실제위치랑 상관없이 내가 찾고자 하는 문자가 포함되어있는지.
//		값이 있으면 정수값을 준다. 0이상의 값
//		값이 없으면 -1이라는 값을 반환
		
		if(subject1.indexOf("java") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}
		
		
		
	}

}
