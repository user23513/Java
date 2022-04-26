package homework;

public class CultureMain {

	public static void main(String[] args) {

		Movie movie = new Movie("추격자", 7, 5);
		movie.getInformation();
		
		System.out.println("====================");
		
		Performance perform = new Performance("지킬앤하이드", 9, 10);
		perform.getInformation();
	}
}
