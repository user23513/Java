package co.edu.oop;

public class KoreanMain {

	public static void main(String[] args) {

		//각 객체에 주소번지 -> 100번지 -> 데이터 호출
		Korean k1 = new Korean("박자바", "012345-124578");
		k1.getInfo();
		
		System.out.println();
		
		Korean k2 = new Korean("김자바", "852025-145787");
		k2.getInfo();
		
		System.out.println();
		
		Korean k3 = new Korean("미국", "이자바", "123456-123456");
		k3.getInfo();
		
		
	}

}
