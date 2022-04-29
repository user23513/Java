package homework;

public class Question2 {
	public static void main(String[] args) {
		
		//다음과 같이 출력결과가 나오도록 실행코드를 수정하세요.
		//출력결과 3
		//      4
		//조건 : try~catch~finally문 사용
		
		try {
		     method1();
		}catch( NullPointerException e){
           
			
			
		}finally {
			System.out.println(3);
			
			System.out.println(4);
			
			
		}
		
	
		}
		
    public static void method1(){
	          throw new NullPointerException();

}
}