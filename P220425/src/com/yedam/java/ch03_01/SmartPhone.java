package com.yedam.java.ch03_01;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner); //상속관계에서 무조건 부모클래스의 생성자를 먼저 호출 = super
	}

	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");  //기능을 추가할때는 상속받은 다음에 추가
	}
}
