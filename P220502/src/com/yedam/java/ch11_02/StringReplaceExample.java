package com.yedam.java.ch11_02;

public class StringReplaceExample {

	public static void main(String[] args) {

		//494p 문자열 대치하기
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		//자바를 영문자로 바꿔보려고 한다.
		String newstr = oldStr.replace("자바", "JAVA");
		
		System.out.println(newstr);
		//기존의 한국어를 사용하고싶다
		System.out.println(oldStr); //Strig 객체의 문자열은 변경이 불가능함
		                            //따라서 newstr 변수는 완전 새로운 문자열 -> 힙영역에 새롭게 JAVA 객체가 생성된다.
		
		
		//수정 빈도수가 많은 것을 하려면 Stringbuilder사용 -> 내부에 저장소가 있어서 하나의 객체에서 모든게 이루어진다.
		
		
		
		
	}

}
