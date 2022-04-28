package com.yedam.java.ch10_01;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		//447p
		//예외는 한번 발생하면 비정상적으로 종료 -> 다음줄은 실행조차도 안된다.
		//배열 길이가 0인데 그 길이를 초과해서 오류
		//if문을 통해서 예외처리
		
		if(args.length == 2) {
		String data1 = args[0];
		String data2 = args[1];

		System.out.println("args[0]" + data1); //여기서 비정상적으로 종료
		System.out.println("args[1]" + data2); //실행되지 않음
		}else {
			System.out.println("매개변수를 2개 입력해주세요.");
		}
		
	}

}
