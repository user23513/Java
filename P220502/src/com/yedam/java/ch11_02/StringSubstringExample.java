package com.yedam.java.ch11_02;

public class StringSubstringExample {

	public static void main(String[] args) {

		//494p
		String ssn = "880815-1234567";
		//인덱스의 정확한 위치를 알아야 하기 때문에 indexOf()를 이용해서 잘라내고자 하는 곳이 어디에있는지 알 수 있다.
		String firstNum = ssn.substring(0,6); //0~5까지의 인덱스를 잘라오겟다.
		System.out.println(firstNum);         //"880815"가 출력.
		
		String secontNum = ssn.substring(7);  //시작되는 인덱스부터 마지막까지 잘라오겠다.
		System.out.println(secontNum);        //"1234567"이 출력.
		
		
	}

}
