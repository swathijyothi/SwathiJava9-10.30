package com.module3.jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class RegistrationForm implements ActionListener{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l5;
	static JTextField t1;
	JTextField t2;
	JTextField t4;
	JTextField t5;
	JTextArea a1;
	JButton b1,b2,b3,b4,b5,b6;
	JRadioButton r1,r2;
	ButtonGroup bg;
	JTable t;
	JScrollPane sb;
	static DefaultTableModel model;
	Object[] column;
	static Object[][]data;
	
	 RegistrationForm() {
		JFrame f=new JFrame("REGISTRATION FORM");
		f.setVisible(true);
		f.setSize(800, 600);
		f.setLayout(null);
      l=new JLabel("REGISTRATION FORM");	
	 l1=new JLabel("ID:");
	 l2=new JLabel("NAME:");
	 l3=new JLabel("GENDER");
	 l4=new JLabel("ADDRESS");
     l5=new JLabel("CONTACT");
	f.add(l);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);

 t1=new JTextField();
 t2=new JTextField();
 a1=new JTextArea();
 t5=new JTextField();
 r1=new JRadioButton("Male");
 r2=new JRadioButton("female");
 bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);


f.add(t1);
f.add(t2);
f.add(r1);
f.add(r2);
f.add(a1);
f.add(t5);
 b1=new JButton("Exit");
 b2=new JButton("Register");
 b3=new JButton("Delete");
 b4=new JButton("Update");
 b5=new JButton("Reset");
 b6=new JButton("Refresh Table");
 
 


// 
 
 



f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(sb);
f.add(t);

l.setBounds(20, 10, 150, 100);
l1.setBounds(10, 100, 120, 20);
l2.setBounds(10, 150, 120, 20);
l3.setBounds(10, 200, 120, 20);
l4.setBounds(10, 250, 120, 20);
l5.setBounds(10, 300, 120, 20);

t1.setBounds(90, 100, 100, 20);
t2.setBounds(90, 150, 100, 20);
r1.setBounds(90, 200, 100, 20);
r2.setBounds(150, 200, 100, 20);
a1.setBounds(90, 250, 100, 30);
t5.setBounds(90, 300, 100, 20);

b1.setBounds(10, 400, 80, 30);
b2.setBounds(100, 400, 90, 30);
b3.setBounds(10, 450, 80, 30);
b4.setBounds(100, 450, 80, 30);
b5.setBounds(50, 500, 80, 30);
b6.setBounds(300, 520, 350, 20);


t.setBounds(250, 10, 500, 500);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);


	}

	

	@Override
		public void actionPerformed(ActionEvent ae) {
		
			if(ae.getSource()==b2) {
				try {
					System.out.println("insert");
				Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
					String sql="insert into registration_form(name,gender,address,contact) values(?,?,?,?)";
					PreparedStatement pst =conn.prepareStatement(sql);
					pst.setString(1, t2.getText());
					if(r1.isSelected()) {
					 pst.setString(2, r1.getText());
					}else {
						 pst.setString(2, r2.getText());
					}
					
					pst.setString(3, a1.getText());
					pst.setInt(4, Integer.parseInt(t5.getText()));
					pst.executeUpdate();
					System.out.println("insert");
				
					JOptionPane.showMessageDialog(f, "Insert Successfully");
					t2.setText("");
					r1.setText("");
					r2.setText("");
					a1.setText("");
					t5.setText("");
				}catch(Exception e) {
					e.getStackTrace();
				}
			}
			else if(ae.getSource()==b3) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
					String sql="delete from registration_form where id=?";
					PreparedStatement pst=conn.prepareStatement(sql);
					pst.setInt(1, Integer.parseInt(t1.getText()));
					pst.executeUpdate();
					JOptionPane.showMessageDialog(f, "Delete Successfully");
					t2.setText("");
					r1.setText("");
					r2.setText("");
					a1.setText("");
					t5.setText("");
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if(ae.getSource()==b1) {
				System.exit(0);
			}
			else if(ae.getSource()==b4) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
					String sql="update registration_form set name=?,gender=?,address=?,contact=? where id=?";
					PreparedStatement pst=conn.prepareStatement(sql);
					pst.setString(1, t2.getText());
					if(r1.isSelected()) {
					 pst.setString(2, r1.getText());
					}else {
						 pst.setString(2, r2.getText());
					}
					
					pst.setString(3, a1.getText());
					pst.setInt(4, Integer.parseInt(t5.getText()));
					pst.setInt(5, Integer.parseInt(t1.getText()));
					pst.executeUpdate();
					JOptionPane.showMessageDialog(f, "Delete Successfully");
					t2.setText("");
					r1.setText("");
					r2.setText("");
					a1.setText("");
					t5.setText("");
					t1.setText("");
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	



	public static void main(String[] args) {
		new RegistrationForm();
		
	}






	

}
