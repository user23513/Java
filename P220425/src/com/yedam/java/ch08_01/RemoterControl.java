package com.yedam.java.ch08_01;

public interface RemoterControl {
	
	// 상수필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // public static final int int MIN_VOLUME = 0;
	
	//추상 메소드
	public abstract void turnOn();
	void turnOff(); //public stract void turnOff();
	public void setVolume(int volume);

}
