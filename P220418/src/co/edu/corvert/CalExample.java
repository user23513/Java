package co.edu.corvert;

public class CalExample {

	public static void main(String[] args) {
	 
		int intValue = 10;
		double doubleValue = 5.5;

		double result = intValue + doubleValue; //int를 double로 자동변환

		System.out.println(result);

		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;

		System.out.println(result2);

		
		char c = 'A';//65
		char d = 1;
		int result3 = c+d;
		
		System.out.println("유니코드 : "+result3);
		System.out.println("출력문자 : "+(char)result3);
		//System.out.println((char)66); - B
		
		//실수타입 변환
		int i =1 ;
		double result4;
		
		result4 = i/5; // 정수타입이라 소수점을 표현을 못해서 몫이 0으로 출력
		System.out.println(result4);
		
	    result4 = i/5.0;
	    System.out.println(result4);
	    
	    result4 = (double) i/5;
	    System.out.println(result4);
	    
	    //문자열 + 연산
	    
	    //숫자 + 숫자 
	    int value =15;
	    System.out.println(value+3);
	    //문자열 + 숫자
	    System.out.println("문자열+숫자 :" +value + 2); // 전체 문자열로 인식
	    System.out.println("문자열+숫자 :" + (value + 2)); // 숫자로 인식하게 하려면
	    //숫자 + 문자열
	    System.out.println(value + 2 + " 숫자 + 문자열");
	    
	    //문자열 -> 숫자로 타입 변환
	    //(double), (int) = 숫자 연산에서만 사용
	    
	    String str = "1000";
	    int value1 = Integer.parseInt(str);
	    System.out.println(value1);
	    
	    String str1 = "0.3";
	    double value2 = Double.parseDouble(str1);
	    System.out.println(value2);
	    
	    String str3 = "가나다";
	    int value3 = Integer.parseInt(str3);
	    System.out.println(str3);
	    
	    //숫자를 문자열로 변환
	    String str4 = String.valueOf(value1);
	    
	    
	   
		
	    
	}

}
