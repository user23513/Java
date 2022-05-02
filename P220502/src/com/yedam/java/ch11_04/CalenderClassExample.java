package com.yedam.java.ch11_04;

import java.util.Calendar;

public class CalenderClassExample {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; 
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			 break;
        case Calendar.TUESDAY:
        	strWeek = "화";
			 break;
        case Calendar.WEDNESDAY:
	        strWeek = "수";
			 break;
        case Calendar.THURSDAY:
	        strWeek = "목";
		     break;
        case Calendar.FRIDAY:
	        strWeek = "금";
		     break;
        case Calendar.SATURDAY:
	        strWeek = "토";
		     break;
	    default:
			strWeek = "일";
			 break;
		}
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
			
		}else {
			strAmPm = "오후";
			
		}
			
		int hour = cal.get(Calendar.HOUR);
		int miniute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(miniute + "분 ");
		System.out.println(second + "초 ");
		
		
		
	}

}
