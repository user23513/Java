package homework;

public class StandardWeightinfo extends Human {

	
	public StandardWeightinfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}
	
	public double getStandardWeight() {
		double standardWeigh = (height -100) * 0.9;
		return standardWeigh;
		}
	@Override
	public void getinformation() {
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + ", 표준체중 " +  " 입니다.");
	}
	
	

	
	

}
