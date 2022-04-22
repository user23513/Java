package co.edu.member;

public class PizzaMain {

	public static void main(String[] args) {

		//StaticMember sm = new StaticMember();
		
		double pi = StaticMember.PI;
		System.out.println(pi);
		
		int sum = StaticMember.plus(5, 10);
		System.out.println(sum);
		
		int minus = StaticMember.minus(10, 1);
		System.out.println(minus);
		
		Pizza p1 = new Pizza("super suprme");
		Pizza p2 = new Pizza("chese");
		Pizza p3 = new Pizza("perpperori");
		
		int sales = Pizza.count;
		System.out.println("판매된 피자갯수: " + sales);
		
//		Singleton obj1 = Singleton.getInstace();
//		Singleton obj2 = Singleton.getInstace();
		
		if(p1 != p2) {
			System.out.println("같은 피자 아닙니다.");
		}
		
	}

}
