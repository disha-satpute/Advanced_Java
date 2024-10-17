import javax.swing.*;
import java.awt.*;
class combo extends JFrame
{
  combo()
  {
  FlowLayout f1 = new FlowLayout();
  setLayout(f1);
  setBackground(Color.green);
  JComboBox jcb = new JComboBox();
  jcb.addItem("Maharashtra");
  jcb.addItem("Uttar Predesh");
 jcb.addItem("Madhya Predesh");
  jcb.addItem("Goa");
  jcb.addItem("Gujarat");
  add(jcb);
   }
  
public static void main(String args[])
{
  combo s1 = new combo();
  s1.setTitle("swing component");
  s1.setSize(500,500);
  s1.setVisible(true);
  
}
}