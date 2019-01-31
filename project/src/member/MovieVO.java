package member;

public class MovieVO {
	private int num;
	private String name;
	private String genre;
	 
	public MovieVO() {
		num=0;
		name=null;
		genre=null;
	}

	public MovieVO(int num, String name, String genre) {
		this.num = num;
		this.name = name;
		this.genre = genre;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
	
}
