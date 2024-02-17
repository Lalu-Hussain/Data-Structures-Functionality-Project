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

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deletingposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 419);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(142, 10, 214, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH  :");
		lblNewLabel_1.setForeground(new Color(0, 128, 64));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(65, 55, 153, 15);
		contentPane.add(lblNewLabel_1);

		length = new JTextField();
		length.setFont(new Font("Times New Roman", Font.BOLD, 10));
		length.setBounds(260, 53, 96, 19);
		contentPane.add(length);
		length.setColumns(10);

		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//CODE FOR CREATING AN ARRAY

					//				String text = length.getText();
					//				Integer len = Integer.valueOf(text);
					int len =Integer.valueOf(length.getText());
					if(len<=0) {
						JOptionPane.showMessageDialog(contentPane, "ENTER SIZE >0 FOR CREATING AN ARRAY");
					}
					else {
					arr=new int[len];
					String message="ARRAY OF LENGTH "+len+" GOT CREATED";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER VALID SIZE TO CREATE AN ARRAY");
					length.setText("");
				}
			}
		});
		create.setForeground(new Color(0, 0, 255));
		create.setFont(new Font("Times New Roman", Font.BOLD, 12));
		create.setBounds(172, 90, 143, 23);
		contentPane.add(create);

		JLabel lblNewLabel_2 = new JLabel("INSERT AN INTEGER ELEMENT :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(0, 128, 64));
		lblNewLabel_2.setBounds(23, 146, 195, 15);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setFont(new Font("Times New Roman", Font.BOLD, 10));
		element.setBounds(260, 144, 96, 19);
		contentPane.add(element);
		element.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("ENTER POSITION :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(0, 128, 64));
		lblNewLabel_3.setBounds(104, 181, 111, 15);
		contentPane.add(lblNewLabel_3);

		insertposition = new JTextField();
		insertposition.setFont(new Font("Times New Roman", Font.BOLD, 10));
		insertposition.setBounds(260, 179, 96, 19);
		contentPane.add(insertposition);
		insertposition.setColumns(10);

		JButton insertion = new JButton("INSERT");
		insertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERTION
				try {
					if(element.getText().equals("")) {
						JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER  ELEMENT");
					}
					else {
						int elem=Integer.valueOf(element.getText());
						if(insertposition.getText().equals("")) {
							JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER POSITION");
						}
						else {
							try {
								int pos=Integer.valueOf(insertposition.getText());
								arr[pos]=elem;
								String message="ELEMENT "+elem+" INSERTED AT POSITION "+pos;
								JOptionPane.showMessageDialog(contentPane, message);
								element.setText("");
								insertposition.setText("");

							}catch (Exception e2) {
								JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER POSITION FROM "+'0'+" TO "+(arr.length-1));
							}
						}
					}
				}catch (NullPointerException e2) {
					JOptionPane.showMessageDialog(contentPane,"FIRST CREATE ARRAY");
					element.setText("");
					insertposition.setText("");
				}	
				catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane,"PLEASE ENTER INTEGERS ONLY");
					element.setText("");
					insertposition.setText("");
				}
			}
		});
		insertion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		insertion.setForeground(new Color(0, 0, 255));
		insertion.setBounds(172, 206, 129, 21);
		contentPane.add(insertion);

		JLabel lblNewLabel_4 = new JLabel("DELETING POSITION :");
		lblNewLabel_4.setForeground(new Color(0, 128, 64));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(85, 256, 133, 15);
		contentPane.add(lblNewLabel_4);

		deletingposition = new JTextField();
		deletingposition.setFont(new Font("Times New Roman", Font.BOLD, 10));
		deletingposition.setBounds(260, 255, 96, 19);
		contentPane.add(deletingposition);
		deletingposition.setColumns(10);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETION
				try {
					try {
						if(deletingposition.getText().equals("")) {
							JOptionPane.showMessageDialog(contentPane,"PLEASE ENTER POSITION");
						}
						else {
							int pos=Integer.valueOf(deletingposition.getText());
							arr[pos]=0;
							String message="ELEMENT DELETED AT POSITION "+pos;
							JOptionPane.showMessageDialog(contentPane, message);
							deletingposition.setText("");
							displaybox.setText("");
						}
					}catch (NullPointerException e1) {
						JOptionPane.showMessageDialog(contentPane, "CREATE AN ARRAY AND INSERT ELEMENTS");
					}
				}catch (Exception e2) {
					JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER POSITION FROM "+'0'+" TO "+(arr.length-1));
				}
			}
		});
		delete.setForeground(new Color(255, 0, 0));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		delete.setBounds(384, 253, 103, 23);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//CODE FOR DISPLAY
				try {
					String message="";
					for(int i=0;i<=arr.length-1;i++) {
						message=message+" "+arr[i];
					}
					displaybox.setText(message);
					displaybox.setText("");
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane,"THERE IS NOTHING TO PRINT");
					displaybox.setText("");
				}
			}
		});
		display.setForeground(new Color(0, 128, 64));
		display.setFont(new Font("Times New Roman", Font.BOLD, 12));
		display.setBounds(162, 295, 153, 21);
		contentPane.add(display);

		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		displaybox.setBackground(new Color(192, 192, 192));
		displaybox.setBounds(23, 340, 475, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
