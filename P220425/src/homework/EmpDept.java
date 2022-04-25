package homework;

public class EmpDept extends Employee {
	public String empdeptName;

	public EmpDept(String name, int Salary, String empdeptName) {
		super(name, Salary);
		this.empdeptName = empdeptName;
	}

	public String getEmpdeptName() {
		return empdeptName;
	}
	
	@Override
	public void getinformation() {
		System.out.println("이름 : " + name + ", 연봉 : " + Salary + ", 부서 : " + empdeptName);
	}
	
	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
	
	
	

}
