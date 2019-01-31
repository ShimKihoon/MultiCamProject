package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Login;
import View.MovieMenu;

public class Control implements ActionListener{
	Login login;
	MovieMenu movieMenu;
	
	public Control(){
//		login = new Login();
//		movieMenu = new MovieMenu(null);
	}
	
	
	@Override
	   public void actionPerformed(ActionEvent e) {//이벤트 처리부(요청 분석)
		 Object ob = e.getSource();//이벤트 소스의 레퍼런스 얻어오기
		 if(ob==login.bt_login){//메인뷰 입력버튼 클릭
			 login.setVisible(false);
			 movieMenu.setVisible(true);
		 }else if(ob==login.bt_new_Account){//입력폼 입력버튼 클릭
		 }
	}
			 
			 
			 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Control();
	}

}
