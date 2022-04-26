package co.edu.getset;

public class Car {
	
	//필드
	private String company;
	private String model;
	private String color;
	private int speed;
	
	//생성자
	public Car() {
		
	}
	//메소드

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		//속도 mile(미국단위) -> km
		return speed*2;
	}

	public void setSpeed(int speed) {
		if(speed<0) {
			speed = 0;
		}
		this.speed = speed;
	}
	
}
