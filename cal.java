import java.awt.*;
import java.awt.event.*;
class cal extends Frame implements ActionListener
{
  Label l1 , l2 , l3 ;
  TextField t1 , t2 , t3 ;
  Button b1 , b2 , b3, b4 ;
   cal()
   { 
     
       setLayout(null);
	    setBackground(Color.orange);
         setForeground(Color.black);
	   l1 = new Label("Enter First Number");
       l2 = new Label("Enter Second Number");
       t3= new TextField(50);
	   t1 = new TextField(10);
	   t2 = new TextField(10);
	   b1 = new Button("ADD");
	   b2 = new Button("SUB");
	   b3 = new Button("MUL");
	   b4 = new Button("DIV");
	   l1.setBounds(100,120,200,30);
	   l2.setBounds(100,170,200,30);
	   
	   t1.setBounds(300,120,120,30);
	   t2.setBounds(300,170,120,30);
	   
	   t3.setBounds(100,250,420,30);
	   b1.setBounds(100,300,120,40);
	   b2.setBounds(100,350,120,40);
	   b3.setBounds(100,400,120,40);
	   b4.setBounds(100,450,120,40);
	   
	   b1.addActionListener(this);
	    b2.addActionListener(this);
		 b3.addActionListener(this);
		  b4.addActionListener(this);
		  
		       Font f11=new Font("Airal Black",Font.BOLD|Font.ITALIC,15);
                
                setFont(f11);
               
	
	    add(l1);
	    add(l2);
	    add(t1); 
		add(t2);
	    add(t3);
   add(b1);   add(b2);   add(b3);   add(b4);
   }
	  public void actionPerformed(ActionEvent ae)
	   {
		   String str = ae.getActionCommand();
		   int a = Integer.parseInt(t1.getText());
		   int b = Integer.parseInt(t2.getText());
			if(str.equals("ADD"))
			{
		   t3.setText("Addition : "+(a+b));
	        }
			if(str.equals("SUB"))
			{
		   t3.setText("Subtraction : "+(a-b));
			}
		   if(str.equals("MUL"))
			{
		   t3.setText("Multiplication : "+(a*b));
	        }
			if(str.equals("DIV"))
			{
		   t3.setText("Division : "+(a/b));
	        }
	        
 
        }
   
 
  public static void main (String args[])
  {
       cal m1 = new cal();
	   m1.setSize(500,500);
	   m1.setVisible(true);
  }
}