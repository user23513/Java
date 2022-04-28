package com.yedam.java.ch15_01;

public class BoxExample {

	public static void main(String[] args) {

		
//		Box box = new Box();
//		
//		box.setObject("홍길동");
//		
//		String name = (String)box.getObject(); //null값은 String타입도 가질수있는 값
//		System.out.println(name);
//		
//		box.setObject(new Apple());
//		Apple apple = (Apple) box.getObject();
//		
		
		Box<String> stringBox = new Box<String>(); //Box<String>는 String만 받을 수 있다.
		                                           //T 대신에 String으로 바뀐다.
		stringBox.set("홍길동");
		String name = stringBox.get();
		
		
		Box<Apple> appleBox = new Box<Apple>(); //Apple을 받으려면 다시 Box<Apple>해줘야 함.
		
		appleBox.set(new Apple()); //String만 받을 수 있으므로 새롭게 다른 타입 받을 수 없다.
		Apple apple = appleBox.get();
		
		
		
	}

}
