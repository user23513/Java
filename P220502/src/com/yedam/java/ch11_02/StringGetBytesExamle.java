package com.yedam.java.ch11_02;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExamle {

	public static void main(String[] args) {
		//490p
		//String 생성자 : byte타입을 -> String 타입 (디코딩)
		//getBytes 메소드 : String 타입 -> byte 타입 (인코딩)
		//디코딩 인코딩을 할 때 기준점이 항상 일치 해야함.
		
		String str = "안녕하세요";
		
		byte[] strBytes1 = str.getBytes();
		System.out.println(strBytes1);
		String str1 = new String(strBytes1);
		System.out.println(str1);
		
		try {
			byte[] strBytes2 = str.getBytes("EUC-KR"); //잘 모르겠다...
			System.out.println("strBytes2의 길이 : " + strBytes2.length);
			String str2 = new String(strBytes2, "EUC-KR"); //기준점이 되는 문자셋("EUC-KR")을 지정해줘야함
			System.out.println("strBytes2 -> String : " + str2);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
