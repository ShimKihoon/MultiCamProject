package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import member.HistoryDAO;
import member.MemberDAO;
import member.MemberVO;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Login extends JFrame {

	private JPanel contentPane;
	public JButton bt_login, bt_new_Account;
	private JTextField textID;
	private JTextField textPW;
	private JLabel lblNewLabel;
	private JLabel label; 
	JFrame k = this;
	private JButton btnAdmin;
	/** 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Welcome to MC Theater!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		
		bt_new_Account = new JButton("회원가입");
		bt_new_Account.setIcon(null);
		bt_new_Account.setBackground(UIManager.getColor("Button.highlight"));
		bt_new_Account.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bt_new_Account!=null) {
					new New_account().setVisible(true);
					k.setVisible(false);
				}
			}
		});
		bt_new_Account.setBounds(161, 173, 96, 21);
		contentPane.add(bt_new_Account);
		
		textID = new JTextField();
		textID.setBackground(new Color(224, 255, 255));
		textID.setForeground(Color.GRAY);
		textID.setToolTipText("");
		textID.setBounds(141, 99, 116, 21);
		contentPane.add(textID);
		textID.setColumns(10);
		
		textPW = new JPasswordField();
		textPW.setBackground(new Color(224, 255, 255));
		textPW.setForeground(Color.GRAY);
		textPW.setToolTipText("");
		textPW.setBounds(141, 130, 116, 21);
		contentPane.add(textPW);
		textPW.setColumns(10);
		
		
		bt_login = new JButton("로그인");
		bt_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bt_login !=null){//로그인
					String login_id = textID.getText();
					MemberVO temp = new MemberVO("",login_id,textPW.getText(),"");
					if(new MemberDAO().login(temp)) {
						//로그인 성공
						JOptionPane.showMessageDialog(null, "로그인 성공!");
						
						new MovieMenu(login_id).setVisible(true);
						k.setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "로그인 실패!");
					}					
				 }
			}
		});
		bt_login.setBounds(269, 98, 96, 53);
		contentPane.add(bt_login);
		
		JLabel lblTitle = new JLabel("Welcome to MC Theater!!");
		lblTitle.setForeground(new Color(65, 105, 225));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림", Font.BOLD, 18));
		lblTitle.setBounds(80, 10, 265, 67);
		contentPane.add(lblTitle);
		
		lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("새굴림", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 102, 57, 15);
		contentPane.add(lblNewLabel);
		
		label = new JLabel("비밀번호");
		label.setFont(new Font("새굴림", Font.PLAIN, 12));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(72, 133, 57, 15);
		contentPane.add(label);
		
		btnAdmin = new JButton("Admin");
		btnAdmin.setBackground(new Color(253, 245, 230));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnAdmin !=null){//로그인
					String login_id = textID.getText();
					MemberVO temp = new MemberVO("",login_id,textPW.getText(),"");
					if(new MemberDAO().login(temp)&&login_id.equals("admin")) {
						//로그인 성공
						JOptionPane.showMessageDialog(null, "관리자 로그인 성공!");
						
						new AdminMenu().setVisible(true);
						k.setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "관리자 로그인 실패!");
					}					
				 }
				
			}
		});
		btnAdmin.setBounds(345, 229, 77, 23);
		contentPane.add(btnAdmin);
		
	}
}
