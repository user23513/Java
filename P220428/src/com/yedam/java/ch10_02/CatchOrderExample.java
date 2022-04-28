package com.yedam.java.ch10_02;

public class CatchOrderExample {

	public static void main(String[] args) {

		try {
			String data1 = args[0]; 
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
			
		}catch(NumberFormatException e) { //이거 일때만 별도처리 -> 무조건 Exception보다 앞에 있어야함.
			System.out.println("숫자로 변환할 수 없습니다.");
		}catch(Exception e){ //부모클래스 Exception -> 모든 예외처리. - 항상 마지막 catch구문에 있어야함.
			System.out.println("다시 실행!");
		}finally {
			System.out.println("항상 실행!");
		}
	}

}
