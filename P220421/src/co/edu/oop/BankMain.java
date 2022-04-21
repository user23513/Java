package co.edu.oop;

import java.util.Scanner;

public class BankMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Bank bank = new Bank("123-123", "홍길동", 50000);
		
		boolean run = true;
		int menu = 0;
		int money = 0;
		while(run) {
			System.out.println("1. 예금 | 2.출금 | 3.잔액 확인 | 4.종료 ");
			System.out.print("선택 > ");
			menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("예금액 입력 : ");
				money = sc.nextInt();
				bank.deposit(money);
			}else if(menu == 2) {
				System.out.print("출금액 입력 : ");
				money = sc.nextInt();
				bank.withdraw(money);
			}else if (menu == 3) {
				System.out.println("잔액 확인");
				System.out.println(bank.nowMoney() + "원 입니다");
			}else if ( menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}
			
		
		
		
		
	}

}
