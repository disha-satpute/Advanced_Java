import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JLoginPage extends Frame implements ActionListener
{
 JLabel L1 ,L2 ,L3,L4;
 JTextField t1 , t2 ;
 JButton b1;
 JLoginPage()
 {
	 
   setLayout (null);
   L1 = new JLabel("Department of Information Technology");
   L2 =  new JLabel("USERNAME");
   L3 = new JLabel ("PASSWORD");
   L4 = new JLabel();
    
	setBackground(Color.yellow);
    setForeground(Color.black);
	Font f1=new Font("Times New Roman",Font.BOLD,25);
 Font f2=new Font("Airal Black",Font.BOLD,15);
  setFont(f2);
   L1.setFont(f1);
   t1 = new JTextField(15);
   t2 = new JTextField(15);
   //t2.setEchoChar('*');
   
   b1 = new JButton("LOGIN");
   b1.addActionListener(this);
   
    L1.setBounds(150,200,500,40);
	
	L2.setBounds(200,300,150,40);
	t1.setBounds(340,300,150,40);
	
	L3.setBounds(200,350,150,40);
	t2.setBounds(340,350,150,40);
	
	b1.setBounds(300,430,90,40);
	L4.setBounds(300,490,240,40);
	
	
     add(L1);
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
	 JLoginPage lp1 = new JLoginPage();
	 lp1.setTitle("LOGIN PAGE");
	 lp1.setSize(700,700);
	 lp1.setVisible(true);
 }
 }