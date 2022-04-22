package co.edu.getset;

public class Student {

	int number;
	String name;
	int korean;
	int math;
	int english;
	
	public Student() {
		
	}
	
    void info(int number, String name, int ko, int math, int en) {
    	System.out.println("\n학번 : " + number + " | 이름 : " + name + " | 국어 점수 : " + ko + " | 수학 점수 : " + math + " | 영어 점수 : " + en);
    }
    
    double avg(int ko, int math, int en) {
    	int sum = ko + math + en;
    	double avg = sum / 3.0;
    	return avg;
    }

}
