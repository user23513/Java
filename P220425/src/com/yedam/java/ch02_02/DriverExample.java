package com.yedam.java.ch02_02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);  // 버스가 달립니다. bus -> vehicle
		driver.drive(taxi); // 택시가 달립니다. taxi -> vehicle
		
	}

}
