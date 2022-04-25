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
	
	public void setTotalScore(int Score) {
		totalScore = totalScore + Score;
	}
	
	public String getGrade() {
		return "";
	}
	
	public abstract void  getinformation();
	
	
	
	

}
