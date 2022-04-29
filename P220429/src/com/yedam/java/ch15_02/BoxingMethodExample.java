package com.yedam.java.ch15_02;

public class BoxingMethodExample {

	public static void main(String[] args) {

	         Box<Integer> box =	Util.<Integer> boxing(100);  //메소드 이름 앞에 <>뭘 넣을 지 정해줌. <T, M, ```>
	         int intValue = box.getT();
	         
	         Box<String> strBox = Util.<String>boxing("String");
	         String strValue = strBox.getT();
		
		
	}

}
