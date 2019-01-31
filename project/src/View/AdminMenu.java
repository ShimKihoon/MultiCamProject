package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class AdminMenu extends JFrame {

	private JPanel contentPane;
	JFrame AM = this;


	/**
	 * Create the frame.
	 */
	public AdminMenu() {
		setTitle("관리자 메뉴");
		setBounds(100, 100, 337, 253);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton bt_adMemb = new JButton("회원관리");
		bt_adMemb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminMember().setVisible(true);
				AM.setVisible(false);
			}
		});
		bt_adMemb.setBackground(new Color(218, 112, 214));
		bt_adMemb.setBounds(105, 45, 111, 32);
		contentPane.add(bt_adMemb);
		
		
		
		JButton bt_adReserv = new JButton("예약내역");
		bt_adReserv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminReserve().setVisible(true);
				AM.setVisible(false);
			}
		});
		bt_adReserv.setBackground(new Color(0, 191, 255));
		bt_adReserv.setBounds(105, 111, 111, 32);
		contentPane.add(bt_adReserv);
		
		addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent e) {
		       AM.setVisible(false);
		      new Login().setVisible(true);
		       
		    }
		});
		
		
	}

}
