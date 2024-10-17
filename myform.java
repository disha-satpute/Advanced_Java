
import java.awt.*;
import java.awt.event.*;
class myform extends Frame implements ActionListener 
{ 
   Checkbox c1,c2,c3,c4;
   Label L1,L2,L3,L4,L5,L6,L7,L8,main1,L9,L17,L18,L19,L20,L21;
   TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
   
   Button b1 ;
      myform()
       {
                setLayout(null);
                setBackground(Color.cyan);
                setForeground(Color.black);
				    
				   main1=new Label("***STUDENT REGISTRATION FORM***");
                   L1=new Label("Enter First Name:");
                   tf1=new TextField(20); 
                   L2=new Label("Enter Last Name:");
                   tf2=new TextField(20); 
                   L3=new Label("Select Gender:");
                   tf3=new TextField(20);
                   L4=new Label("Enter City:");
                   tf4=new TextField(20);
                   L5=new Label("Enter Mobile No:");
                   tf5=new TextField(20);
                   L6=new Label("Enter Email ID:");
                   tf6=new TextField(20);
                   L7 = new Label("Languages you Learned/Learning :");
	          
	            c1= new Checkbox("JAVASCRIPT");
	            c2= new Checkbox("HTML CSS");
	            c3= new Checkbox("PYTHON");
	            c4= new Checkbox("ANDROID");
		         b1 = new Button ("SUBMIT");
				
		         Font f11=new Font("Airal Black",Font.BOLD|Font.ITALIC,20);
                Font f2=new Font("Airal Black",Font.BOLD,15);
                main1.setFont(f11);
                setFont(f2); 
				
		L9 = new Label();
		main1.setBackground(Color.orange);
 main1.setBounds(130,50,370,40);
 L1.setBounds(100,100,120,40);
 tf1.setBounds(240,100,250,40);
 L2.setBounds(100,150,120,40);
 tf2.setBounds(240,150,250,40);
 L3.setBounds(100,200,120,40);
 tf3.setBounds(240,200,250,40);
 L4.setBounds(100,250,120,40);
 tf4.setBounds(240,250,250,40);
 L5.setBounds(100,300,120,40);
 tf5.setBounds(240,300,250,40);
 L6.setBounds(100,350,120,40);
 tf6.setBounds(240,350,250,40);
 L7.setBounds(100,400,120,40);
 
 L18.setBounds(100,700,120,40);
  L17.setBounds(600,600,120,40); L19.setBounds(100,710,120,40);
 L20.setBounds(100,720,120,40);L21.setBounds(100,730,120,40);

 


				c1.setBounds(270,470,120,60);
				c2.setBounds(270,510,120,60);
				c3.setBounds(270,550,120,60);
				c4.setBounds(270,590,120,60);
				
				L9.setBounds(200,650,180,120);
				b1.setBounds(100,650,80,40);
				b1.addActionListener(this);
				
			   add(main1);
               add(L1);add(tf1);
               add(L2);add(tf2);
               add(L3);add(tf3);
               add(L4);add(tf4);
               add(L5);add(tf5);
               add(L6);add(tf6);
               add(L7);add(tf7);
			   add(L8);
	         add(c1);
	 	     add(c2);
		 	 add(c3);	 
			 add(c4);
			 add(b1);
			 add(L9); add(L17);add(L19);
			 add(L18);add(L20); add(L21);
  
       }
	   
	   public void actionPerformed(ActionEvent ae)
	   {
		    
			L9.setText("Records Submitted Successfully !!..Please see below Details..");
			
			L18.setText(tf1.getText());
			L19.setText(tf2.getText());
			L20.setText(tf3.getText());
			L21.setText(tf4.getText());
			
	   }
  public static void main (String args[])
   {
      myform cd = new myform();

	   
       cd.setTitle("My form design");
       cd.setSize(9000,9000);
	   cd.setVisible(true);
   }
}
  