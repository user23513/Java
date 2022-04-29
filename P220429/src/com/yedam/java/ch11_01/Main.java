package com.yedam.java.ch11_01;

public class Main {

	public static void main(String[] args) {

		//476p
//		String str1 = new String("홍길동"); //new연산자를 쓰면 무조건 새로운 객체생성
//		String str2 = new String("홍길동");
		
		//hashCode가 다르게 생성 -> 자바는 다르게 인식
		//hashCode - 객체가 가지고 있는 유일한 값 (각각 다른 값을 가진다.) -> 메모리 주소
		//하나의 메모리 주소에는 하나의 객체.
		
		
		for(int i = 0; i<10; i++){
			System.out.println(i);
			if(i ==5) {
				//return;
				//break;
				System.exit(0); //exit()안에 숫자는 상관없다.
			}
		}
		
		System.out.println("마무리 코드");
		
	}

}
