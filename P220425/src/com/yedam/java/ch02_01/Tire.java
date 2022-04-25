package com.yedam.java.ch02_01;

public class Tire {

	//필드
	public int maxRotatoin;         //최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location;         //타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotatoin = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotatoin) {
			System.out.println(location + " Tire 수명 : " + (maxRotatoin - accumulatedRotation) + " 회");
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
	
}
