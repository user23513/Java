package co.edu.oop;

import java.util.Scanner;

public class MallMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("주문 번호 입력> ");
		int odNo = Integer.parseInt(sc.nextLine());
		
		System.out.print("주문자 아이디 입력> ");
		String id = sc.nextLine();
		
		System.out.print("주문자 이름 입력> ");
		String name = sc.nextLine();
		
		System.out.print("상품 번호 입력> ");
		int proNo = Integer.parseInt(sc.nextLine());
		
		System.out.print("주소 입력> ");
		String ad = sc.nextLine();
		
		System.out.println("-------------------------------");
		Mall mall = new Mall(odNo, id, name, proNo, ad);
		
		mall.info();
		
		
	}

}
