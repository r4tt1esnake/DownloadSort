import java.util.*;

public class MusicDownloads {

	private List<DLInfo> dlList;

	public MusicDownloads() {
		dlList = new ArrayList<DLInfo>();
	}

	public DLInfo getDownloadInfo(String title) {
		for(int i = 0; i < dlList.size(); i++) {
			if(dlList.get(i).getTitle().equals(title)) {
				return dlList.get(i);
			}
		}
		return null;
	}

	public void udpateDownload(List<String> titles) {

		for(String currentTitle : titles) {
			if(getDownloadInfo(currentTitle) == null) {
				DLInfo toAdd = new DLInfo(currentTitle);
				dlList.add(toAdd);
			} else {
				getDownloadInfo(currentTitle).incrementTimesDownload();
			}
		}
	}

}