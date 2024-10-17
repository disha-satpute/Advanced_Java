import java.awt.*;
import java.awt.event.*;
class disable_black extends Frame
{

 disable_black()
 {
 FlowLayout f1=new FlowLayout();
 setLayout(f1);
 setBackground(Color.cyan);
 MenuBar mbr=new MenuBar();
 Menu m2=new Menu("Color");
 MenuItem m22=new MenuItem("red");
 MenuItem m23=new MenuItem("white");
 MenuItem m21=new MenuItem("black");
 m21.setEnabled(false);
 MenuItem m24=new MenuItem("pink");
 m2.add(m21);
 m2.add(m22);
 m2.add(m23);
 m2.add(m24);
 mbr.add(m2);
 setMenuBar(mbr);
 }
 public static void main(String args[])
 {
 disable_black npd=new disable_black();
npd.setVisible(true);
npd.setTitle("NotePad");
npd.setSize(800,800);
 }
}