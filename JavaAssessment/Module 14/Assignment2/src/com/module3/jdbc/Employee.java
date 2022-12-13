package com.module3.jdbc;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Employee {
	JFrame f;
	JTable t;
	DefaultTableModel model;
	Employee(){
		f=new JFrame();
		t=new JTable(model);
		model=new DefaultTableModel();
		f.setSize(300, 400);
		f.setVisible(true);
		f.add(t);
		 t.setPreferredScrollableViewportSize(new Dimension(300, 100));
	        t.setFillsViewportHeight(true);
	        t.add(new JScrollPane(t));
		model.addColumn("id");
		model.addColumn("name");
		model.addColumn("email");
		model.addColumn("gender");
		t.setBounds(10, 10, 300, 400);
		
	}
	public static void main(String[] args) {
		new Employee();
		
	}
}