package homework;

public class Performance extends Culture {

	String genre;
	
	public Performance(String title, int directorNum, int actorNum) {
		super(title, directorNum, actorNum);
	}

	
	public void getInformation() {
		System.out.println("�������� : " + title + "\n���� : " + directorNum + "\n��� : "+ actorNum + "\n�������� : " + this.totalScore + "\n�������� : " );
	}
	
}
