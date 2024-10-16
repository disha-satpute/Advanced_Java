import javax.swing.*;
import java.awt.*;
class student_table extends JFrame
{
 student_table()
 {
 Container c=getContentPane();
 BorderLayout b1=new BorderLayout();
 c.setLayout(b1);
 String colHeads[]={"Name","Percentage","Grade"};
 String data[][]={
 {"Amit","67.50","B"},
  {"Amit","97.30","A+"},
   {"Amit","62.59","B"},
    {"Amit","71.13","B"},
	 {"Amit","84.67","B"},
	  {"Amit","90.00","B"},
	   {"Amit","72.57","B"},
	    {"Amit","67.50","B"},
		 {"Amit","67.50","B"},
		 {"Amit","67.50","B"},
};
 
 JTable jt=new JTable(data,colHeads);
 jt.setBackground(Color.cyan);
 int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
 int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED; 
 JScrollPane jsp=new JScrollPane(jt,v,h);
 c.add(jsp,BorderLayout.CENTER);
 }
 public static void main(String args[])
 {
student_table j1=new student_table();
j1.setVisible(true);
j1.setTitle("JTable Demo");
j1.setSize(600,600);
j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
