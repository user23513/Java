package co.edu.oop;

public class PersonMain {

	public static void main(String[] args) {

		System.out.println("-----기본 생성자-----");
		
		Person per = new Person();
		
		per.ssn = "456-456";
		per.name = "최길동";
		per.adress = "광주";
		per.age = 65;
		
		per.introduce();
		
		System.out.println();
		
		System.out.println("-----매개변수 생성자-----");
		
		Person per1 = new Person("123-123", "홍길동", "대구", 20);
		per1.introduce();
		
		Person per2 = new Person("546-456", "김길동", "서울", 32);
		per2.introduce();
		
		Person per3 = new Person("789-789", "이길동", "부산", 48);
		per3.introduce();
	}

}
