package swingex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Temp_conv extends JFrame {

	private JPanel contentPane;
	private JTextField ftoc;
	private JTextField ctof;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temp_conv frame = new Temp_conv();
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
	public Temp_conv() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 463);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temperature Converter");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(169, 42, 426, 60);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Faren. to Cel.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val1= ftoc.getText();
		        double d= Double.parseDouble(val1);
		        double res1= (d-32)*5/9;
		        String res_1= String.format("%.2f",res1);
		        ctof.setText(res_1);
			}
		});
		btnNewButton.setBounds(612, 164, 101, 28);
		contentPane.add(btnNewButton);
		
		ftoc = new JTextField();
		ftoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		ftoc.setBounds(146, 161, 449, 35);
		contentPane.add(ftoc);
		ftoc.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Cel. to Faren.");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val2 = ctof.getText();
		        double d1= Double.parseDouble(val2);
		        double res2= (d1 * 9/5)+32;
		        String res_2= String.format("%.2f",res2);
		        ftoc.setText(res_2);
			}
		});
		btnNewButton_1.setBounds(612, 274, 101, 28);
		contentPane.add(btnNewButton_1);
		
		ctof = new JTextField();
		ctof.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ctof.setColumns(10);
		ctof.setBounds(146, 271, 449, 35);
		contentPane.add(ctof);
	}
}
