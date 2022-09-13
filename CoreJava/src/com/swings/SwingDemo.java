package com.swings;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo {
	JFrame f;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4;

	 SwingDemo()
	 {
	f= new JFrame("EMPLOYEE REGESTRATION");
	f.setVisible(true);
	f.setSize(400, 500);
	f.setLayout(null);
	f.setResizable(false);
	
	// LABEL 
	l1= new JLabel("First Name:");
	l2= new JLabel("Last Name:");
	l3= new JLabel("Email:");
	l4= new JLabel("Mobile:");
	
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	// TEXTFIELD
	t1=new JTextField(30);
	t2=new JTextField(30);
	t3=new JTextField(30);
	t4=new JTextField(30);
	
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);
	//LABEL
	b1=new JButton("INSERT");
	b2=new JButton("UPDATE");
	b3=new JButton("SEARCH");
	b4=new JButton("DELETE");
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	
	// LATOUT
	l1.setBounds(50, 50, 100, 100);
	l2.setBounds(50, 100, 100, 100);
	l3.setBounds(50, 150, 100, 100);
	l4.setBounds(50, 200, 100, 100);
	
	t1.setBounds(150, 90, 100, 20);
	t2.setBounds(150, 140, 100, 20);
	t3.setBounds(150, 190, 100, 20);
	t4.setBounds(150, 240, 100, 20);
	
	b1.setBounds(50, 300, 100, 25);
	b2.setBounds(200, 300, 100, 25);
	b3.setBounds(50, 350, 100, 25);
	b4.setBounds(200, 350, 100, 25);
	 }


	public static void main(String[] args) {
	new SwingDemo();	
	}
}
