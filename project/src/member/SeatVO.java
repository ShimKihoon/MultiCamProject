package member;

public class SeatVO {
	
	private String moviename;
	private String movietime;
	private String Id;
	private String movieseat;
	private String snack;
	
	
	
	public SeatVO() {
		
	}
	public SeatVO(String moviename, String movietime, String Id, String movieseat,String snack) {
		this.moviename = moviename;
		this.movietime = movietime;
		this.Id = Id;
		this.movieseat = movieseat;
		this.snack= snack;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getMovietime() {
		return movietime;
	}
	public void setMovietime(String movietime) {
		this.movietime = movietime;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getMovieseat() {
		return movieseat;
	}
	public void setMovieseat(String movieseat) {
		this.movieseat = movieseat;
	}
	
	public String getSnack() {
		return snack;
	}
	public void setSnack(String snack) {
		this.snack = snack;
	}
	
	
}
