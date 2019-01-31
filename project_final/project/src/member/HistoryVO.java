package member;

public class HistoryVO {
	private String id;
	private String mname;
	private String mtime;
	private String mseat;
	
	
	
	public HistoryVO() {
		id=null;
		mname=null;
		mtime=null;
		mseat=null;
	}
	
	public HistoryVO(String id, String mname, String mtime, String mseat) {
		this.id = id;
		this.mname = mname;
		this.mtime = mtime;
		this.mseat = mseat;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMtime() {
		return mtime;
	}
	public void setMtime(String mtime) {
		this.mtime = mtime;
	}
	public String getMseat() {
		return mseat;
	}
	public void setMseat(String mseat) {
		this.mseat = mseat;
	}
}
