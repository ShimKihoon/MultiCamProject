package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import member.MemberDAO;
import member.MemberVO;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AdminMember extends JFrame {

	private JPanel contentPane;
	
	JFrame adMem = this;
	private JTable table_1;
	JScrollPane scrol_table;

	/**
	 * Create the frame.
	 */
	public AdminMember() {
		setTitle("관리자 회원관리");
		
		setBounds(100, 100, 534, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(224, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdminMenu().setVisible(true);
				adMem.setVisible(false);	
			}
		});
		btnBack.setBounds(12, 431, 97, 23);
		contentPane.add(btnBack);
		
		String[] title = {"이름","아이디","비밀번호","생년월일"};
		String[][]data=new String[0][4];
		DefaultTableModel model = new DefaultTableModel(data, title);
		
		table_1 = new JTable(model);
		table_1.setBackground(new Color(255, 248, 220));
		
		scrol_table = new JScrollPane(table_1);
		
		//table_1.setBounds(57, 65, 418, 318);
		//contentPane.add(table_1);
		scrol_table.setBounds(32, 57, 452, 318);
		contentPane.add(scrol_table);
		
		
		List<MemberVO> list = new MemberDAO().select();	
		
		
		
		for(MemberVO temp: list) {
			String date=temp.getBirthdate();
			String date2= date.substring(0,4)+"/"+date.substring(5,7)+"/"+date.substring(8,10);
			String []rowData= {temp.getName(),temp.getId(),temp.getPw(),date2};
			
			model.addRow(rowData);
		}		
		addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent e) {
		    	adMem.setVisible(false);
		      new AdminMenu().setVisible(true);
		       
		    }
		});
		
	}
}
