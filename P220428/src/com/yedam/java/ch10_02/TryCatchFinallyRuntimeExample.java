package com.yedam.java.ch10_02;

public class TryCatchFinallyRuntimeExample {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;
		
		try {
		data1 = args[0]; //숫자 넣었는데 왜 실행?
		data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}
		
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
        int result = value1 + value2;
        		
        System.out.println(value1 + "+" + value2 + "=" + result);		
		}catch(NumberFormatException e){
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally { //어떤 조건에서도 무조건 실행 - ()가 없다.
			System.out.println("항상 실행!");
		}
				
	}

}
