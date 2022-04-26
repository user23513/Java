package co.edu.member;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person("123456-789789", "홍길동");
		
		System.out.println(p1.nation + ", " + p1.ssn + ", " + p1.name);
		
		//p1.nation = "USA";
		
	}

}
