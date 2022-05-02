package com.yedam.java.ch11_02;

public class StringTrimExample {

	public static void main(String[] args) {

		//497p
		//앞뒤의 공백을 제거하는 메소드 trim()
		String tel1 = "   02";
		String tel2 = "123    ";
		String tel3 = "  1234    ";
		
	//	System.out.println(tel1 + tel2 + tel3);
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim(); //기존에 있던걸 제거 시키는게 아니라 새로운 변수에 객체를 만들어 저장한다.
		System.out.println(tel1 + tel2 + tel3); //그대로 살아있음.
		System.out.println(tel);

		
		
		
		
	}

}
