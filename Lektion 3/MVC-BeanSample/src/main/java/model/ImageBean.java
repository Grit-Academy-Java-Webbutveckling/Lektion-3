package model;

public class ImageBean {
	private String whatToShow = "";
	
	public String getWhatToShow() {
		return whatToShow;
	}

	public void setWhatToShow(String whatToShow) {
		this.whatToShow = whatToShow;
	}

	public String getFileName() {
		return ImageHandler.getFileName(whatToShow);
	}

}
