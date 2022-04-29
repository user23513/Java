package com.yedam.java.ch16_01;

public class MyFuntionalInterfaceExample {
	public static void main(String[] args) {
		
		//매개변수도 리턴값도 존재하지 않는 람다식. (가장 기본이 되는 람다식 형태)
		
		MyFuntionalInterface1 fi;      //fi라는 변수안에는 메소드 하나 존재. 
		
		fi = () -> {                  //fi 안에 메소드를 정의함. 람다식을 이용 할때는 구현class가 필요하지 않다.
			String str = "method call1";   
			System.out.println(str);
		};
	
		fi.method();
		
		fi = () -> {System.out.println("method call2"); };
		fi.method();
		
		fi = () -> System.out.println("method call3"); //명령어가 한줄만 있을때는 이렇게도 표현할 수 있다.
		fi.method();
	}

}
