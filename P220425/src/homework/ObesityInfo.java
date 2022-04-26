package homework;

public class ObesityInfo extends StandardWeightInfo {

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	@Override
	public void getInformation() {
		if(getStandardWeight() < weight) {
		System.out.println(name + "의 신장 " + height + ", 몸무게 " +  weight + ", " + "비만입니다.");
	}else {
		System.out.println(name + "의 신장 " + height + ", 몸무게 " +  weight + ", "  + "비만이 아닙니다.");

	}
	}
	
	public double getObesity() {
	    return weight / getStandardWeight() * 100 ;
	   
	}

	
	

	
	
	

}
