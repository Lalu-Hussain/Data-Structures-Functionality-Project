package com.kodnest.datastructures;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField output;
	private int size1;
	private int front=0;
	private int rear=-1;
	private int queue[];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("QUEUE DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel.setBounds(132, 10, 208, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(0, 128, 64));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(61, 60, 125, 15);
		contentPane.add(lblNewLabel_1);

		size = new JTextField();
		size.setFont(new Font("Times New Roman", Font.BOLD, 10));
		size.setBounds(222, 59, 96, 19);
		contentPane.add(size);
		size.setColumns(10);

		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//CREATE QUEUE
				try {
					if(size.getText().equals("")) {
						JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER POSITIVE INTEGERS TO CREATE A QUEUE");
					}
					else {
						size1= Integer.valueOf(size.getText());
						if(size1<=0) {
							JOptionPane.showMessageDialog(contentPane, "ENTER SIZE >0 FOR CREATING A QUEUE");
						}
						else {
							queue=new int[size1];
							String message="QUEUE GOT CREATED OF SIZE "+size1;
							JOptionPane.showMessageDialog(contentPane, message);
						}
					}
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER POSITIVE INTEGERS ONLY");
					size.setText("");
				}
			}
		});
		createqueue.setFont(new Font("Times New Roman", Font.BOLD, 12));
		createqueue.setForeground(new Color(0, 0, 255));
		createqueue.setBounds(126, 88, 140, 23);
		contentPane.add(createqueue);

		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setForeground(new Color(0, 128, 64));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(52, 144, 134, 15);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setFont(new Font("Times New Roman", Font.BOLD, 10));
		element.setBounds(222, 143, 96, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//INSERTING OPERATION OF QUEUE
				try {
					if(rear==size1-1) {
						element.setText("");
						JOptionPane.showMessageDialog(contentPane, "FIRST CREATE QUEUE");
					}
					else {
						int ele = Integer.valueOf(element.getText());
						++rear;
						queue[rear]=ele;
						element.setText("");
						output.setText("");
						JOptionPane.showMessageDialog(contentPane, "ELEMENT "+ele+" GOT INSERTED AT POSITION "+rear);
					}
				}catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER POSITIVE INTEGERS ONLY");
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Times New Roman", Font.BOLD, 12));
		insert.setForeground(new Color(0, 0, 255));
		insert.setBounds(52, 209, 85, 21);
		contentPane.add(insert);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETING OPERATION OF QUEUE
				if(rear==-1||front>rear) {
					JOptionPane.showMessageDialog(contentPane, "THERE IS NOTHING TO DELETE");
					output.setText("");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "ELEMENT DELETED IS "+queue[front]);
					++front;
					element.setText("");
					output.setText("");
				}
			}
		});
		delete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		delete.setForeground(new Color(255, 0, 0));
		delete.setBounds(337, 209, 85, 21);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rear==-1||front>rear) {
					JOptionPane.showMessageDialog(contentPane, "THERE IS NOTHING TO PRINT");
				}
				else {
					String empty="";
					for (int i =front; i <=rear; i++) {
						empty=empty+queue[i]+" ";
					}
					output.setText(empty);
				}
			}
		});
		display.setFont(new Font("Times New Roman", Font.BOLD, 12));
		display.setForeground(new Color(0, 0, 255));
		display.setBounds(193, 257, 96, 21);
		contentPane.add(display);

		output = new JTextField();
		output.setBackground(new Color(192, 192, 192));
		output.setForeground(new Color(0, 0, 0));
		output.setFont(new Font("Times New Roman", Font.BOLD, 12));
		output.setBounds(10, 307, 460, 19);
		contentPane.add(output);
		output.setColumns(10);
	}

}
