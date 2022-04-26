package com.yedam.java.ch08_01;

public interface Remotecontrol {
	
	 //상수 필드
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상 메소디
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void seVolume(int volume);

}
