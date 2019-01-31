package member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;

public class SeatDAO {
	SqlSession session;
	
	public  SeatDAO() {
		session = MySqlSession.getSqlSession();
	}
	
	public boolean insert(SeatVO seat) {
		int result = session.insert("seat.insert",seat);
		session.commit();
		if(result==0)
			return false;
		else
			return true;
	}
	
	public List<SeatVO> select() {
		List<SeatVO> list = session.selectList("seat.select");
		return list;
	}
	
	public List<SeatVO> select_all(){
		List<SeatVO> list = session.selectList("seat.select_all");
		return list;
	}
	
	public List<String> select_seat(SeatVO seat){
		List<String> list = session.selectList("seat.select_seat",seat);
		return list;
	}
}
