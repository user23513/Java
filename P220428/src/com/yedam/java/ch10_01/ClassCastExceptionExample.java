package com.yedam.java.ch10_01;

public class ClassCastExceptionExample {

	public static void main(String[] args) {

		changeDog(new Dog());
		changeDog(new Cat()); //
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {  //강제타입변환 바로 앞줄에 instanceof 들어간다.
		Dog dog = (Dog) animal;
	 }
	}
}

//클래스 생성 
class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}
