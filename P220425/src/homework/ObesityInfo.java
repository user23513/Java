package homework;

public class ObesityInfo extends StandardWeightInfo {

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	@Override
	public void getInformation() {
		if(getStandardWeight() < weight) {
		System.out.println(name + "�� ���� " + height + ", ������ " +  weight + ", " + "���Դϴ�.");
	}else {
		System.out.println(name + "�� ���� " + height + ", ������ " +  weight + ", "  + "���� �ƴմϴ�.");

	}
	}
	
	public double getObesity() {
	    return weight / getStandardWeight() * 100 ;
	   
	}

	
	

	
	
	

}