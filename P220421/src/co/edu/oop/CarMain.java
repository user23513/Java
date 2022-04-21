package co.edu.oop;

public class CarMain {

	public static void main(String[] args) {

		Car myCar = new Car(); //자동차 객체 생성
		
		myCar.company = "기아";
		myCar.model = "K3";
		myCar.color = "white";
		myCar.maxSpeed = 150;
		
		myCar.info();
		
		System.out.println();
		//생성자를 통한 데이터 입력
		System.out.println("---생성자를 통한 데이터 입력---");
		
		Car myCar2 = new Car("sonata", "black");
		
		myCar2.info();
		
		System.out.println();
		
		Car myCar3 = new Car("현대", "아우디", "black", 100);
		myCar3.info();
		
		
		
	}

}
