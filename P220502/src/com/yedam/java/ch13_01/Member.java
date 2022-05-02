package com.yedam.java.ch13_01;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return name.equals(member.name) && (age == member.age);
		}else {
			return false;
		}
	
	}
	
	
	
	
	
	
}
