package co.edu.extend;

//자식클래스(318p)
public class Computer extends Cal {
	
	
	@Override
	double areaCircle(double r) {
		System.out.println("자식 클래스에서 areaCircle() 실행");
		return Math.PI * r * r; 
	}

}
