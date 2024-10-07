import java.awt.*;
import java.awt.event.*;
class Action_event extends Frame implements ActionListener
{
 Label L4;
 Button b1;
 Action_event()
 {
	 
   setLayout (null);
   L4 = new Label();
   b1 = new Button("LOGIN");
   b1.addActionListener(this);
   b1.setBounds(300,430,90,40);
	L4.setBounds(300,490,240,40);
	add(b1);
     add(L4);
 }
 public void actionPerformed (ActionEvent ae)
 {
	   String s = ae.getActionCommand();
	   L4.setText("you select " +s );
	   
 }
 public static void main (String args[])
 {
	 Action_event lp1 = new Action_event();
	 lp1.setTitle("LOGIN PAGE");
	 lp1.setSize(700,700);
	 lp1.setVisible(true);
 }
 }