package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import member.HistoryVO;
import member.MovieDAO;
import member.MovieVO;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.ScrollPane;
import javax.swing.JScrollBar;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MovieMenu extends JFrame {

	private JPanel contentPane;
	private JList Movielist,Timelist,Snacklist;
	private JLabel lblMovie,lblTime;
	private JButton bt_nextSeatWindow;
	private String login_id;
	
	
	JFrame MM = this;
	private JLabel lblNewLabel_2;
	
 
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MovieMenu frame = new MovieMenu("");
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
	public MovieMenu(String login_id) {
		System.out.println("id==>"+login_id);
		this.login_id =login_id;
		
		setTitle("현재 계정 ["+login_id+"]");
		

		setBounds(100, 100, 566, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		DefaultListModel movielist = new DefaultListModel();
		List<MovieVO> list = new MovieDAO().select();
		for(MovieVO temp : list) {
			movielist.addElement(temp.getName());
		}
		
		Movielist = new JList();
		Movielist.setBackground(new Color(255, 245, 238));
		Movielist.setModel(movielist);		
		Movielist.setSelectedIndex(0);
	
		ScrollPane Moviescroll = new ScrollPane();
		Moviescroll.setBounds(40, 46, 150, 250);
		contentPane.add(Moviescroll);
		Moviescroll.add(Movielist);
		

		
		Timelist = new JList();
		Timelist.setBackground(new Color(255, 245, 238));
		Timelist.setModel(new AbstractListModel() {
			String[] values = new String[] {"07:30", "09:00", "12:40", "15:10", "18:40", "21:00", "23:30", "24:40"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		Timelist.setSelectedIndex(0);
		ScrollPane Timescroll = new ScrollPane();
		Timescroll.setBounds(210, 46, 150, 250);
		contentPane.add(Timescroll);
		Timescroll.add(Timelist);
		
		
		
		Snacklist = new JList();
		Snacklist.setBackground(new Color(255, 245, 238));
		Snacklist.setModel(new AbstractListModel() {
			String[] values = new String[] {"팝콘","치즈팝콘","초코팝콘","어니언팝콘","오징어","나쵸","핫도그","떡볶이","치킨","감자","콜라","에이드","맥주"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		Snacklist.setSelectedIndex(0);
		Snacklist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
		ScrollPane Snackcroll = new ScrollPane();
		Snackcroll.setBounds(380, 46, 150, 250);
		contentPane.add(Snackcroll);
		Snackcroll.add(Snacklist);
		
		
		
		
		
		lblMovie = new JLabel("영화");
		lblMovie.setFont(new Font("굴림", Font.BOLD, 12));
		lblMovie.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovie.setBounds(88, 20, 57, 15);
		contentPane.add(lblMovie);
		
		lblTime = new JLabel("시간");
		lblTime.setFont(new Font("굴림", Font.BOLD, 12));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(261, 20, 57, 15);
		contentPane.add(lblTime);
		

		
		bt_nextSeatWindow = new JButton("좌석 선택");
		bt_nextSeatWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bt_nextSeatWindow!=null) {
				   String m = Movielist.getSelectedValue().toString();
				   String t = Timelist.getSelectedValue().toString();
				   List<String> temp = Snacklist.getSelectedValuesList();
				   String s="";
				for(String snack : temp)
				   s+=snack+" ";
				   
				   new Seat(login_id, m, t,s).setVisible(true);
					MM.setVisible(false);
				}
			}
		});
		bt_nextSeatWindow.setBounds(403, 352, 119, 58);
		contentPane.add(bt_nextSeatWindow);
		
		JLabel lblSnack = new JLabel("간식");
		lblSnack.setFont(new Font("굴림", Font.BOLD, 12));
		lblSnack.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnack.setBounds(424, 20, 57, 15);
		contentPane.add(lblSnack);
		

		
		
		addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent e) {
		    	MM.setVisible(false);
		      new Login().setVisible(true);
		       
		    }
		});
		
		
	}
}







