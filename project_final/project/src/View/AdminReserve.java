package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import member.MemberDAO;
import member.MemberVO;
import member.SeatDAO;
import member.SeatVO;

import java.awt.Color;

public class AdminReserve extends JFrame {

	private JPanel contentPane;
	JFrame admRes = this;
	private JTable table_1;
	JScrollPane scrol_table;

	/**
	 * Create the frame.
	 */
	public AdminReserve() {
		setTitle("관리자 예약관리");
		setBounds(100, 100, 551, 461);
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
				admRes.setVisible(false);	
			}
		});
		btnBack.setBounds(12, 375, 97, 23);
		contentPane.add(btnBack);
		
		
		
		String[] title = {"아이디","영화제목","영화시간","좌석","간식"};
		String[][]data=new String[0][5];
		DefaultTableModel model = new DefaultTableModel(data, title);
		
		table_1 = new JTable(model);
		table_1.setBackground(new Color(255, 248, 220));
		
		scrol_table = new JScrollPane(table_1);
	
		scrol_table.setBounds(22, 24, 501, 318);
		contentPane.add(scrol_table);

		List<SeatVO> list = new SeatDAO().select_all();	
		

		for(SeatVO temp: list) {
			String []rowData= {temp.getId(),temp.getMoviename(),temp.getMovietime(),temp.getMovieseat(),temp.getSnack()};
			
			model.addRow(rowData);
		}
		
		addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent e) {
		    admRes.setVisible(false);
		      new AdminMenu().setVisible(true);
		       
		    }
		});
		
	}
		
}	

