package homework;

public class Question1 {

	// 실행코드에서 발생할 수 있는 예외가 무엇인지 채워넣으세요.
    public static void main(String[] args) {
    	String[] strArray = {"10", "2a"};
    	int value = 0;
    	for(int i = 0; i<=2; i++) {          //배열크기 맞지 않다.
    		try {
    			value = Integer.parseInt(strArray[i]);  // "2a" 인티저로 가능하지 않다.
    		}catch(NumberFormatException e) {
    			System.out.println("숫자로 변환할 수 없습니다.");
    		}catch(ArrayIndexOutOfBoundsException e) {
    			System.out.println("인덱스 범위를 초과하였습니다.");
    		}finally {
    			System.out.println(value);     //이 값은 무조건 출력
     		}
    	}
    	
    	
    }
	
}
