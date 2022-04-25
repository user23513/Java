package com.yedam.java.ch08_01;

public class Audio implements RemoterControl {

private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void turnOff() {
       System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume >= RemoterControl.MAX_VOLUME) {
			this.volume  = RemoterControl.MAX_VOLUME;
		}else if (volume<= RemoterControl.MIN_VOLUME ) {
			this.volume = RemoterControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 Audio볼륨 : " + this.volume);

	}

}
