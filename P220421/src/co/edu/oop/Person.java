package co.edu.oop;

public class Person {
	
	//필드
	String ssn;
	String name;
	String adress;
	int age;
	
	//생성자
	
	//생성자1
	public Person() {
		
	}
	
	//생성자 2
	public Person(String ssn, String name, String adress, int age) {
		
		this.ssn = ssn;
		this.name = name;
		this.adress = adress;
		this.age = age;
	}
	//메소드
	void introduce() {
		System.out.println("Person[주민번호 : " + ssn + ", 이름 : " + name + ", 주소 : " + adress + ", 나이 : " + age + "]" );
	}
	

}
