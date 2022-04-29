package com.yedam.java.ch16_01;

public class MyFuntionalInterfaceExample3 {

	public static void main(String[] args) {
		
		//매개변수가 두개고 리턴식이 있는 람다식.
		//내부에 이름이 존재하기 때문에 익명객체랑을 다르다
		//익명객체는 재사용이 어렵고 람다식은 재사용이 가능.
		
		MyFuntionalInterface3 fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> {return x+y;};
		System.out.println(fi.method(4, 7));
		
		fi = (x,y) -> x+y;
		System.out.println(fi.method(10, 20));
		
		fi = (x, y) -> Math.subtractExact(x, y);  //minus 함수
	    System.out.println(fi.method(10, 20));
			
	}
}
