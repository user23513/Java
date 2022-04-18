package co.edu.oper;

public class OperatorExam {

	public static void main(String[] args) {
		
		// + - * / %
		//      / -> 몫
		//      % -> 나머지
		// 10000초 -> 10000/(60*60) => 시간
		//          -> 10000/60 => 분
		//          -> 10000%60 => 초
		
		int hour = 10000/(60*60); // 10000초 -> 시간
		int min = 10000/60; // 10000초 -> 분
		int sec = 10000%60; // 남은 초 계산
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		
		
		int i = 0;
//		
//		i = i + 1;
//		//대입 연산자
//		i += 1;
//		//증강 연산자
//		i++;
//		++i; 
		
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
			

	}

}
