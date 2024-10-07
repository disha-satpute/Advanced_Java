
import java.awt.*;
import java.awt.event.*;
class CheckDemo extends Frame implements ActionListener 
{ 
   Checkbox c1,c2,c3,c4;
   Label l1;
   Button b1 ;
      CheckDemo()
       {
                setLayout(null);
	          
	            c1= new Checkbox("marathi");
	            c2= new Checkbox("Hindi");
	            c3= new Checkbox("English");
	            c4= new Checkbox("Sanskrit");
				
				b1 = new Button ("SUBMIT");
				
				l1 = new Label();
				
				c1.setBounds(100,140,60,60);
				c2.setBounds(100,180,60,60);
				c3.setBounds(100,220,60,60);
				c4.setBounds(100,260,60,60);
				
				l1.setBounds(100,400,130,120);
				b1.setBounds(100,340,100,40);
				b1.addActionListener(this);
				
	         add(c1);
	 	     add(c2);
		 	 add(c3);	 
			 add(c4);
			 add(b1);
			 add(l1);
  
       }
	   public void actionPerformed(ActionEvent ae)
	   {
		    String str = ae.getActionCommand();
			if(str.equals("SUBMIT"))
			{
				l1.setText("submit successfully");
			}
			else {
				l1.setText("data cannot submit");
			}
	   }
  public static void main (String args[])
   {
      CheckDemo tfd = new CheckDemo();
	   tfd.setVisible(true);
	   
       tfd.setTitle("Check Demo");
       tfd.setSize(500,500);
	   tfd.setVisible(true);
   }
  }