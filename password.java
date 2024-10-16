import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Password extends Frame implements ActionListener
{
 JLabel L2 ,L3,L4;
 JTextField t1 ;
 JPasswordField t2 ;
 JButton b1;
 Password ()
 {	
   setLayout (null);
   
   L2 =  new JLabel("USERNAME");
   L3 = new JLabel ("PASSWORD");
   L4 = new JLabel();
    
	setBackground(Color.yellow);
    setForeground(Color.black);
    t1 = new JTextField(15);
    t2 = new JPasswordField(15);
 
   
   b1 = new JButton("LOGIN");
   b1.addActionListener(this);
   
	
	L2.setBounds(200,300,150,40);
	t1.setBounds(340,300,150,40);
	
	L3.setBounds(200,350,150,40);
	t2.setBounds(340,350,150,40);
	
	b1.setBounds(300,430,90,40);
	L4.setBounds(300,490,240,40);
	
	
  
	 add(L2);
	 add(t1);
	 add(L3);
	 add(t2);
	 add(b1);
     add(L4);
 }
 public void actionPerformed (ActionEvent ae)
 {
	   String un = t1.getText();
	   String pass = t2.getText();
	   if(un.equals("disha")&&pass.equals("disha"))
	   {
		   L4.setText("Login Successfully !!!");
	   }
	   else {
		   L4.setText("Login Failed !!!");
	   }
	   
 }
 public static void main (String args[])
 {
	 Password  lp1 = new Password();
	 lp1.setTitle("LOGIN PAGE");
	 lp1.setSize(700,700);
	 lp1.setVisible(true);
 }
 }