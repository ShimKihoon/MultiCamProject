package member;

public class MemberVO {
	private String name;
	private String id;
	private String pw;
	private String birthdate;
	
	
	
	public MemberVO() {
		name=null;
		id=null;
		pw=null;
		birthdate=null;
	}
	
	
	public MemberVO(String name, String id, String pw, String birthdate) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.birthdate = birthdate;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	
}
