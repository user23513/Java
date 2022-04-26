package co.edu.member;

public class SingletonMain {

	public static void main(String[] args) {

		
		Singleton obj1 = Singleton.getInstace();
		Singleton obj2 = Singleton.getInstace();
		
		if(obj1 == obj2);{
			System.out.println("하나의 싱글톤 객체 입니다.");
		}
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
	}

}
