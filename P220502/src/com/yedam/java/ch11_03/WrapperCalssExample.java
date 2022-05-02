package com.yedam.java.ch11_03;

public class WrapperCalssExample {

	public static void main(String[] args) {

		//Boxing
		//new연산자를 이용한 방식은 권장하지 않는다.
		Integer obj1 = Integer.valueOf(300); //문자열도 가능하고 기본타입의 정수도 가능하다."300" or 300
		Integer obj2 = Integer.valueOf("300");
		
		//UnBoxing
		int value1 = obj1.intValue();
		System.out.println(value1);
		
		//자동 Boxing
		Integer obj = 100; //->Heap영역에 새로운 객체 생성
		System.out.println("value : " + obj.intValue());
		
		//대입 시 자동 UnBoxing
		int value = obj; //obj는 클래스라 객체를 참고, 변수에 넘겨주는 것은 객체의 주소값이 아니라 객체가 가지고 있는 내부값을 넘겨준다.
		                 //->Heap영역에 객체의 값을 복사
		System.out.println("value : " + value);
		
		//연산시 자동 UnBoxing
		int result = obj + 100; //-> 100 + 100;
		System.out.println("result : " + result); 
		
		//포장 객체 비교
		//503p
		
		//범위 안의 값
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과 :" + (obj3==obj4));
		System.out.println("언박싱 후 ==결과 :" + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과 : " + obj3.equals(obj4));
		
		//범위를 벗어날 경우
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj5 = 300;
		Integer obj6 = 300;
		System.out.println("==결과 :" + (obj5==obj6));
		System.out.println("언박싱 후 ==결과 :" + (obj5.intValue() == obj6.intValue()));
		System.out.println("equals() 결과 : " + obj5.equals(obj6));
		
		
		
		
		
		
		
	}

}
