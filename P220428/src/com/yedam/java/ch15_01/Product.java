package com.yedam.java.ch15_01;

public class Product<T, M> {  // 제네릭 타입 - 복수의 파라미터 사용

	private T t;
	private M m;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {  //T -> Tv
		this.t = t;
	}
	public M getM() {       
		return m;
	}
	public void setM(M m) {   //M -> String
		this.m = m;
	}
	
	
	
	
}

class Tv {}
class Car {} 
