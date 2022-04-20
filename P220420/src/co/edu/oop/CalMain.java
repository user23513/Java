package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {
		
		Calculator cal =new Calculator();
		
		cal.x = 5;
		cal.y = 2;
		
		cal.plus(10, 2);
		cal.minus(100,20);
		cal.multi(5, 6);
		cal.div(5, 1);
		
		Car car = new Car(); //G바겐
		
		Car car2 = new Car(); //소나타
	
		car.model = "G바겐";
		car.color = "black";
		car.price = 30000000;
		car.info();
		
		car2.model = "소나타";
		car2.color = "white";
		car2.price = 10000000;
		car2.info();
		
		Car car3 = new Car("그랜저", "black", 200);
		car3.info();
		
				
	}
}
