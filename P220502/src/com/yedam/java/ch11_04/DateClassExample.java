package com.yedam.java.ch11_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassExample {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());  
		
		//비영어권에서 쓰는 경우 원하는 양식으로 변환할 때 같이 쓰는 클래스가 있다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
        		
		
		
		
	}

}
