import java.awt.*;
import java.awt.event.*;
class evenodd extends Frame implements ActionListener
{
   Label l1,l2 , l3;
   Button b1 ;
  TextField tf1 ;
   evenodd()
   {  
	  setLayout(null);
	  l1 = new Label("Enter a number");
	  tf1 = new TextField(10);
      l2 = new Label("result :");
	  b1 = new Button ("CLICK");
	  l3 = new Label();
	  b1.addActionListener(this);
	  l1.setBounds(100,100,100,30);
	  tf1.setBounds(200,100,120,30);
	  l2.setBounds(100,150,100,30);
	  l3.setBounds(200,150,200,30);
	  	  b1.setBounds(200,200,90,30);
	  add(l1); add(tf1); add(l2);add(l3); add(b1);
	  
	  }
	  public void actionPerformed (ActionEvent ae)
	  {  
		 int  a = Integer.parseInt(tf1.getText());
		  if ((a%2 )== 0)
		  {
			 l3.setText("Above number is Even");
		   }
		   else
		   {
			  l3.setText("Above number is Odd");
		   }
		  
	  }
	 public static void main (String args[])
	 {
	    
		evenodd cm1 = new evenodd();
		cm1.setSize(500,500);
		cm1.setTitle("EVEN-ODD");
		cm1.setVisible(true);
	 }
}

 