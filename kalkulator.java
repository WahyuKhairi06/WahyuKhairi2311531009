package kalkulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kalkulator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator frame = new kalkulator();
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
	public kalkulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 248, 57);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnReset = new JButton("AC");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnReset.setBounds(10, 83, 59, 57);
		contentPane.add(btnReset);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn7.setBounds(10, 139, 59, 57);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn4.setBounds(10, 196, 59, 57);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn1.getText();
			textField.setText(number);
			
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBounds(10, 253, 59, 57);
		contentPane.add(btn1);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if (textField.getText().length()>0);
				{
				StringBuilder str=new StringBuilder (textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backSpace=str.toString();
				textField.setText(backSpace);
				}
			}
		});
		btnbackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnbackspace.setBounds(72, 83, 59, 57);
		contentPane.add(btnbackspace);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn8.setBounds(72, 139, 59, 57);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn5.setBounds(72, 196, 59, 57);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn2.setBounds(72, 253, 59, 57);
		contentPane.add(btn2);
		
		JButton btnmodulus = new JButton("%");
		btnmodulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnmodulus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnmodulus.setBounds(134, 83, 59, 57);
		contentPane.add(btnmodulus);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn9.setBounds(134, 139, 59, 57);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn6.setBounds(134, 196, 59, 57);
		contentPane.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn3.setBounds(134, 253, 59, 57);
		contentPane.add(btn3);
		
		JButton btndistribution = new JButton("/");
		btndistribution.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndistribution.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndistribution.setBounds(198, 83, 59, 57);
		contentPane.add(btndistribution);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMultiplication.setBounds(198, 139, 59, 57);
		contentPane.add(btnMultiplication);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnminus.setBounds(198, 196, 59, 57);
		contentPane.add(btnminus);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnplus.setBounds(198, 253, 59, 57);
		contentPane.add(btnplus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn0.setBounds(10, 310, 121, 57);
		contentPane.add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btndot.getText();
				textField.setText(number);
			}
			
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndot.setBounds(134, 310, 59, 57);
		contentPane.add(btndot);
		
		JButton btnequals = new JButton("=");
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if (operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if  (operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if  (operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if  (operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if  (operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}



			}
		});
		btnequals.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnequals.setBounds(198, 310, 59, 57);
		contentPane.add(btnequals);
	}
}
