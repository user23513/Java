package co.edu.oop;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		int result = cal.plus(3, 2);
		System.out.println(result);
		
		result = cal.minus(10, 2);
		System.out.println(result);
		
		Calculator cal1 = new Calculator();
		
		//메소드에서 메소드 호출
		cal1.execute();
	    double avg = cal1.avg(10, 2);
		System.out.println(avg);		
		
		///////////////////////////////////////
		Calculator02 myCalcu = new Calculator02();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10,20);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
	}

}
