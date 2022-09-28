package swingegtextpox;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButton {
	JFrame f;
	JLabel l,l1;
	
	JRadioButton b,b1;
	ButtonGroup g1;
	
	
	public RadioButton() {
		f=new JFrame("COLLEGE");
		f.setVisible(true);
		f.setSize(400, 400);
		f.setResizable(false);
		//f.setLayout(null);
		
		
		l=new JLabel("EDUCATION");
		l.setBounds(100, 1, 400, 200);
		l1=new JLabel("Qualification");
		l1.setBounds(50, 150, 100, 20);
		b=new JRadioButton("under gratude");
		b1=new JRadioButton("graduate");
	
		g1.add(b);
		g1.add(b1);
		
		f.add(l);
		f.add(l1);
		
	
		
	}


	public static void main(String[] args) {
		new RadioButton();
	}

}
