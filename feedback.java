
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class feedback extends Frame implements ActionListener 
{ 
   JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
   JLabel L1,L2,L3,L4,L5,L6,L7,main1,L8,L9;
   

   
   Button b1 ;
      feedback()
       {
                setLayout(null);
				setBackground(Color.cyan);
                setForeground(Color.black);
				    b1 = new Button ("SUBMIT");
				    L9= new JLabel();
				Font f11=new Font("Airal Black",Font.BOLD|Font.ITALIC,20);
                Font f2=new Font("Airal Black",Font.BOLD,15);
				 main1=new JLabel("***Feedback Form***");
                main1.setFont(f11);
                setFont(f2); 
				
		 main1.setBackground(Color.orange);
         main1.setBounds(500,50,370,40);
             L1 = new JLabel(" how was the teaching of faculty:");
	            c1= new JCheckBox("Poor");
	            c2= new JCheckBox("Good");
	            c3= new JCheckBox("Excellent");
		     L2 = new JLabel(" how was the teaching of faculty:");
	            c4= new JCheckBox("Poor");
	            c5= new JCheckBox("Good");
	            c6= new JCheckBox("Excellent");
		     L3 = new JLabel(" how was the teaching of faculty:");
	            c7= new JCheckBox("Poor");
	            c8= new JCheckBox("Good");
	            c9= new JCheckBox("Excellent");
		     L4 = new JLabel(" how was the teaching of faculty:");
	            c10= new JCheckBox("Poor");
	            c11= new JCheckBox("Good");
	            c12= new JCheckBox("Excellent");
		     L5 = new JLabel(" how was the teaching of faculty:");
	            c13= new JCheckBox("Poor");
	            c14= new JCheckBox("Good");
	            c15= new JCheckBox("Excellent");
			 L6 = new JLabel(" how was the teaching of faculty:");
	            c16= new JCheckBox("Poor");
	            c17= new JCheckBox("Good");
	            c18= new JCheckBox("Excellent");
			 L7 = new JLabel(" how was the teaching of faculty:");
	            c19= new JCheckBox("Poor");
	            c20= new JCheckBox("Good");
	            c21= new JCheckBox("Excellent");
			 L8 = new JLabel(" how was the teaching of faculty:");
	            c22= new JCheckBox("Poor");
	            c23= new JCheckBox("Good");
	            c24= new JCheckBox("Excellent");
			 
			L1.setBounds(300,200,1200,40);
				c1.setBounds(300,250,120,40);
				c2.setBounds(450,250,120,40);
				c3.setBounds(600,250,120,40);
			L2.setBounds(300,300,1200,40);
				c4.setBounds(300,350,120,40);
				c5.setBounds(450,350,120,40);
				c6.setBounds(600,350,120,40);
			L3.setBounds(300,400,1200,40);
				c7.setBounds(300,450,120,40);
				c8.setBounds(450,450,120,40);
				c9.setBounds(600,450,120,40);
			L4.setBounds(300,500,1200,40);
				c10.setBounds(300,550,120,40);
				c11.setBounds(450,550,120,40);
				c12.setBounds(600,550,120,40);
			L5.setBounds(300,600,1200,40);
				c13.setBounds(300,650,120,40);
				c14.setBounds(450,650,120,40);
				c15.setBounds(600,650,120,40);
			L6.setBounds(300,700,1200,40);
				c16.setBounds(300,750,120,40);
				c17.setBounds(450,750,120,40);
				c18.setBounds(600,750,120,40);
			L7.setBounds(300,800,1200,40);
				c19.setBounds(300,850,120,40);
				c20.setBounds(450,850,120,40);
				c21.setBounds(600,850,120,40);
			L8.setBounds(300,900,1200,40);
				c22.setBounds(300,950,120,40);
				c23.setBounds(450,950,120,40);
				c24.setBounds(600,950,120,40);
			L9.setBounds(300,1000,120,40);
				
	

			
				b1.setBounds(500,1500,120,40);
				b1.addActionListener(this);
				
			   add(main1);
               add(L1);
               add(L2);
               add(L3);
               add(L4);
               add(L5);
               add(L6);
               add(L7); add(L8);//add(L9);
	         add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);add(c8);add(c9);add(c10);add(c11);add(c12);
			 add(c13);add(c14);add(c15);add(c16);add(c17);add(c18);add(c19);add(c20);add(c21);add(c22);add(c23);add(c24); 
			 add(b1);
			
			 
			
       }
	   
	   public void actionPerformed(ActionEvent ae)
	   {
		    String str = ae.getActionCommand();
			if(str.equals("SUBMIT"))
			{
				L9.setText("submit successfully");
			}
			else {
				L9.setText("data cannot submit");
			}
			
	   }
  public static void main (String args[])
   {
      feedback d1=new feedback();
       d1.setTitle("My form design");
       d1.setSize(900,900);
	   d1.setVisible(true);
   }
}
  