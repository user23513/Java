package com.yedam.java.ch10_02;

public class CatchByExceptionExample {

	public static void main(String[] args) {

		try {
			String data1 = args[0]; //예외가 나오면 밑에 실행X -> 바로 catch문으로 넘어감
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(NumberFormatException e) { //이부분을 지나가긴 하는데 이미 예외밑에는 실행되지않았기 때문에 그냥 넘어간다.
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("항상 실행!");
		}
	}

}
