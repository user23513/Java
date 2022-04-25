package com.yedam.java.ch02_01;

public class KumhoTIre extends Tire {

	public KumhoTIre(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotatoin) {
			System.out.println(location + " KumhoTire 수명 : " + (maxRotatoin - accumulatedRotation) + " 회");
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
