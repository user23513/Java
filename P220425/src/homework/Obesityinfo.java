package homework;

public class Obesityinfo extends StandardWeightinfo {

	public Obesityinfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	 public double getObesity() {
		 double obesity = (weight - 100) * 0.9;
		 return obesity;
	 }
	
//	@Override
//	public void getinformation() {
//		if( < ) {
//		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + ", 비만입니다."  );
//	  }else {
//		  System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + ", 비만이 아닙니다."  );
//	  }
//	}
}
