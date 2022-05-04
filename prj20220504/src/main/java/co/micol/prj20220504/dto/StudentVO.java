package co.micol.prj20220504.dto;

import java.sql.Date;

public class StudentVO {
	//멤버변수와 게터세터로만 이루어진것을 DTO라 한다.
	private String id; //학번
	private String name; 
	private String major; 
	private String address;
	private String tel;
	private Date birthday;
	
	//생성자 오버로딩
	public StudentVO() {
		
	}
	
	public StudentVO(String id, String name, String major, String address, String tel, Date birthday) {
		this.id = id;
		this.name = name;
		this.major = major;
		this.address = address;
		this.tel = tel;
		this.birthday = birthday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {  //toString메소드는 String객체 리턴시킴 /toString()메소드는 String을 타입으로 받는다.
		System.out.print(id + " : ");
		System.out.print(name + " : ");
		System.out.print(major + " : ");
		System.out.print(address + " : ");
		System.out.print(tel + " : ");
		System.out.println(birthday + " : ");
		return null; //출력용으로만 쓸거기때문에 돌려받을 값이 없다.
	}
	
	
	

}
