import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class CardDemo extends JFrame implements ActionListener 
{
  CardLayout card ;
  JButton b1,b2,b3;
  Container c ;
  CardDemo()
  {
    c = getContentPane();
	card = new CardLayout(40,30);
	c.setLayout(card);
	b1 = new JButton("Disha");
	b2 = new JButton("Pandurang");
	b3 = new JButton("Satpute");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	c.add("a",b1);c.add("b",b2);c.add("c",b3);
  }
  public void actionPerformed(ActionEvent ae)
  {
    card.next(c);
  }
  public static void main (String args[])
  { 
  CardDemo cd = new CardDemo();
  cd.setVisible(true);
  cd.setSize(500,500);
  cd.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

