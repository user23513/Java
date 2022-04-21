package co.edu.oop;

public class Mall {
	//모든 필드를 포함한 생성자 작성
	//필드에 입력된 데이터를 출력할 수 있도록 구현
	//조건) 1. Scanner를 통해 데이터를 받은 것을 객체 생성시 사용
	//       (생성자에 매개변수를 통한 객체 생성)
	
	//필드
	int oderNo;
	String id;
	String name;
	int productNo;
	String adress;
	
	//생성자
	public Mall(int oderNo, String id, String name, int productNo, String adress) {
		//super();
		this.oderNo = oderNo;
		this.id = id;
		this.name = name;
		this.productNo = productNo;
		this.adress = adress;
	}
		
	//메소드
	
	void info() {
		System.out.println("주문 번호 입력 : " + oderNo);
		
		System.out.println("주문자 아이디 입력 : " + id);
		
		System.out.println("주문자 이름 입력 : " + name);
		
		System.out.println("상품 번호 입력 : " + productNo);
		
		System.out.println("주소 입력 : " + adress);
		
		
		
	}

}
