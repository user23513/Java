package co.edu.oper;

public class OperatorExam2 {

	public static void main(String[] args) {
		
		//논리 부정 연산자.
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
		
//		int i=99;
//		
//			System.out.println("참입니다.");
//        } else {
//        	System.out.println("거짓입니다.");
//        }
        
        String str="서브웨이";
        String str2 = "서브웨이";
        
        if(str.equals(str2)) {
        	System.out.println("맛있다.");
        } else {
        	System.out.println("별로다.");
        }
        
        int var=6;
        
        if(var % 2 == 0 && var % 3 == 0) {
        	System.out.println("2의 배수 이면서, 3의 배수입니다.");
        } else {
        	System.out.println("2 그리고 3의 배수가 아닙니다.");
        	}
        
        int var2 = 9;
        
        if(var2 % 2 == 0 || var2 % 3 == 0) {
        	System.out.println("2의 배수 이면서, 3의 배수입니다.");
        } else {
        	System.out.println("2 그리고 3의 배수가 아닙니다.");
        	}
        
        boolean flag2 = true;
        if(!flag) {
        	System.out.println("참");
        }else {
        	System.out.println("거짓");
        }
        
        int score=40;
        char grade=(score>90) ? 'A':'B';
        System.out.println("학점은" + grade +"입니다.");
        

        
        
        
        }
	}

