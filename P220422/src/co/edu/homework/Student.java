package co.edu.homework;

public class Student {
	
	//필드
	public int studentNo; //내가 입력한 학번
	public String studentName; //이름
	public int kor;            //국어
	public int eng;            //영어
	public int math;           //수학

	//생성자
	
	//메소드
	int[] ary1 = null;
	void stuNo(int stuNum) {
		int[] ary = new int[stuNum];
		ary = ary1;
	}
	
	public String getInfo() {
		return "";
	}
	
	void setInfo(int stuNo, String stuName, int kor, int eng, int math) {
		for(int j = 0; 0 < ary1.length; j++ ) {
			
			this.studentNo = stuNo;
			this.studentName = stuName;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			
		}
	}
	
	
}
