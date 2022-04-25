package com.yedam.java.ch02_01;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotatoin) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotatoin - accumulatedRotation) + " 회");
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
