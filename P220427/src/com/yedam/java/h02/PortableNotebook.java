package com.yedam.java.h02;

public class PortableNotebook implements Notebook, Tablet {
	private int mode;
	private String document;
	private String browser;
	private String video;
	private String app;
	
	public PortableNotebook(String document, String browser, String video, String app ) {
		this.document = document;
		this.browser = browser;
		this.video = video;
		this.app = app;
		this.mode = Notebook.NOTEBOOK_MODE;
		System.out.println("NOTEBOOK_MODE");
	}

	@Override
	public void watchVideo() {
		System.out.println(video + "를 시청");
	}

	@Override
	public void useApp() {
		if(this.mode == Notebook.NOTEBOOK_MODE) {
			changeMode();
		}
		
		System.out.println(app + "를 실행.");

	}

	@Override
	public void writeDocumentaion() {
		System.out.println(document + "을 통해 문서 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println(browser + "을 통해 인터넷을 검색");
	}
	
	public void changeMode() {
		if(this.mode == Notebook.NOTEBOOK_MODE) {
			this.mode = Tablet.TABLET_MODE;
			System.out.println("TABLET_MODE");
		}else if(this.mode == Tablet.TABLET_MODE){
			this.mode = Notebook.NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}
	}

}
