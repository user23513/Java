package com.yedam.java.ch15_02;

public class Util {
	
	public static <T> Box<T> boxing(T t) {  //rturn되는 타입 앞에 제네릭이라고 <> 이렇게 표시해야함. 안에 갯수는 상관없다.
		Box<T> box = new Box<T>();  //object가 들어가는 곳에 T를 모두 넣어줌.
		box.setT(t);
		return box;
	}
	
	
	

}
