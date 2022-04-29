package com.yedam.java.ch11_02;

public class StringCharAtExample { //주민등록번호로 성별을 구분하거나 나이를 구분할 때 많이 쓴다.
	                               //특정한 위치의 문자를 리턴합니다.
	
	public static void main(String[] args) {
		
		String ssn = "010624-1230123"; //성별은 7번째 인덱스
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1' :
		case '3' : 
			System.out.println("남자 입니다.");
			break;
		case '2' : 
		case '4' : 
			System.out.println("여자 입니다.");
			break;
			
			
		}
		
		
		
		
		
	}

}

