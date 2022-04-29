package com.yedam.java.homework;

public class Question2 {
	
	public static void main(String[] args) {
		
		try {
		method1();
		System.out.println(1);
		
		} catch(NullPointerException e) {
			System.out.println(2);
		}finally {
		System.out.println(3);
		}
		System.out.println(4);

	}
	
	public static void method1(){ //throws - 이메소드안에서 일어날 수 있는 예외를 드로우하는거고
		throw new NullPointerException(); //throw 강제로 예외를 생성시키는것
	}

}
