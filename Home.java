package com.kodnest.datastructures;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 435);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel.setBounds(237, 10, 254, 20);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.setForeground(Color.BLUE);
		array.setFont(new Font("Times New Roman", Font.BOLD, 12));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
				
//				Array a = new Array();
//				a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setBounds(305, 50, 114, 23);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place STACK window opening code here
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(Color.RED);
		stack.setFont(new Font("Times New Roman", Font.BOLD, 12));
		stack.setBounds(106, 120, 159, 23);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place QUEUE window opening code here
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(Color.MAGENTA);
		queue.setFont(new Font("Times New Roman", Font.BOLD, 12));
		queue.setBounds(462, 120, 140, 23);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place CIRCULAR QUEUE window opening code here
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(0, 64, 0));
		cqueue.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cqueue.setBounds(70, 205, 224, 23);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLE LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place SINGLE LINKED LIST window opening code here
				new SingleLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(64, 128, 128));
		sll.setFont(new Font("Times New Roman", Font.BOLD, 12));
		sll.setBounds(443, 205, 198, 23);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLE LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place DOUBLY LINKED LIST window opening code here 
				new DoubleLinkedList().setVisible(true);
			}
		});
		dll.setForeground(new Color(255, 0, 128));
		dll.setFont(new Font("Times New Roman", Font.BOLD, 12));
		dll.setBounds(237, 304, 259, 23);
		contentPane.add(dll);
	}
}
