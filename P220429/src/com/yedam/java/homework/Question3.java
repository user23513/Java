package com.yedam.java.homework;

public class Question3 {

	public static void main(String[] args) {


		method(true);
		method(false);

	}
	
	public static void method(boolean value){
		try {
		System.out.println(1);
		
		if(value){
			throw new RuntimeException();
		}
		
		System.out.println(2);
		}catch(RuntimeException e){
		System.out.println(3);
		return; //강제로 중간에 메소드를 종료하는 역할
		}catch(Exception e) {
		System.out.println(4);
		}
		finally { //return으로 종료시킨다고 하더라도 finally는 무조건 실행된다.
		System.out.println(5);
		}
		System.out.println(6);
		
	} //두개의 값이 같은값이 나온다는 건 try-catch구문에서 파이널리로 쓴다느것

}
