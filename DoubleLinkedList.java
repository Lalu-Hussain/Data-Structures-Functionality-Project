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

public class DoubleLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField element;
	private JTextField element1;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public class Node{
		private	Node prelink;
		private int data;
		private Node nextlink;
	}
	Node first;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoubleLinkedList frame = new DoubleLinkedList();
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
	public DoubleLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DOUBLE LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel.setBounds(113, 10, 334, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(0, 128, 64));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(39, 56, 142, 15);
		contentPane.add(lblNewLabel_1);

		element = new JTextField();
		element.setFont(new Font("Times New Roman", Font.BOLD, 12));
		element.setBounds(215, 54, 96, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//INSERT REAR FOR DOUBLY LINKED LIST
				if(element.getText().equals("")) {
					JOptionPane.showMessageDialog(contentPane,"PLEASE ENTER AN ELEMENT TO INSERT AT REAR");
				}
				else {
					try {
				int ele=Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data=ele;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"ELEMENT "+first.data+" GOT INSERTED");
					element.setText("");
					element1.setText("");
					output.setText("");
				}
				else {
					Node temp;
					temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(contentPane, "ELEMENT "+newnode.data+" GOT INSERTED");
					element.setText("");
					element1.setText("");
					output.setText("");
				}
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane,"PLEASE ENTER INTEGERS ONLY");
						element.setText("");
						element1.setText("");
						output.setText("");
					}
			}
			}
		});
		insertrear.setForeground(new Color(0, 0, 255));
		insertrear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		insertrear.setBounds(367, 53, 142, 23);
		contentPane.add(insertrear);

		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_2.setForeground(new Color(0, 128, 64));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(39, 116, 142, 15);
		contentPane.add(lblNewLabel_2);

		element1 = new JTextField();
		element1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		element1.setBounds(215, 114, 96, 19);
		contentPane.add(element1);
		element1.setColumns(10);

		JButton btnNewButton = new JButton("INSERT FRONT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//INSERT FRONT FOR DOUBLY LINKED LIST
				if(element1.getText().equals("")) {
					JOptionPane.showMessageDialog(contentPane,"PLEASE ENTER AN ELEMENT TO INSERT AT FRONT");
				}
				else {
					try {
				int ele=Integer.valueOf(element1.getText());
				Node newnode = new Node();
				newnode.data=ele;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"ELEMENT "+first.data+" GOT INSERTED");
					element.setText("");
					element1.setText("");
					output.setText("");
				}
				else {
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "ELEMENT "+first.data+" GOT INSERTED");
					element.setText("");
					element1.setText("");
					output.setText("");
				}
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane,"PLEASE ENTER INTEGERS ONLY");
						element.setText("");
						element1.setText("");
						output.setText("");
					}
			}
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(367, 112, 142, 23);
		contentPane.add(btnNewButton);

		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//DELETE REAR FOR DOUBLY LINKED LIST
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "THERE IS NOTHING TO DELETE AT REAR");
					element.setText("");
					element1.setText("");
					output.setText("");
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "ELEMENT "+first.data+" GOT DELETED");
					first=null;
					element.setText("");
					element1.setText("");
					output.setText("");
				}
				else {
					Node temp;
					temp=first;
					while(temp.nextlink.nextlink!=null) {
						temp=temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "ELEMENT "+temp.nextlink.data+" GOT DELETED");
					temp.nextlink=null;
					element.setText("");
					element1.setText("");
					output.setText("");
				}
			}
		});
		deleterear.setForeground(new Color(255, 0, 0));
		deleterear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		deleterear.setBounds(50, 194, 140, 23);
		contentPane.add(deleterear);

		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//DELETE FRONT FOR DOUBLY LINKED LIST
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "THERE IS NOTHING TO DELETE AT FRONT");
					element.setText("");
					element1.setText("");
					output.setText("");
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "ELEMENT "+first.data+" GOT DELETED");
					first=null;
					element.setText("");
					element1.setText("");
					output.setText("");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "ELEMENT "+first.data+" GOT DELETED");
					first=first.nextlink;
					first.prelink=null;
					element.setText("");
					element1.setText("");
					output.setText("");
				}
			}
		});
		deletefront.setForeground(new Color(255, 0, 0));
		deletefront.setFont(new Font("Times New Roman", Font.BOLD, 12));
		deletefront.setBounds(340, 194, 147, 23);
		contentPane.add(deletefront);

		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//DISPLAY FORWARD FOR DOUBLY LINKED LIST
				if(first==null) {
					element.setText("");
					element1.setText("");
					output.setText("");
					JOptionPane.showMessageDialog(contentPane, "THERE IS NOTHING TO DISPLAY");
				}
				else if(first.nextlink==null) {
					element.setText("");
					element1.setText("");
					output.setText("");
					String message="";
					message=message+first.data;
					output.setText(message);
				}
				else {
					element.setText("");
					element1.setText("");
					output.setText("");
					String message="";
					Node temp;
					temp=first;
					while(temp!=null) {
						message=message+(temp.data+" ");
						temp=temp.nextlink;
					}
					output.setText(message);
				}
			}
		});
		displayforward.setForeground(new Color(0, 0, 128));
		displayforward.setFont(new Font("Times New Roman", Font.BOLD, 12));
		displayforward.setBounds(39, 262, 171, 23);
		contentPane.add(displayforward);

		JButton displaybackward = new JButton("DISPLAY BACKWARD");
		displaybackward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//DISPLAY BACKWARD FOR DOUBLY LINKED LIST
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "THERE IS NOTHING TO DISPLAY");
					element.setText("");
					element1.setText("");
					output.setText("");
				}
				else if(first.nextlink==null) {
					element.setText("");
					element1.setText("");
					output.setText("");
					String message="";
					message=message+first.data;
					output.setText(message);
				}
				else {
					element.setText("");
					element1.setText("");
					output.setText("");
					String message="";
					Node temp;
					temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						message=message+(temp.data+" ");
						temp=temp.prelink;
					}
					output.setText(message);
				}
			}
		});
		displaybackward.setForeground(new Color(0, 64, 128));
		displaybackward.setFont(new Font("Times New Roman", Font.BOLD, 12));
		displaybackward.setBounds(326, 262, 183, 23);
		contentPane.add(displaybackward);

		output = new JTextField();
		output.setFont(new Font("Times New Roman", Font.BOLD, 12));
		output.setBackground(new Color(192, 192, 192));
		output.setBounds(10, 318, 527, 19);
		contentPane.add(output);
		output.setColumns(10);
	}

}
