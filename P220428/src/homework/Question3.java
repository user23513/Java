package homework;

public class Question3 {

	public static void main(String[] args) {

		//출력결과가 나오도록 실행코드를 수정하세요.
				//조건 - 다중 catch문 사용
				
				try {
					method(false);
					method(true);
				
				}catch(NullPointerException e) {
					 
					
				}catch(Exception e) {
					System.out.println(2);
					System.out.println(5);
					System.out.println(6);
				}
				
			}
			
			public static void method(boolean value) {
				System.out.println(1);
				
				if(value) {
					throw new RuntimeException();  //실행예외
				}
				
				System.out.println(3);
				System.out.println(5);
		
	}

}

//출력결과 1
//3
//5
//1
//2
//5
//6
