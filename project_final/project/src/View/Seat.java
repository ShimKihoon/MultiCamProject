package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import member.SeatDAO;
import member.SeatVO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Choice;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Seat extends JFrame {

	private JPanel contentPane;

	private String login_id;
	private String m, t,snack;
	private String buttonID;

	public int flag ;
	JFrame Seatk = this;




	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Seat frame = new Seat("","","");
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
	public Seat(String login_id, String m, String t,String snack) {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.login_id=login_id;
		this.m = m;
		this.t = t;
		this.snack = snack;

		flag= 0;

		setTitle("현재 로그인한 ID ["+login_id+"]");


		setBounds(100, 100, 435, 458);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Screen");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 10, 323, 37);
		contentPane.add(lblNewLabel);

		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		// set the border of this component
		lblNewLabel.setBorder(border);

		JFrame s = this;
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				s.setVisible(false);
				//new MovieMenu().setVisible(true);

			}
		});
		Color violet = new Color(138, 43, 226);

		//		 List<SeatVO> reserved =new SeatDAO().select();
		//		 for(SeatVO temp : reserved) {
		//			 System.out.println(temp.getMovieseat());
		//		 }

		List<String> check = new ArrayList<String>();
		List<String> list = new SeatDAO().select_seat(new SeatVO(m,t,"","",""));
		for(String temp : list) {
			//System.out.println(temp);
			check.add(temp);
		}


		JButton button1 = new JButton("");

		if(check.contains("button1"))
			button1.setEnabled(false);
		else	{	
			button1.setBackground(violet);

			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button1.getBackground()==violet) {			
						button1.setBackground(Color.CYAN);
						buttonID = "button1";
						flag =1;
					}
					else if(button1.getBackground()==(Color.CYAN)&&flag==1) {
						button1.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}

		button1.setFont(new Font("굴림", Font.PLAIN, 5));
		button1.setBounds(23, 87, 33, 37);
		contentPane.add(button1);


		JButton button2 = new JButton("");

		if(check.contains("button2"))
			button2.setEnabled(false);
		else	{

			button2.setBackground(violet);

			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button2.getBackground()==violet) {			
						button2.setBackground(Color.CYAN);
						buttonID = "button2";
						flag =1;
					}
					else if(button2.getBackground()==(Color.CYAN)&&flag==1) {
						button2.setBackground(violet);
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button2.setFont(new Font("굴림", Font.PLAIN, 10));
		button2.setBounds(63, 87, 33, 37);
		contentPane.add(button2);

		JButton button3 = new JButton("");

		if(check.contains("button3"))
			button3.setEnabled(false);
		else	{
			button3.setBackground(violet);
			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button3.getBackground()==violet) {			
						button3.setBackground(Color.CYAN);
						buttonID = "button3";
						flag =1;
					}
					else if(button3.getBackground()==(Color.CYAN)&&flag==1) {
						button3.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button3.setFont(new Font("굴림", Font.PLAIN, 10));
		button3.setBounds(141, 87, 33, 37);
		contentPane.add(button3);

		JButton button4 = new JButton("");

		if(check.contains("button4"))
			button4.setEnabled(false);
		else	{

			button4.setBackground(violet);
			button4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button4.getBackground()==violet) {			
						button4.setBackground(Color.CYAN);
						buttonID = "button4";
						flag =1;
					}
					else if(button4.getBackground()==(Color.CYAN)&&flag==1) {
						button4.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button4.setFont(new Font("굴림", Font.PLAIN, 10));
		button4.setBounds(186, 87, 33, 37);
		contentPane.add(button4);

		JButton button5 = new JButton("");

		if(check.contains("button5"))
			button5.setEnabled(false);
		else	{
			button5.setBackground(violet);
			button5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button5.getBackground()==violet) {			
						button5.setBackground(Color.CYAN);
						buttonID = "button5";
						flag =1;
					}
					else if(button5.getBackground()==(Color.CYAN)&&flag==1) {
						button5.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button5.setFont(new Font("굴림", Font.PLAIN, 10));
		button5.setBounds(231, 87, 33, 37);
		contentPane.add(button5);

		JButton button6 = new JButton("");
		if(check.contains("button6"))
			button6.setEnabled(false);
		else	{

			button6.setBackground(violet);
			button6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button6.getBackground()==violet) {			
						button6.setBackground(Color.CYAN);
						buttonID = "button6";
						flag =1;
					}
					else if(button6.getBackground()==(Color.CYAN)&&flag==1) {
						button6.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button6.setFont(new Font("굴림", Font.PLAIN, 10));
		button6.setBounds(300, 87, 33, 37);
		contentPane.add(button6);

		JButton button7 = new JButton("");

		if(check.contains("button7"))
			button7.setEnabled(false);
		else	{
			button7.setBackground(violet);

			button7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button7.getBackground()==violet) {			
						button7.setBackground(Color.CYAN);
						buttonID = "button7";
						flag =1;
					}
					else if(button7.getBackground()==(Color.CYAN)&&flag==1) {
						button7.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button7.setFont(new Font("굴림", Font.PLAIN, 10));
		button7.setBounds(345, 87, 33, 37);
		contentPane.add(button7);
		////
		JButton button8 = new JButton("");

		if(check.contains("button8"))
			button8.setEnabled(false);
		else	{
			button8.setBackground(violet);

			button8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button8.getBackground()==violet) {			
						button8.setBackground(Color.CYAN);
						buttonID = "button8";
						flag =1;
					}
					else if(button8.getBackground()==(Color.CYAN)&&flag==1) {
						button8.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button8.setFont(new Font("굴림", Font.PLAIN, 10));
		button8.setBounds(23, 137, 33, 37);
		contentPane.add(button8);

		JButton button9 = new JButton("");
		if(check.contains("button9"))
			button9.setEnabled(false);
		else	{
			button9.setBackground(violet);

			button9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button9.getBackground()==violet) {			
						button9.setBackground(Color.CYAN);
						buttonID = "button9";
						flag =1;
					}
					else if(button9.getBackground()==(Color.CYAN)&&flag==1) {
						button9.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button9.setFont(new Font("굴림", Font.PLAIN, 10));
		button9.setBounds(63, 137, 33, 37);
		contentPane.add(button9);

		JButton button10 = new JButton("");
		if(check.contains("button10"))
			button10.setEnabled(false);
		else	{
			button10.setBackground(violet);

			button10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button10.getBackground()==violet) {			
						button10.setBackground(Color.CYAN);
						buttonID = "button10";
						flag =1;
					}
					else if(button10.getBackground()==(Color.CYAN)&&flag==1) {
						button10.setBackground(violet);
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button10.setFont(new Font("굴림", Font.PLAIN, 10));
		button10.setBounds(141, 137, 33, 37);
		contentPane.add(button10);

		JButton button11 = new JButton("");
		if(check.contains("button11"))
			button11.setEnabled(false);
		else	{
			button11.setBackground(violet);

			button11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button11.getBackground()==violet) {			
						button11.setBackground(Color.CYAN);
						buttonID = "button11";
						flag =1;
					}
					else if(button11.getBackground()==(Color.CYAN)&&flag==1) {
						button11.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button11.setFont(new Font("굴림", Font.PLAIN, 10));
		button11.setBounds(186, 137, 33, 37);
		contentPane.add(button11);

		JButton button12 = new JButton("");
		if(check.contains("button12"))
			button12.setEnabled(false);
		else	{
			button12.setBackground(violet);

			button12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button12.getBackground()==violet) {			
						button12.setBackground(Color.CYAN);
						buttonID = "button12";
						flag =1;
					}
					else if(button12.getBackground()==(Color.CYAN)&&flag==1) {
						button12.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button12.setFont(new Font("굴림", Font.PLAIN, 10));
		button12.setBounds(231, 137, 33, 37);
		contentPane.add(button12);

		JButton button13 = new JButton("");
		if(check.contains("button13"))
			button13.setEnabled(false);
		else	{
			button13.setBackground(violet);

			button13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button13.getBackground()==violet) {			
						button13.setBackground(Color.CYAN);
						buttonID = "button13";
						flag =1;
					}
					else if(button13.getBackground()==(Color.CYAN)&&flag==1) {
						button13.setBackground(violet);
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button13.setFont(new Font("굴림", Font.PLAIN, 10));
		button13.setBounds(300, 137, 33, 37);
		contentPane.add(button13);

		JButton button14 = new JButton("");
		if(check.contains("button14"))
			button14.setEnabled(false);
		else	{
			button14.setBackground(violet);

			button14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button14.getBackground()==violet) {			
						button14.setBackground(Color.CYAN);
						buttonID = "button14";
						flag =1;
					}
					else if(button14.getBackground()==(Color.CYAN)&&flag==1) {
						button14.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button14.setFont(new Font("굴림", Font.PLAIN, 10));
		button14.setBounds(345, 137, 33, 37);
		contentPane.add(button14);
		////
		JButton button15 = new JButton("");
		if(check.contains("button15"))
			button15.setEnabled(false);
		else	{
			button15.setBackground(violet);

			button15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button15.getBackground()==violet) {			
						button15.setBackground(Color.CYAN);
						buttonID = "button15";
						flag =1;
					}
					else if(button15.getBackground()==(Color.CYAN)&&flag==1) {
						button15.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button15.setFont(new Font("굴림", Font.PLAIN, 10));
		button15.setBounds(23, 187, 33, 37);
		contentPane.add(button15);

		JButton button16 = new JButton("");
		if(check.contains("button16"))
			button16.setEnabled(false);
		else	{
			button16.setBackground(violet);

			button16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button16.getBackground()==violet) {			
						button16.setBackground(Color.CYAN);
						buttonID = "button16";
						flag =1;
					}
					else if(button16.getBackground()==(Color.CYAN)&&flag==1) {
						button16.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button16.setFont(new Font("굴림", Font.PLAIN, 10));
		button16.setBounds(63, 187, 33, 37);
		contentPane.add(button16);

		JButton button17 = new JButton("");
		if(check.contains("button17"))
			button17.setEnabled(false);
		else	{
			button17.setBackground(violet);

			button17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button17.getBackground()==violet) {			
						button17.setBackground(Color.CYAN);
						buttonID = "button17";
						flag =1;
					}
					else if(button17.getBackground()==(Color.CYAN)&&flag==1) {
						button17.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button17.setFont(new Font("굴림", Font.PLAIN, 10));
		button17.setBounds(141, 187, 33, 37);
		contentPane.add(button17);



		JButton button18 = new JButton("");
		if(check.contains("button18"))
			button18.setEnabled(false);
		else	{
			button18.setBackground(violet);

			button18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button18.getBackground()==violet) {			
						button18.setBackground(Color.CYAN);
						buttonID = "button18";
						flag =1;
					}
					else if(button18.getBackground()==(Color.CYAN)&&flag==1) {
						button18.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button18.setFont(new Font("굴림", Font.PLAIN, 10));
		button18.setBounds(186, 187, 33, 37);
		contentPane.add(button18);

		JButton button19 = new JButton("");
		if(check.contains("button19"))
			button19.setEnabled(false);
		else	{
			button19.setBackground(violet);

			button19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button19.getBackground()==violet) {			
						button19.setBackground(Color.CYAN);
						buttonID = "button19";
						flag =1;
					}
					else if(button19.getBackground()==(Color.CYAN)&&flag==1) {
						button19.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button19.setFont(new Font("굴림", Font.PLAIN, 10));
		button19.setBounds(231, 187, 33, 37);
		contentPane.add(button19);

		JButton button20 = new JButton("");
		if(check.contains("button20"))
			button20.setEnabled(false);
		else	{
			button20.setBackground(violet);
			button20.setFont(new Font("굴림", Font.PLAIN, 10));

			button20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button20.getBackground()==violet) {			
						button20.setBackground(Color.CYAN);
						buttonID = "button20";
						flag =1;
					}
					else if(button20.getBackground()==(Color.CYAN)&&flag==1) {
						button20.setBackground(violet);
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button20.setBounds(300, 187, 33, 37);
		contentPane.add(button20);

		JButton button21 = new JButton("");
		if(check.contains("button21"))
			button21.setEnabled(false);
		else	{
			button21.setBackground(violet);

			button21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button21.getBackground()==violet) {			
						button21.setBackground(Color.CYAN);
						buttonID = "button21";
						flag =1;
					}
					else if(button21.getBackground()==(Color.CYAN)&&flag==1) {
						button21.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button21.setFont(new Font("굴림", Font.PLAIN, 10));
		button21.setBounds(345, 187, 33, 37);
		contentPane.add(button21);

		/////////
		JButton button22 = new JButton("");
		if(check.contains("button22"))
			button22.setEnabled(false);
		else	{
			button22.setBackground(violet);

			button22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button22.getBackground()==violet) {			
						button22.setBackground(Color.CYAN);
						buttonID = "button22";
						flag =1;
					}
					else if(button22.getBackground()==(Color.CYAN)&&flag==1) {
						button22.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button22.setFont(new Font("굴림", Font.PLAIN, 10));
		button22.setBounds(23, 237, 33, 37);
		contentPane.add(button22);

		JButton button23 = new JButton("");
		if(check.contains("button23"))
			button23.setEnabled(false);
		else	{
			button23.setBackground(violet);

			button23.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button23.getBackground()==violet) {			
						button23.setBackground(Color.CYAN);
						buttonID = "button23";
						flag =1;
					}
					else if(button23.getBackground()==(Color.CYAN)&&flag==1) {
						button23.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button23.setFont(new Font("굴림", Font.PLAIN, 10));
		button23.setBounds(63, 237, 33, 37);
		contentPane.add(button23);

		JButton button24 = new JButton("");
		if(check.contains("button24"))
			button24.setEnabled(false);
		else	{
			button24.setBackground(violet);

			button24.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button24.getBackground()==violet) {			
						button24.setBackground(Color.CYAN);
						buttonID = "button24";
						flag =1;
					}
					else if(button24.getBackground()==(Color.CYAN)&&flag==1) {
						button24.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button24.setFont(new Font("굴림", Font.PLAIN, 10));
		button24.setBounds(141, 237, 33, 37);
		contentPane.add(button24);

		JButton button25 = new JButton("");
		if(check.contains("button25"))
			button25.setEnabled(false);
		else	{
			button25.setBackground(violet);

			button25.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button25.getBackground()==violet) {			
						button25.setBackground(Color.CYAN);
						buttonID = "button25";
						flag =1;
					}
					else if(button25.getBackground()==(Color.CYAN)&&flag==1) {
						button25.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button25.setFont(new Font("굴림", Font.PLAIN, 10));
		button25.setBounds(186, 237, 33, 37);
		contentPane.add(button25);

		JButton button26 = new JButton("");
		if(check.contains("button26"))
			button26.setEnabled(false);
		else	{
			button26.setBackground(violet);

			button26.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button26.getBackground()==violet) {			
						button26.setBackground(Color.CYAN);
						buttonID = "button26";
						flag =1;
					}
					else if(button26.getBackground()==(Color.CYAN)&&flag==1) {
						button26.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button26.setFont(new Font("굴림", Font.PLAIN, 10));
		button26.setBounds(231, 237, 33, 37);
		contentPane.add(button26);

		JButton button27 = new JButton("");
		if(check.contains("button27"))
			button27.setEnabled(false);
		else	{
			button27.setBackground(violet);

			button27.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button27.getBackground()==violet) {			
						button27.setBackground(Color.CYAN);
						buttonID = "button27";
						flag =1;
					}
					else if(button27.getBackground()==(Color.CYAN)&&flag==1) {
						button27.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button27.setFont(new Font("굴림", Font.PLAIN, 10));
		button27.setBounds(300, 237, 33, 37);
		contentPane.add(button27);

		JButton button28 = new JButton("");
		if(check.contains("button28"))
			button28.setEnabled(false);
		else	{
			button28.setBackground(violet);

			button28.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(flag ==0 && button28.getBackground()==violet) {			
						button28.setBackground(Color.CYAN);
						buttonID = "button28";
						flag =1;
					}
					else if(button28.getBackground()==(Color.CYAN)&&flag==1) {
						button28.setBackground(violet);	
						buttonID = "";
						flag =0;
					}
				}	
			});
		}
		button28.setFont(new Font("굴림", Font.PLAIN, 10));
		button28.setBounds(345, 237, 33, 37);
		contentPane.add(button28);





		JButton btnselectOk = new JButton("선택완료");
		btnselectOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnselectOk!=null) {

					SeatVO Sv = new SeatVO(m, t, login_id, buttonID,snack);
					new SeatDAO().insert(Sv);
					JOptionPane.showMessageDialog(null, 
							"영화: "+m+" / "+t+" 에 예매 완료!");
					Seatk.setVisible(false);
					new Login().setVisible(true);
				}
			}
		});
		btnselectOk.setBounds(310, 365, 97, 45);
		contentPane.add(btnselectOk);

		JLabel result = new JLabel("영화: "+m+" / "+ "시간: "+t);
		result.setFont(new Font("굴림", Font.BOLD, 14));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(79, 301, 269, 37);
		contentPane.add(result);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MovieMenu("").setVisible(true);
				Seatk.setVisible(false);	
			}
		});
		btnBack.setBounds(23, 376, 97, 23);
		contentPane.add(btnBack);
		
		JLabel snackResult = new JLabel("간식: "+ snack);
		snackResult.setHorizontalAlignment(SwingConstants.CENTER);
		snackResult.setFont(new Font("굴림", Font.BOLD, 13));
		snackResult.setBounds(89, 337, 244, 31);
		contentPane.add(snackResult);





	}
}
