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

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField output;
	private int cqueue[];
	private int rear=-1;
	private int front =0;
	private int count=0;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel.setBounds(62, 10, 300, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(0, 128, 64));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(44, 43, 125, 15);
		contentPane.add(lblNewLabel_1);

		length = new JTextField();
		length.setFont(new Font("Times New Roman", Font.BOLD, 12));
		length.setBounds(209, 41, 125, 19);
		contentPane.add(length);
		length.setColumns(10);

		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//CREATE CIRCULAR QUEUE

				try {
					size = Integer.valueOf(length.getText());
					if(size<=0) {
						JOptionPane.showMessageDialog(contentPane, "ENTER SIZE >0 FOR CREATING A CIRCULAR QUEUE");
					}
					else {
						cqueue=new int[size];
						String message="CIRCULAR QUEUE GOT CREATED OF SIZE "+size;
						JOptionPane.showMessageDialog(contentPane, message);
					}
				}catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(contentPane,"ENTER POSITIVE INTEGERS TO CREATE A CIRCULAR QUEUE");
					length.setText("");
				}
			}
		});
		create.setFont(new Font("Times New Roman", Font.BOLD, 12));
		create.setForeground(new Color(0, 0, 255));
		create.setBounds(132, 75, 145, 23);
		contentPane.add(create);

		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(0, 128, 64));
		lblNewLabel_2.setBounds(35, 126, 134, 15);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setFont(new Font("Times New Roman", Font.BOLD, 12));
		element.setBounds(209, 124, 125, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERTION OF CIRCULAR QUEUE

				try {
					if(count==size) {
						JOptionPane.showMessageDialog(contentPane, "INSERTION NOT POSSIBLE");
						element.setText("");
					}
					else {
						int ele=Integer.valueOf(element.getText());
						rear=(rear+1)%size;
						cqueue[rear]=ele;
						count++;
						String message="ELEMENT "+ele+" INSERTED AT POSITION "+rear;
						JOptionPane.showMessageDialog(contentPane,message);
						element.setText("");
					}
				}catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER INTEGERS ONLY");
					element.setText("");
				}
			}

		});
		insert.setForeground(new Color(0, 0, 255));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 12));
		insert.setBounds(44, 182, 93, 23);
		contentPane.add(insert);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETION OF CIRCULAR QUEUE
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, " INSERT ELEMENTS");
					element.setText("");
				}
				else {
					String message="ELEMENT DELETED IS "+cqueue[front];
					JOptionPane.showMessageDialog(contentPane,message);
					front=(front+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(255, 0, 0));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		delete.setBounds(272, 182, 102, 23);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY OF CIRCULAR QUEUE
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "DISPLAY NOT POSSIBLE");
					output.setText("");
				}
				else {
					String empty="";
					for (int i =front; i <=rear; i++) {
						empty=empty+cqueue[i]+" ";
					}
					output.setText(empty);

				}
			}
		});
		display.setForeground(new Color(0, 0, 255));
		display.setFont(new Font("Times New Roman", Font.BOLD, 12));
		display.setBounds(148, 212, 111, 21);
		contentPane.add(display);

		output = new JTextField();
		output.setFont(new Font("Times New Roman", Font.BOLD, 12));
		output.setBackground(new Color(192, 192, 192));
		output.setBounds(10, 254, 400, 19);
		contentPane.add(output);
		output.setColumns(10);
	}
}
