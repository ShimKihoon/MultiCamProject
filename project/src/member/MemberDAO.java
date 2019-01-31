package member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;

public class MemberDAO {
	SqlSession session;
	
	public MemberDAO() {
		session=MySqlSession.getSqlSession();
	}
	
	//member테이블에 insert
	public boolean insert(MemberVO member) {
		int result=session.insert("user.insert",member);
		session.commit();
		if(result ==0)
			return false;
		else
			return true;
	}
	
	public List<MemberVO> select(){
		return session.selectList("user.select");
	}
	
	public int check(String id) {
		int num = session.selectOne("user.check",id);
		return num;
	}
	public boolean login(MemberVO input) {
		int result = session.selectOne("user.login", input);
		if(result ==0)
			return false;
		else
			return true;			
	}
	
}
