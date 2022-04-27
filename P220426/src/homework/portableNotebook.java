package homework;

public class portableNotebook implements Notebook, Tablet {

	public int mode;
	public String dacument;
	public String internet;
	public String video;
	public String app;
	
	public portableNotebook(String dacument, String internet, String video, String app) {
		this.dacument = dacument;
		this.internet = internet;
		this.video = video;
		this.app = app;
		mode = NOTEBOOK_MODE;
		System.out.println("NOTEBOOK_MODE");
	}
	
	@Override
	public void writeDocumentation() {
		System.out.println(dacument + "을 통해 문서를 작성.");
	}
	
	@Override
	public void searchInternet() {
		System.out.println(internet + "를 통해 인터넷을 검색.");
	}
	
	@Override
	public void watchVideo() {
		System.out.println(video + "를 시청.");
	}

	@Override
	public void useApp() {
		if(mode == NOTEBOOK_MODE) {
			mode++;
			System.out.println("TABLET_MODE");
			System.out.println(app + "를 실행.");
		}else {
			System.out.println(app + "를 실행.");
		}
	}


	public void changMode() {
	  if(mode == NOTEBOOK_MODE) {
		mode++;
		System.out.println("TABLET_MODE");
	} else if(mode == TABLET_MODE) {
			mode--;
			System.out.println("NOTEBOOK_MODE");
	}

}
}
