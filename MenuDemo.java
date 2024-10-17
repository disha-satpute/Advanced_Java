import java.awt.*;
import java.awt.event.*;
class MenuDemo extends Frame

{
	MenuShortcut ms;
 MenuDemo()
 {
 FlowLayout f1=new FlowLayout();
 setLayout(f1);
 setBackground(Color.cyan);
  ms = new MenuShortcut(KeyEvent.VK_S);
 MenuBar mbr=new MenuBar();
 
 Menu m1=new Menu("File");
 MenuItem m11=new MenuItem("New");
 Menu m12=new Menu("Open");
 MenuItem m121=new MenuItem("Disha Satpute");
 m12.add(m121);
 MenuItem m13=new MenuItem("Save",ms);
 
 m1.add(m11);
 m1.add(m12);
 m1.addSeparator();
 m1.add(m13);

 Menu m2=new Menu("Edit");
 MenuItem m21=new MenuItem("Cut");
 m21.setEnabled(false);
 MenuItem m22=new MenuItem("Copy");
 MenuItem m23=new MenuItem("Paste");
 MenuItem m24=new MenuItem("Delete");
 m2.add(m21);
 m2.add(m22);
 m2.add(m23);
 m2.add(m24);
 
 
 /*Menu m3=new Menu("Format");
 MenuItem m31=new MenuItem("Word Wrap");
 MenuItem m32=new MenuItem("Font...");
 m3.add(m31);
 m3.add(m32);*/
 
 
Menu m4=new Menu("View");
 CheckboxMenuItem m41=new CheckboxMenuItem("Status Bar");
  m4.add(m41);
 
 /*Menu m5=new Menu("Help");
 MenuItem m51=new MenuItem("View Help");
 MenuItem m52=new MenuItem("About NotePad");
 m5.add(m51);
 m5.add(m52);*/
 
 mbr.add(m1);
 mbr.add(m2);
 //mbr.add(m3);
 mbr.add(m4);
 //mbr.add(m5);
 
 setMenuBar(mbr);
 
 }
 public static void main(String args[])
 {

 MenuDemo npd=new MenuDemo();
npd.setVisible(true);
npd.setTitle("NotePad");
npd.setSize(800,800);
 }
}