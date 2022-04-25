package homework;

public class Employee {
	
	//필드
	public String name;
	public int Salary;
	
	//생성자
	public Employee(String name, int Salary) {
		this.name = name;
		this.Salary = Salary;
	}

	//메소드
	public String getName() {
		return name;
	}

	public int getSalary() {
		return Salary;
	}
	
	public void getinformation() {
		System.out.println("이름 : " + name + ", 연봉 : " + Salary);
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}
	
	
	
	

}
