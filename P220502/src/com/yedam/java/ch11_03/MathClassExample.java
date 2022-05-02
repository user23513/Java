package com.yedam.java.ch11_03;

public class MathClassExample {

	public static void main(String[] args) {

		//504-505p
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 : " + v1); //5
		System.out.println("v2 : " + v2);  
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 : " + v3);  
		System.out.println("v4 : " + v4);  
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 : " + v5);  
		System.out.println("v6 : " + v6);
		
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 : " + v8);  
		System.out.println("v7 : " + v8);  


		int v9 = Math.min(5, 9);
		double v10 = Math.max(5.3, 2.5);
		System.out.println("v9 : " + v10);  
		System.out.println("v9 : " + v10);
		
		double v11 = Math.random();
		
		System.out.println("v11 : " + v11); 
		
		double v12 = Math.rint(5.3); //어디에 더 가깝냐.
		double v13 = Math.rint(5.7);
		System.out.println("v12 : " + v12); 
		System.out.println("v13 : " + v13); 

		//round()는 반올림을 합니다. 어디서 할까요? 소숫점 이하 몇자리까지 반올림합니다. 몇자리? 첫째자리
		long v14 = Math.round(5.3); 
		long v15 = Math.round(5.7);
		System.out.println("v14 : " + v14); 
		System.out.println("v15 : " + v15); 
		
		//소숫점 이하 세번째자리에서 반올림을 하고싶다.
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1); //1235.0
		double v16 = temp2 / 100.0; //12.35
		System.out.println(v16);
		
		//rint와 round는 소수점이하 첫번째에서 반올림하는건 똑같음 - 양수일때
		//음수일 때 결과값은 다르다.
		//rint() 와 round()의 차이
		//rint는 중앙값은 반올림과 달리 짝수값에 넘어간다. 0.5 -> 0과1 두수의 중앙 -> 짝수는 0이므로 짝수값에 넘어간다.
		//1.5 -> 짝수값 2로 넘어간다.
		
		System.out.println("round(0.5) : " + Math.round(0.5)); //
		System.out.println("rint(0.5) : " + Math.rint(0.5));   //
		
		System.out.println("round(0.5) : " + Math.round(1.5)); //
		System.out.println("rint(0.5) : " + Math.rint(1.5));   // 
		

				
	}

}
