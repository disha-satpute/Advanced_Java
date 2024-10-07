import java .awt.*;
import java.awt.event.*;
class fees extends Frame implements ItemListener
{
   CheckboxGroup cbg;
  Checkbox C1 , C2, C3,C4 ;
  Label L1;
  fees()
  {
     setLayout(null);
	 cbg = new CheckboxGroup();
	 C1 = new Checkbox("Open",false,cbg);
	 C2 = new Checkbox("OBC",false,cbg);
	 C3 = new Checkbox("ST/NT",false,cbg);
	 C4 = new Checkbox("EBC",false,cbg);
	 L1= new Label();
	 C1.setBounds(50,50,200,30);
	 C2.setBounds(50,100,200,30);
	 C3.setBounds(50,150,200,30);
	 C4.setBounds(50,200,200,30);
	 L1.setBounds(50,250,200,30);
	 C1.addItemListener(this);
	 C2.addItemListener(this);
	 C3.addItemListener(this);
	 C4.addItemListener(this);
	 
	 add(C1);
	 add(C2);
	 add(C3);
	 add(C4);
	 add(L1);
  }
  public void itemStateChanged(ItemEvent ie)
  {
    if(C1.getState())
	{
	   L1.setText("you need to pay 40,000rs fees");
	}
	else if(C2.getState())
	{
	   L1.setText("you need to pay 30,000rs fees");
	}
	else if(C3.getState())
	{
	   L1.setText("you need to pay 15,000rs fees");
	}
	else if(C4.getState())
	{
	   L1.setText("you need to pay 20,000rs fees");
	}
  }
  public static void main(String args[])
  {
    fees f1 = new fees();
	f1.setSize(500,500);
	f1.setVisible(true);
  }
}