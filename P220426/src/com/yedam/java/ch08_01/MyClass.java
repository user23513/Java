package com.yedam.java.ch08_01;

public class MyClass {

	//필드
	Remotecontrol rc = new SmartTelevision();
	
	//생성자
    MyClass() {
    	
	}
	
    MyClass(Remotecontrol rc){
    	this.rc = rc;
    	this.rc.turnOn();
    	this.rc.turnOff();
    }
    //메소드
    void methodA() {
    	Remotecontrol rc = new Audio();
    	rc.turnOn();
    	rc.seVolume(5);
    }

	public void methodB(Remotecontrol rc) {
		rc.turnOn();
		rc.seVolume(5);
		
	}
    
	
}
