package co.edu.homework;

public class Student {
	
	//필드
		int studentNo;
		String studentName;
		int kor;
		int eng;
		int math;
		
		//생성자
		public Student() {
			
		}
		
		//메소드

		public int getStudentNo() {
			return studentNo;
		}

		public void setStudentNo(int studentNo) {
			this.studentNo = studentNo;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getKor() {
			return kor;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int math) {
			this.math = math;
		}
		
		public double avg() {
			int sum = kor + eng + math;
			double avg = (double) sum / 3; 
			return avg;
		}
		
		public void stuInfo() {
		System.out.println("이름 > " + getStudentName());
		System.out.println("국어 > " + getKor());
		System.out.println("영어 > " + getEng());
		System.out.println("수학 > " + getMath());
		System.out.printf("평균 > : %.1f\n", avg());
		}
		
		void ranking() {
			
			
		}
		

}
