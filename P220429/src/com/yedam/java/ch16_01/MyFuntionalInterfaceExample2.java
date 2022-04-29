package com.yedam.java.ch16_01;

public class MyFuntionalInterfaceExample2 {

	public static void main(String[] args) {
		
		//매개변수가 있고 리턴값이 없는 람다식.
		
		MyFuntionalInterface2 fi;
		
		fi = (x) -> {
			int result = x*5;
			System.out.println(result);
		};
		
		fi.method(5);
		
		fi = (x) -> {System.out.println(x*5);};
		fi.method(4);
		
		fi = x -> System.out.println(x*5);  //매개변수가 하나거나 실행코드가 하나일때만 이렇게 줄일 수 있다.
		fi.method(3);
		
	}
}
