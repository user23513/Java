package co.edu.oop;

public class Bank {
	
	//필드
	String accNumber; //123-123
	String name;      //홍길동
	int balance;      //50000
	//생성자
	public Bank(String accNumber, String name, int balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	//메소드
	
	//예금
	void deposit(int money) {
		balance += money;
		System.out.println("계좌번호 : " + accNumber);
		System.out.println("예금주 : " + name);
		System.out.println("예금 후 잔액 : " + balance);
	}
	
	//출금
	void withdraw(int money) {
		balance -= money;
		System.out.println("계좌번호 : " + accNumber);
		System.out.println("예금주 : " + name);
		System.out.println("예금 후 잔액 : " + balance);
	}
	
	//잔액확인
	int nowMoney() {
		return balance;
	
	}
	
	

}
