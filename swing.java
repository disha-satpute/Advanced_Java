import javax.swing.*;
import java.awt.*;
class Jswing extends Frame
{
  Jswing
  {
  FlowLayout f1 = new FlowLayout();
  setLayout(f1);
  JLabel  l1 = new JLabel("enter your name :");
  JTextField t1 = new JTextField(10);
  JLabel  l2 = new JLabel("enter your Address:");
  JTextArea t2 = new JTextArea(10,10);
   add(l1);
   add(t1);
   add(l2);
   add(t2);
  }
public static void main(String args[])
{
  Jswing s1 = new Jswing();
  s1.setTitle("swing component");
  s1.setSize(500,500);
  s1.setVisible(true);
  
}
}