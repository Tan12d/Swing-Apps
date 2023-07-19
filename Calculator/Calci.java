package calculator;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calci {

	private JFrame frame;
	private JTextField t1;
	private JButton bC;
	private JButton b00;
	private JButton badd;
	private JButton b9;
	private JButton bsub;
	private JButton b7;
	private JButton b8;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton bmul;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton bdiv;
	private JButton b0;
	private JButton bdot;
	private JButton bequal;
	private JButton bpercent;
	
	double num1=0,num2=0,res=0;
	String operation,result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 381, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel h1 = new JLabel("Calculator");
		h1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		h1.setVerticalAlignment(SwingConstants.TOP);
		h1.setHorizontalAlignment(SwingConstants.CENTER);
		h1.setBounds(76, 6, 222, 63);
		frame.getContentPane().add(h1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Arial Black", Font.BOLD, 24));
		t1.setToolTipText("         ");
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBounds(26, 69, 318, 51);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton bB = new JButton("\uF0E7");
		bB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=null;
				if(t1.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(t1.getText());
					str.deleteCharAt(t1.getText().length()-1);
					s=s.toString();
					t1.setText(s);
				}
			}
		});
		bB.setFont(new Font("Windings", Font.BOLD, 20));
		bB.setBounds(26, 131, 72, 51);
		frame.getContentPane().add(bB);
		
		bC = new JButton("C");
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				t1.setText("");
			}
		});
		bC.setFont(new Font("Tahoma", Font.BOLD, 20));
		bC.setBounds(108, 131, 72, 51);
		frame.getContentPane().add(bC);
		
		b00 = new JButton("00");
		b00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b00.getText();
				t1.setText(num);
			}
		});
		b00.setFont(new Font("Tahoma", Font.BOLD, 20));
		b00.setBounds(190, 131, 72, 51);
		frame.getContentPane().add(b00);
		
		badd = new JButton("+");
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(t1.getText());
				t1.setText("");
				operation="+";
			}
		});
		badd.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		badd.setBounds(272, 131, 72, 51);
		frame.getContentPane().add(badd);
		
		b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b9.getText();
				t1.setText(num);
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 20));
		b9.setBounds(190, 193, 72, 51);
		frame.getContentPane().add(b9);
		
		bsub = new JButton("-");
		bsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(t1.getText());
				t1.setText("");
				operation="-";
			}
		});
		bsub.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		bsub.setBounds(272, 193, 72, 51);
		frame.getContentPane().add(bsub);
		
		b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b7.getText();
				t1.setText(num);
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 20));
		b7.setBounds(26, 193, 72, 51);
		frame.getContentPane().add(b7);
		
		b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b8.getText();
				t1.setText(num);
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 20));
		b8.setBounds(108, 193, 72, 51);
		frame.getContentPane().add(b8);
		
		b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b4.getText();
				t1.setText(num);
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 20));
		b4.setBounds(26, 255, 72, 51);
		frame.getContentPane().add(b4);
		
		b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b5.getText();
				t1.setText(num);
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 20));
		b5.setBounds(108, 255, 72, 51);
		frame.getContentPane().add(b5);
		
		b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b6.getText();
				t1.setText(num);
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 20));
		b6.setBounds(190, 255, 72, 51);
		frame.getContentPane().add(b6);
		
		bmul = new JButton("*");
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(t1.getText());
				t1.setText("");
				operation="*";
			}
		});
		bmul.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		bmul.setBounds(272, 255, 72, 51);
		frame.getContentPane().add(bmul);
		
		b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b1.getText();
				t1.setText(num);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(26, 317, 72, 51);
		frame.getContentPane().add(b1);
		
		b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b2.getText();
				t1.setText(num);
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setBounds(108, 317, 72, 51);
		frame.getContentPane().add(b2);
		
		b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b3.getText();
				t1.setText(num);
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 20));
		b3.setBounds(190, 317, 72, 51);
		frame.getContentPane().add(b3);
		
		bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(t1.getText());
				t1.setText("");
				operation="/";
			}
		});
		bdiv.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		bdiv.setBounds(272, 317, 72, 51);
		frame.getContentPane().add(bdiv);
		
		b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+b0.getText();
				t1.setText(num);
			}
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 20));
		b0.setBounds(26, 379, 72, 51);
		frame.getContentPane().add(b0);
		
		bdot = new JButton(".");
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= t1.getText()+bdot.getText();
				t1.setText(num);
			}
		});
		bdot.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		bdot.setBounds(108, 379, 72, 51);
		frame.getContentPane().add(bdot);
		
		bequal = new JButton("=");
		bequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(t1.getText());
				
				if(operation=="+")
				{
					res=num1+num2;
					result=Double.toString(res);
					t1.setText(result);
				}
				
				if(operation=="-")
				{
					res=num1-num2;
					result=Double.toString(res);
					t1.setText(result);
				}
				
				if(operation=="*")
				{
					res=num1*num2;
					result=Double.toString(res);
					t1.setText(result);
				}
				
				if(operation=="/")
				{
					if(num2!=0)
					{
						res=num1/num2;
						result=Double.toString(res);
						t1.setText(result);
					}
					
					else
					{
						t1.setBackground(Color.RED); 
						t1.setText("Invalid Operation");
					}
				}
				
				if(operation=="%")
				{
					if(num2!=0)
					{
						res=num1%num2;
						result=Double.toString(res);
						t1.setText(result);
					}
					
					else
					{
						t1.setBackground(Color.RED); 
						t1.setText("Invalid Operation");
					}
				}			
				
			}
		});
		bequal.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		bequal.setBounds(190, 379, 72, 51);
		frame.getContentPane().add(bequal);
		
		bpercent = new JButton("%");
		bpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(t1.getText());
				t1.setText("");
				operation="%";
			}
		});
		bpercent.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		bpercent.setBounds(272, 375, 72, 51);
		frame.getContentPane().add(bpercent);
	}
}
