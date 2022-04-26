package homework;

public class Movie extends Culture {

	public Movie(String title, int directorNum, int actorNumber) {
		super(title, directorNum, actorNumber);
	}
	String genre;
	
	
	
	public void getInformation() {
		System.out.println("��ȭ���� : " + title + "\n���� : " + directorNum + "\n��� : "+ actorNum + "\n��ȭ���� : " + totalScore + "\n��ȭ���� : ");
	}

}
