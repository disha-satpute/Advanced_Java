import javax.swing.*;
import java.awt.*;
class grid extends Frame
{
  grid()
  {
  GridLayout f1 = new GridLayout(5,5);
  setLayout(f1);
  for (int i =1 ;i<= 25 ;i++)
  {
	  add (new Button(""+i));
  }
  /*JLabel  l1 = new JLabel("enter your name :");
  JTextField t1 = new JTextField(10);
  JLabel  l2 = new JLabel("enter your Address:");
  JTextArea t2 = new JTextArea(2,10);
  JLabel  l3 = new JLabel("Choose the Language:");
  JComboBox c1 = new JComboBox();*/
  }
public static void main(String args[])
{
  grid s1 = new grid();
  s1.setTitle("GridLayoutDemo");
  s1.setSize(500,500);
  s1.setVisible(true);
  
}
}