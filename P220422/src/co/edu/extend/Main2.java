package co.edu.extend;

//(321p)
public class Main2 {
	
	public static void main(String[] args) {
		
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		//부모 클래스의 takeOff 메소드 호출
		sa.takeOff();
		//자식 클래스의 오버라이드한 fly메소드
		sa.fly();
		
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		//자식 클래스의 오버라이드한 fly메소드
		sa.fly();
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		//자식 클래스의 오버라이드한 fly메소드
		sa.fly();
		//부모 클래스의 takeOff 메소드 호출
		sa.land();
		
				
	}

}
