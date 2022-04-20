package co.edu.array;

public class ArrayExam3 {
	public static void main(String[] args) {
		
		// 1. 1~100까지 데이터를 넣은 배열에서 3의 배수만 출력
		int[] ary = new int[100];
		
		for(int i = 1; i < ary.length; i++) {
			ary[i-1] = i;
		}
		for(int i = 1; i < ary.length; i++)	{
			if(ary[i-1] % 3 == 0) {
				System.out.println("3의 배수 : " + ary[i-1]);
			}
		}
		
		System.out.println();
		// 2. 위에서 만든 배열에서 짝수만 출력
		
		for(int i = 0; i < ary.length; i++) {
			ary[i] = i+1;
			if(ary[i] % 2 == 0) {
				System.out.println("짝수 : " + ary[i]);
			}
			
		}
		
		
	}

}
