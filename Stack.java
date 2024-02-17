package com.kodnest.datastructures;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel displayed;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField stacksize;
	private JTextField element;
	private JTextField output;
	private int stack[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 365);
		displayed = new JPanel();
		displayed.setBackground(new Color(255, 255, 128));
		displayed.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(displayed);
		displayed.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(253, 10, 1, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setForeground(Color.BLACK);
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.setBackground(new Color(255, 255, 128));
		displayed.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(152, 10, 191, 21);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH  :");
		lblNewLabel_1.setForeground(new Color(0, 128, 64));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(65, 55, 153, 15);
		contentPane_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 10));
		textField.setColumns(10);
		textField.setBounds(260, 53, 96, 19);
		contentPane_1.add(textField);
		
		JButton create = new JButton("CREATE ARRAY");
		create.setForeground(Color.BLUE);
		create.setFont(new Font("Times New Roman", Font.BOLD, 12));
		create.setBounds(172, 90, 143, 23);
		contentPane_1.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("INSERT AN INTEGER ELEMENT :");
		lblNewLabel_2.setForeground(new Color(0, 128, 64));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(23, 146, 195, 15);
		contentPane_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		textField_1.setColumns(10);
		textField_1.setBounds(260, 144, 96, 19);
		contentPane_1.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER POSITION :");
		lblNewLabel_3.setForeground(new Color(0, 128, 64));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(104, 181, 111, 15);
		contentPane_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 10));
		textField_2.setColumns(10);
		textField_2.setBounds(260, 179, 96, 19);
		contentPane_1.add(textField_2);
		
		JButton insertion = new JButton("INSERT");
		insertion.setForeground(Color.BLUE);
		insertion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		insertion.setBounds(172, 206, 129, 21);
		contentPane_1.add(insertion);
		
		JLabel lblNewLabel_4 = new JLabel("DELETING POSITION :");
		lblNewLabel_4.setForeground(new Color(0, 128, 64));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(85, 256, 133, 15);
		contentPane_1.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 10));
		textField_3.setColumns(10);
		textField_3.setBounds(260, 255, 96, 19);
		contentPane_1.add(textField_3);
		
		JButton delete = new JButton("DELETE");
		delete.setForeground(Color.RED);
		delete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		delete.setBounds(384, 253, 103, 23);
		contentPane_1.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.setForeground(new Color(0, 128, 64));
		display.setFont(new Font("Times New Roman", Font.BOLD, 12));
		display.setBounds(162, 295, 153, 21);
		contentPane_1.add(display);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.BLUE);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 10));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(23, 340, 475, 19);
		contentPane_1.add(textField_4);
		
		JLabel lblNewLabel_5 = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_5.setBounds(112, 10, 211, 19);
		displayed.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ENTER THE STACK SIZE :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setForeground(new Color(0, 128, 64));
		lblNewLabel_6.setBounds(40, 64, 152, 15);
		displayed.add(lblNewLabel_6);
		
		stacksize = new JTextField();
		stacksize.setFont(new Font("Times New Roman", Font.BOLD, 10));
		stacksize.setBounds(216, 62, 96, 19);
		displayed.add(stacksize);
		stacksize.setColumns(10);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				//CODE FOR CREATE STACK
				size =Integer.valueOf(stacksize.getText());
				
				if(size<=0) {
					JOptionPane.showMessageDialog(getContentPane(),"PLEASE ENTER SIZE >0");
				}
				else {
				stack=new int[size];
				String message="STACK GOT CREATED OF SIZE "+size;
				JOptionPane.showMessageDialog(getContentPane(), message);
				}
			}catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(getContentPane(),"PLEASE ENTER POSITIVE INTEGERS TO CREATE AN ARRAY");
				stacksize.setText("");
			}
			}
		});
		createstack.setFont(new Font("Times New Roman", Font.BOLD, 12));
		createstack.setForeground(new Color(0, 0, 255));
		createstack.setBounds(132, 99, 151, 23);
		displayed.add(createstack);
		
		JLabel lblNewLabel_7 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_7.setForeground(new Color(0, 128, 64));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setBounds(58, 151, 134, 15);
		displayed.add(lblNewLabel_7);
		
		element = new JTextField();
		element.setFont(new Font("Times New Roman", Font.BOLD, 10));
		element.setBounds(216, 150, 96, 19);
		displayed.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR PUSH OPERATION
				
				String message="INSERTION NOT POSSIBLE";
				if(top==size-1) {
					JOptionPane.showMessageDialog(getContentPane(), message);
					element.setText("");
				}
				else {
					int ele=Integer.valueOf(element.getText()) ;
					++top;
					stack[top]=ele;
					output.setText("");
					String s="ELEMENT "+ele+" GOT INSERTED AT "+top+" POSITION";
					JOptionPane.showMessageDialog(getContentPane(), s);
					element.setText("");
				}
			}
		});
		push.setForeground(new Color(0, 0, 255));
		push.setFont(new Font("Times New Roman", Font.BOLD, 12));
		push.setBounds(40, 193, 85, 21);
		displayed.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR POP OPERATION
				if(top==-1) {
					JOptionPane.showMessageDialog(getContentPane(), "POP  NOT POSSIBLE");
				}
				else {
					output.setText("");
					String s="ELEMENT "+stack[top]+" GOT DELETED ";
					JOptionPane.showMessageDialog(getContentPane(),s);
					--top;
					element.setText("");
				}
			}
		});
		pop.setForeground(new Color(255, 0, 0));
		pop.setFont(new Font("Times New Roman", Font.BOLD, 12));
		pop.setBounds(294, 193, 85, 21);
		displayed.add(pop);
		
		JButton btnNewButton = new JButton("DISPLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY OPERATION
				if(top==-1) {
					JOptionPane.showMessageDialog(getContentPane(), "DISPLAY NOT POSSIBLE");
				}
				else {
					String s="";
					for (int i =top; i>=0; i--) {
						s=s+" "+stack[i];
					}
					output.setText(s);
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(169, 236, 96, 21);
		displayed.add(btnNewButton);
		
		output = new JTextField();
		output.setBackground(new Color(192, 192, 192));
		output.setForeground(new Color(0, 0, 0));
		output.setFont(new Font("Times New Roman", Font.BOLD, 12));
		output.setBounds(10, 300, 411, 19);
		displayed.add(output);
		output.setColumns(10);
	}
}
