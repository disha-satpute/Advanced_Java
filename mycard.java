import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class mycard extends JFrame implements ActionListener 
{
  CardLayout card ;
  JButton b1,b2,b3;
  JCheckBox c1 ,c2 ,c3,c4;
  Label l1 ;
  Container c , c11;
  mycard()
  {
    c = getContentPane();
	    c11 = getContentPane();
	card = new CardLayout(40,30);
	c.setLayout(card);
c.setBackground(Color.cyan);

	b1 = new JButton("Windows");
	b2 = new JButton("Linux");
	b3 = new JButton("THANK YOU..!!");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	c.add("a",b1);
c1.add("b",b2);
c.add("c",b3);
  }
  public void actionPerformed(ActionEvent ae)
  {
    card.next(c);
  }
  public static void main (String args[])
  { 
  mycard cd = new mycard();
  cd.setVisible(true);
  cd.setSize(500,500);
  cd.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

