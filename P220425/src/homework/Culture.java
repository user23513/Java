package homework;

public abstract class Culture {
	
	public String title;
	public int directorNum;
	public int actorNum;
	public int audienceNum;
	public int totalScore;
	
	public Culture(String title, int directorNum, int actorNum) {
		this.title = title;
		this.directorNum = directorNum;
		this.actorNum = actorNum;
	}
	
	public void setTotalScore(int score) {
		
		this.totalScore += score;
	}
	int sum = 0;
	public void getGrade() {	
		int grade[] = {3,5,4};
		for(int i = 0; i < grade.length; i++) {
			sum += grade[i];
		}
		int avg = sum / grade.length;
		
		switch(avg) {
		case 1 :
			System.out.println("☆");
		break;
		
		case 2 :
			System.out.println("☆☆");
		break;
		
		case 3 :
			System.out.println("☆☆☆");
		break;
		
		case 4 :
			System.out.println("☆☆☆☆");
		break;
		
		case 5 :
			System.out.println("☆☆☆☆☆");
		break;
		
		}
		
	}
	
	public abstract void getInformation();
	
	

}
