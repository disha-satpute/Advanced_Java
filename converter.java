import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class converter 
{
   converter()
    { 
	 JFrame f = new JFrame();
	  f.setBackground(Color.cyan);
        JLabel l1, l2 ,l3 , l4 ,title ;
        JTextField t1, t2,t3 ,t4 ;
        JButton b1, b2, b3 , b4 ,b5;
		title = new JLabel("Currency Converter ") ;
		title.setBounds(400, 20, 2400, 100);
        l1 = new JLabel("Rupees:");
        l1.setBounds(200, 200, 150, 50);
        l2 = new JLabel("Dollars:");
        l2.setBounds(400, 200, 150, 50);
		l3 = new JLabel("Euro:");
        l3.setBounds(600, 200, 150, 50);
		l4 = new JLabel("Euro:");
        l4.setBounds(800, 200, 150, 50);
        t2 = new JTextField("0.0");
        t2.setBounds(200, 250, 180, 50);
        t1 = new JTextField("0.0");
        t1.setBounds(400, 250, 180, 50);
		t3 = new JTextField("0.0");
        t3.setBounds(600, 250, 180, 50);
		t4 = new JTextField("0.0");
        t4.setBounds(800, 250, 180, 50);
        b1 = new JButton("INR");
        b1.setBounds(200, 350, 150, 35);
        b2 = new JButton("Dollar");
        b2.setBounds(400, 350, 150, 35);
		 b4 = new JButton("**");
        b4.setBounds(600, 350, 150, 35);
		b5 = new JButton("****");
        b5.setBounds(800, 350, 150, 35);
        b3 = new JButton("Close");
        b3.setBounds(500, 500, 200, 50);
		Font f11=new Font("Airal Black",Font.BOLD|Font.ITALIC,60);
        Font f2=new Font("Airal Black",Font.BOLD,25); Font f4=new Font("Airal Black",Font.BOLD,15);
		Font f3=new Font("Times new Roman",Font.BOLD,30);
		
                title.setFont(f11);  t1.setFont(f4); t2.setFont(f4); t3.setFont(f4);   t4.setFont(f4);  
                l1.setFont(f2);l2.setFont(f2); l3.setFont(f2);l4.setFont(f2);
				b1.setFont(f3); b2.setFont(f3);b3.setFont(f2); b4.setFont(f3);b5.setFont(f3);
  
  
        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               
                double d  = Double.parseDouble(t1.getText());
  
                double d1 = (d / 0.012);
  
                String str1 = String.valueOf(d1);
                t2.setText(str1);
            }
        });
  
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
             
                double d2 = Double.parseDouble(t2.getText());
  
             
                double d3 = (d2 * 0.012);
  
                
                String str2 = String.valueOf(d3);
				
                t1.setText(str2);
            }
        });
		 b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
             
                double d3 = Double.parseDouble(t2.getText());
  
             
                double d4 = (d3 * 0.011);
  
                
                String str3 = String.valueOf(d4);
				
                t3.setText(str3);
            }
        });
		b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
             
                double d5 = Double.parseDouble(t2.getText());
  
             
                double d6 = (d5 * 0.011);
  
                
                String str4 = String.valueOf(d6);
				
                t4.setText(str4);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        f.add(title);
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);
        f.add(t1);f.add(t2);f.add(t3);f.add(t4);
        
        
        f.add(b1);f.add(b2); f.add(b3); f.add(b4);f.add(b5);
       
  
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }
  
    public static void main(String args[])
    {
       converter c1 = new converter();
    }
}