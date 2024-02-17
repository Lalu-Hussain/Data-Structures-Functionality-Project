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

public class SingleLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField element;
	private JTextField element1;
	private JTextField output;
	/**
	 * Launch the application.
	 */
	public class Node{
		private	int data;
		private Node link;
	}
	Node first;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleLinkedList frame = new SingleLinkedList();
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
	public SingleLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 355);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SINGLE LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel.setBounds(62, 10, 328, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(0, 128, 64));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 43, 142, 15);
		contentPane.add(lblNewLabel_1);

		element = new JTextField();
		element.setFont(new Font("Times New Roman", Font.BOLD, 12));
		element.setBounds(172, 41, 96, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				//INSERT REAR FOR SINGLY LINKED LIST
				if(element.getText().equals("")) {
					JOptionPane.showMessageDialog(contentPane, "PLEASE ENTER AN ELEMENT TO INSERT AT REAR");
				}
				else {
					try {
						int ele=Integer.valueOf(element.getText());
						Node newnode = new Node();
						newnode.data=ele;
						newnode.link=null;
						if(first==null) {
							first=newnode;
							JOptionPane.showMessageDialog(contentPane,"ELEMENT "+first.data+" GOT INSERTED");
							element.setText("");
							output.setText("");
						}
						else {
							Node temp=first;
							while(temp.link!=null) {
								temp=temp.link;
							}
							temp.link=newnode;
							temp=temp.link;
							JOptionPane.showMessageDialog(contentPane,"ELEMENT "+temp.data+" GOT INSERTED");
							element.setText("");
							output.setText("");
						}

					}catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane,"PLEASE ENTER INTEGERS ONLY");
						element.setText("");
					}
				}
			}
		});
		insertrear.setForeground(new Color(0, 0, 255));
		insertrear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		insertrear.setBounds(311, 39, 156, 23);
		contentPane.add(insertrear);

		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//INSERT FRONT FOR SINGLY LINKED LIST
				if(element1.getText().equals("")) {
					JOptionPane.showMessageDialog(contentPane,"PLEASE ENTER AN ELEMENT TO INSERT AT FRONT");
				}
				else {
					try {
				int ele = Integer.valueOf(element1.getText());
				Node newnode = new Node();
				newnode.data=ele;
				newnode.link=null;
				if(first==null) {
					first=newnode;
					output.setText("");
				}
				else {
					newnode.link=first;
					first=newnode;
					String message="ELEMENT "+first.data+" GOT INSERTED ";
					JOptionPane.showMessageDialog(contentPane,message);
					element1.setText("");
					output.setText("");
				}
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane,"PLEASE ENTER INTEGERS ONLY");
					}
				}
			}
		});
		insertfront.setForeground(new Color(128, 0, 0));
		insertfront.setFont(new Font("Times New Roman", Font.BOLD, 12));
		insertfront.setBounds(311, 100, 156, 23);
		contentPane.add(insertfront);

		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_2.setForeground(new Color(0, 128, 64));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 104, 142, 15);
		contentPane.add(lblNewLabel_2);

		element1 = new JTextField();
		element1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		element1.setBounds(172, 102, 96, 19);
		contentPane.add(element1);
		element1.setColumns(10);

		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE REAR FOR SINGLY LINKED LIST
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "NOTHING TO DELETE AT REAR");
					output.setText("");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane,"ELEMENT "+first.data+" GOT DELETED AT REAR");
					first=null;
					output.setText("");
				}
				else {
					Node temp;
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane,"ELEMENT "+temp.link.data+" GOT DELETED");
					temp.link=null;
					output.setText("");
				}
			}
		});
		deleterear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		deleterear.setForeground(new Color(255, 0, 0));
		deleterear.setBounds(33, 172, 147, 23);
		contentPane.add(deleterear);

		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//DELETE FRONT FOR SINGLY LINKED LIST
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "NOTHING TO DELETE AT FRONT");
					output.setText("");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane,"ELEMENT "+first.data+" GOT DELETED AT FRONT");
					first=null;
					output.setText("");

				}
				else {
					JOptionPane.showMessageDialog(contentPane, "ELEMENT "+first.data+" GOT DELETED");
					first=first.link;
					output.setText("");
				}
			}
		});
		deletefront.setForeground(new Color(255, 0, 0));
		deletefront.setFont(new Font("Times New Roman", Font.BOLD, 12));
		deletefront.setBounds(311, 172, 156, 23);
		contentPane.add(deletefront);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY FOR SINGLY LINKED LIST
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "THERE IS NOTHING TO DISPLAY");
					output.setText("");
				}
				else if(first.link==null) {
					String message="";
					message=message+first.data;
					output.setText(message);
				}
				else {
					String message="";
					Node temp;
					temp=first;
					while(temp!=null) {
						message=message+(temp.data+" ");
						temp=temp.link;
					}
					output.setText("");
					output.setText(message);
				}
			}
		});
		display.setFont(new Font("Times New Roman", Font.BOLD, 12));
		display.setForeground(new Color(0, 0, 255));
		display.setBounds(184, 220, 107, 23);
		contentPane.add(display);

		output = new JTextField();
		output.setBackground(new Color(192, 192, 192));
		output.setFont(new Font("Times New Roman", Font.BOLD, 12));
		output.setBounds(20, 278, 482, 19);
		contentPane.add(output);
		output.setColumns(10);
	}
}
