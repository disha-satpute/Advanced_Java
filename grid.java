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
public static void main(String args[])
{
  grid s1 = new grid();
  s1.setTitle("GridLayoutDemo");
  s1.setSize(500,500);
  s1.setVisible(true);

}
}