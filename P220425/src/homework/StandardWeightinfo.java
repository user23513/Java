package homework;

public class StandardWeightinfo extends Human {

	
	public StandardWeightinfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public double getStandardWeight() {
		return (height - 100) * 0.9;
	}

	@Override
	public void getInformation() {
		System.out.println(name + "�� ���� " + height + ", ������ " +  weight + ", ǥ��ü�� " + getStandardWeight() + " �Դϴ�.");
		
	}

	

	
	

}
