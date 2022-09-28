package swingegtextpox;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Text extends JFrame implements ActionListener{
	
	static JFrame f;
	static JLabel l1;
	
	static JTextField t1;
	static JButton b1;
public static void main(String[] args) {
	
	f= new JFrame("text box");
	f.setVisible(true);
	f.setSize(400, 400);
	Text t=new Text();
	
	l1=new JLabel("Username");
	l1.setForeground(Color.red);
	
	b1= new JButton("submit");
	b1.setForeground(Color.blue);
	JPanel p=new JPanel();
	
	t1=new JTextField(10);
	p.add(l1);
	p.add(t1);
	p.add(b1);
	p.setLayout(new FlowLayout());
	f.add(p);
}
	 public void actionPerformed(ActionEvent e)
	    {
	        String s = e.getActionCommand();
	        if (s.equals("submit")) {
	            // set the text of the label to the text of the field
	            l1.setText(t1.getText());
	 
	            // set the text of field to blank
	            t1.setText("  ");
	        }
}
}
