package com.yedam.java.ch08_01;

public class SmartTelevision implements Remotecontrol, Searchale {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void seVolume(int volume) {
		if(volume >= Remotecontrol.MAX_VOLUME) {
			this.volume = Remotecontrol.MAX_VOLUME;
		}else if(volume <= Remotecontrol.MIN_VOLUME) {
			this.volume = Remotecontrol.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}

}
