package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import member.MemberDAO;
import member.MemberVO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class New_account extends JFrame {

	private JPanel contentPane;
	private JTextField textname;
	private JTextField birthdate;
	private JTextField textid;
	private JPasswordField passwordField;
	JFrame f = this;
	MemberVO userVO;
	MemberDAO userDAO;
	
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					New_account frame = new New_account();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public New_account() {
		setTitle("회원가입");
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 364, 308);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 10, 81, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("성명");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(66, 54, 41, 23);
		contentPane.add(lblNewLabel_1);
		
		textname = new JTextField();
		textname.setBackground(new Color(224, 255, 255));
		textname.setBounds(119, 55, 116, 21);
		contentPane.add(textname);
		textname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("생년월일");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(60, 91, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		birthdate = new JTextField();
		birthdate.setBackground(new Color(224, 255, 255));
		birthdate.setBounds(119, 88, 116, 21);
		contentPane.add(birthdate);
		birthdate.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(60, 133, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		textid = new JTextField();
		textid.setBackground(new Color(224, 255, 255));
		textid.setBounds(119, 130, 116, 21);
		contentPane.add(textid);
		textid.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("비밀번호");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(60, 170, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(224, 255, 255));
		passwordField.setBounds(119, 167, 116, 18);
		contentPane.add(passwordField);
		
		JButton creatAccount = new JButton("가입!");
		creatAccount.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(new MemberDAO().check(textid.getText())!=0){
					JOptionPane.showMessageDialog(null, "중복 검사를 해주세요!");
				}else {			

					if(creatAccount!=null) {
						//여기에 insert
						userVO= new MemberVO(textname.getText(),textid.getText(),
								passwordField.getText(),birthdate.getText());

						userDAO = new MemberDAO();
						userDAO.insert(userVO);


						JOptionPane.showMessageDialog(null, "가입 완료!");
						f.setVisible(false);
						new Login().setVisible(true);
					}
				}
			}
		});
		creatAccount.setBounds(239, 237, 97, 23);
		contentPane.add(creatAccount);
		
		JButton idCheck = new JButton("중복검사");
		idCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				if(idCheck!=null)
					if(new MemberDAO().check(textid.getText())!=0) //중복걸림)
						JOptionPane.showMessageDialog(null, "ID중복!");
					else
						JOptionPane.showMessageDialog(null, "사용가능한 ID입니다!");
			}
		});
		idCheck.setBounds(247, 131, 89, 18);
		contentPane.add(idCheck);
		
        addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent e) {
		       f.setVisible(false);
		      new Login().setVisible(true);
		       
		    }
		});
		
	}
}



