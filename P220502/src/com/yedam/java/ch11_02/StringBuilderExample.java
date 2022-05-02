package com.yedam.java.ch11_02;

public class StringBuilderExample {

	public static void main(String[] args) {

		//수정을 여러번 해야 하는 경우가 있다면
		//StringBuilder 사용
		//내부용 메모리를 가져 안에서 수정을 함
		
		StringBuffer sb = new StringBuffer();
		
		//문자열을 끝에 추가
		sb.append("Java "); //뒤에 붙인다는 의미
		sb.append("Progam Study");
		System.out.println(sb.toString()); //내부에 올려진 문자를 결합해서 돌려주겠다
		
		//해당 인덱스 위치 앞에 값을 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		//해당 인덱스 위치의 값을 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//시작 인덱스부터 지정한 인덱스 전까지 지정해서 대체
		sb.replace(6, 13, "Book ");
		System.out.println(sb.toString());
		
		//시작 인덱스부터 지정한 인덱스 전까지 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자 수 : " + length);
		
		//연산이 끝나면 반드시 String으로 반환해서 변수에 저장해줘야한다.
		String result = sb.toString();
		sb.delete(0, 4);
		System.out.println(result);
		System.out.println(sb.toString()); //문자열을 연산하고 그 값을 저장하려면 반드시 스트링으로 변수를 지정해서 저장해줘야한다.
		                                   //안하면 스트링빌드는 계속 연산하고 그전의 값은 저장되지않는다.
		String result1 = sb.toString();
		sb.delete(0, 3);
		System.out.println(result1);
		
		
				
		
		
		
	}

}
