package co.edu.company;

public class Manager extends Employee {

	//메소드 오버라이드
	@Override
	int getSalary() {
		return baseSalary + 1000000;
	}

}
