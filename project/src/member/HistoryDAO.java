package member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;




public class HistoryDAO {
	SqlSession session;
	public HistoryDAO() {
		session = MySqlSession.getSqlSession();
	}
	
	public boolean insert(HistoryVO history) {
		int result=session.insert("history.insert",history);
		session.commit();
		if(result ==0)
			return false; 
		else
			return true;
	}
	public void insert_id(String id) {
		session.insert("history.insert_id",id);
	}
	
	
	public List<HistoryVO> select() {
		List<HistoryVO> history = session.selectList("history.select");
		return history;
	}
}
