package com.ldw.eagle.multipledownload;

/**
 *eagle
 * 
 */
public class DownloadingInfo {

	private String kbps = "0";
	private int secondSize = 0;
	private int fileSize = 0;

	public String getKbps() {
		return kbps;
	}

	public void setKbps(String kbps) {
		this.kbps = kbps;
	}

	public int getSecondSize() {
		return secondSize;
	}

	public void setSecondSize(int secondSize) {
		this.secondSize = secondSize;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "DownloadingInfo [kbps=" + kbps + ", secondSize=" + secondSize
				+ ", fileSize=" + fileSize + "]";
	}

}
