package co.edu.loop;

public class LoopExam {

	public static void main(String[] args) {

		int sum=0;
		 sum += 1;
		 sum += 2;
		 sum += 3;
		 sum += 4;
		 sum += 5;
		 System.out.println("1~5의 합 :" + sum);
		 
		 // 1-5까지의 합 반복문
		  
		 for(int i=1; i<5; i++) {
			 //sum +=i;
			 sum = sum + i;
			 
		 }
		 
		 
		 //구구단 2단 만들기 반복문
		 
		 for(int i = 1; i <= 9; i++) {
			 
			 for(int j = 1; j <= 9; j++) {
				 System.out.println(i + " * " + j + " = " + i*j);
				 
			 }
			
		 }
		 System.out.println("end of prog");
		 
		 System.out.println("------------------------");
		 
		 //3의 배수
		 
//		System.out.println("3의 배수 start!");
//		 for(int i =1; i<=100; i++) {
//			 if(i%2==1) {
//				 System.out.println("홀수 : " + i);
//			 }
//			 else if(i % 2 == 0) {
//				 System.out.println("짝수 : " + i);
//		     }
//		 }
//		 
//		 System.out.println("-----------------------------");

		 //*
		 //**
		 //***
		 //****
		 //*****
//		 
//		 for(int i = 1; i<6; i++) {
//			
//			 for(int j = 1; j <=i; j++) {
//				
//				 System.out.print("*");
//				}
//			 System.out.println();
//		 }
	
	
		 
		 //*****
		 //****
		 //***
		 //**
		 //*
		 
//		  for(int i = 5; i >0 && i <6; i--) {
//			  for(int j = 1; j<=i; j++ ) {
//				  System.out.print("*");
//			  }
//			  System.out.println();
//		  }
		 
		 //풀이
		 
//		 for (int = 1; i<6; i++) {
//			 for(int j = 5; j >=i;)
//		 }
		 
		 
		 //    *
		 //   **
		 //  ***
		 // ****
		 //*****
		 
//		 for(int i = 5; i >0 && i <6; i--) {
//			 
//			 for(int j = 1; j<i; j++ ) {
//				 System.out.print(" "); 
//				 if(j==i) {System.out.print("*");
//				 
//				 }
//				 System.out.println();
//					 }
//			}
			 
		 //풀이
		 
		 
		//1)
			//*****
			//****
		    //***
		    //**
			//*

			for(int i = 1; i<6; i++) {
				for(int j =5; j >=i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println(" ");

			//*
			//**
			//***
			//****
			//*****
			//2)
			for(int i =1; i<6; i++) {
				
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			//3-1)
			//    *
			//   **
			//  ***
			// ****
			//*****
			for(int i =0; i<=5; i++) {
				for(int j=5; j>0; j--) {
					if(i<j) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
				
			}
			//3-2)
			//    *
			//   **
			//  ***
			// ****
			//*****
			for(int i=4; i>=0;i--) {
				for(int j=0;j<5;j++) {
					if(i>j)
					System.out.print(" ");
					else
					System.out.print("*");
				}
				System.out.println();
			}
		 
		 

		 
		 
		 
		 
		 
	
	
	
	
	

		 }
}
		


