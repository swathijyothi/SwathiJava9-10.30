package com.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingDemo implements ActionListener{
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;

	 SwingDemo()
	 {
	f= new JFrame("EMPLOYEE REGESTRATION");
	f.setVisible(true);
	f.setSize(400, 500);
	f.setLayout(null);
	f.setResizable(false);
	  
	 
	// LABEL 
	l5=new JLabel("id");
	l1= new JLabel("First Name:");
	l2= new JLabel("Last Name:");
	l3= new JLabel("Email:");
	l4= new JLabel("Mobile:");
	
	f.add(l5);
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	// TEXTFIELD
	t5=new JTextField(30);
	t1=new JTextField(30);
	t2=new JTextField(30);
	t3=new JTextField(30);
	t4=new JTextField(30);
	
	f.add(t5);
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);
	//LABEL
	b1=new JButton("INSERT");
	b2=new JButton("SEARCH");
	b3=new JButton("UPDATE");
	b4=new JButton("DELETE");
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	
	// LATOUT
	l5.setBounds(50, 10, 100, 100);
	l1.setBounds(50, 50, 100, 100);
	l2.setBounds(50, 100, 100, 100);
	l3.setBounds(50, 150, 100, 100);
	l4.setBounds(50, 200, 100, 100);
	
	t5.setBounds(150, 45, 100, 20);
	t1.setBounds(150, 90, 100, 20);
	t2.setBounds(150, 140, 100, 20);
	t3.setBounds(150, 190, 100, 20);
	t4.setBounds(150, 240, 100, 20);
	
	b1.setBounds(50, 300, 100, 25);
	b2.setBounds(200, 300, 100, 25);
	b3.setBounds(50, 350, 100, 25);
	b4.setBounds(200, 350, 100, 25);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	 }

	 @Override
	 public void actionPerformed(ActionEvent ae) {
			
			if(ae.getSource()==b1)
			{
				
				try {
					
					
		//1)Import drive
					
				Class.forName("com.mysql.jdbc.Driver");
			//2)Establish connection
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			//3)write query
				String sql="insert into employee_data(first_name,last_name,email,mobile)values(?,?,?,?)";
			//4)prepare statement
				PreparedStatement pst=conn.prepareStatement(sql);
				
				pst.setString(1, t1.getText());
				pst.setString(2, t2.getText());
				pst.setString(3, t3.getText());
				pst.setString(4, t4.getText());
				
				pst.executeUpdate();
				JOptionPane.showMessageDialog(f, "insert successfully");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				} 
				catch (Exception e) {
				
					e.printStackTrace();
				}
			}
				
			else if(ae.getSource()==b2)
			{
				//import driver
				try {
					Class.forName("com.mysql.jdbc.Driver");
					//establish connection
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
					//write query
					String sql="select * from employee_data where id= ?";
					//prepare statement
					PreparedStatement pst=conn.prepareStatement(sql);
					pst.setInt(1, Integer.parseInt(t5.getText()));
					ResultSet rs=pst.executeQuery();
					if(rs.next()) 
					{
						t1.setText(rs.getString("first_name"));
						t2.setText(rs.getString("last_name"));
						t3.setText(rs.getString("email"));
						t4.setText(rs.getString("mobile"));
					}
					JOptionPane.showMessageDialog(f, "searched successfully");
					t5.setText("");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			else if(ae.getSource()==b3)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
					String sql="update employee_data set first_name=?,last_name=?,email=?,mobile=? where id=?";
					PreparedStatement pst=conn.prepareStatement(sql);
					pst.setString(1, t1.getText());
					pst.setString(2, t2.getText());
					pst.setString(3, t3.getText());
					pst.setString(4, t4.getText());
					pst.setInt(5,Integer.parseInt( t5.getText()));
					pst.executeUpdate();
					JOptionPane.showMessageDialog(f, "update succesfully");
					
					t5.setText("");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(ae.getSource()==b4)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
					String sql="delete from employee_data where id=?";
					PreparedStatement pst=conn.prepareStatement(sql);
					pst.setInt(1, Integer.parseInt(t5.getText()));
					pst.executeUpdate();
					JOptionPane.showMessageDialog(f, "deletd successfully");
					t5.setText("");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			
			
		}
	public static void main(String[] args) {
	new SwingDemo();	
	}




}	
	
	
