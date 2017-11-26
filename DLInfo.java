public class DLInfo {

	private String name;
	private int timesDownloaded = 0;

	public DLInfo(String title) {
		name = title;
	}

	public String getTitle() {
		return name;
	}

	public void incrementTimesDownload() {
		timesDownloaded++;
	}

}