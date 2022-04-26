package homework;

public class StandardWeightInfo extends Human{

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public double getStandardWeight() {
		return (height - 100) * 0.9;
	}

	@Override
	public void getInformation() {
		System.out.println(name + "의 신장 " + height + ", 몸무게 " +  weight + ", 표준체중 " + getStandardWeight() + " 입니다.");
		
	}
	
	
}
