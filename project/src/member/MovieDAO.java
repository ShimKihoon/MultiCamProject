package member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;

public class MovieDAO {
	SqlSession session;
	
	public MovieDAO() {
		session = MySqlSession.getSqlSession();
	}
	
	public List<MovieVO> select() {
		List<MovieVO> movies = session.selectList("movie.select");
		return movies;
	}
	 
}
