import java.awt.*;
import java.awt.event.*;
class student extends Frame implements ActionListener
{
	Button b1;
	Label  L1 ,L2,L3,L4,L5,L6,L9;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	student()
	{
		setLayout(null);
		setBackground(Color.pink);
        setForeground(Color.black);
		
		           L1=new Label("Enter Enr. Number:");
                   tf1=new TextField(20); 
                   L2=new Label("Enter Name:");
                   tf2=new TextField(20); 
				   L3=new Label("Select Gender:");
                   tf3=new TextField(20);
                   L4=new Label("Enter City:",Label.RIGHT);
                   tf4=new TextField(20);
                   L5=new Label("Enter Mobile No:",Label.RIGHT);
                   tf5=new TextField(20);
                   L6=new Label("Enter Email ID:",Label.RIGHT);
                   tf6=new TextField(20);
				   
				   L1.setBounds( 50,50,120,40);
				    tf1.setBounds( 50,100,120,40);
					 L2.setBounds( 100,50,120,40);
					  tf2.setBounds( 50,150,120,40);
					   L3.setBounds( 150,50,120,40);
					    tf3.setBounds( 50,200,120,40);
						 L4.setBounds( 50,50,120,40);
						  tf4.setBounds( 50,50,120,40);
						   L5.setBounds( 50,50,120,40);
						   tf5.setBounds( 50,50,120,40);
						   L6.setBounds( 50,50,120,40);
						   tf6.setBounds( 50,50,120,40);
						  
		                   
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
	public static void main(String args[])
 {
 student v1=new student();
v1.setVisible(true);
v1.setTitle("form");
v1.setSize(900,800);
 }
}