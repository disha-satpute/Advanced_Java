import java.awt.*;
class component extends Frame 
{
   Label l1 , l2 , l3 , l4 , l5 , l6;
   TextField t1 , t2 ,t3 ;
   TextArea tt1;
   Choice ch1;
   CheckboxGroup cbg;
   Checkbox c1 ,c2,c3,c4 ;
   Button b1 ;
   component()
   {  
	  setLayout(null);
	 setBackground(Color.cyan);
     setForeground(Color.black);
	  
	  Font f1 = new Font("Arial Black" , Font.BOLD , 12);
	  setFont(f1);
	  b1= new Button("SUBMIT");
	  l1 = new Label("Enter Enrollment No :");
	  l2 = new Label ("Enter name :");
	  l3 = new Label("Enter Collage Name :");
	  t1 = new TextField(10);
	  t2 = new TextField(20);
	  t3 = new TextField("Government polytechnic awasari");
	  l4 = new Label("select Department :");
	  cbg = new CheckboxGroup();
	  c1=new Checkbox("CO",false,cbg);
      c2=new Checkbox("IF",false,cbg);
	  c3=new Checkbox("AE",false,cbg);
      c4=new Checkbox("ME",false,cbg);
	  l5 = new Label("Select Courses :");
	 
	   ch1=new Choice();
       ch1.add("C");
       ch1.add("C++");
       ch1.add("JAVA");
       ch1.add("PYTHON");
       ch1.add("ANDROID");
       ch1.add("PHP");
	   l6 = new Label("Enter Additional Skills :");
      tt1 = new TextArea(10,10);
       l1.setBounds(50,100,120,30);
	   l2.setBounds(50,140,120,30); 
	   l3.setBounds(50,180,120,30);
	   l4.setBounds(50,210,120,30);
	   c1.setBounds(200,210,120,30);
	   c2.setBounds(200,230,120,30);
	   c3.setBounds(200,250,120,30);
	   c4.setBounds(200,270,120,30);
	   t1.setBounds(200,100,120,30);
	   t2.setBounds(200,140,120,30);
	   t3.setBounds(200,180,220,30);
	   l5.setBounds(50,300,120,30);
	   l6.setBounds(50,350,150,30);
       ch1.setBounds(200,310,120,30);
	   tt1.setBounds(200,350,200,100);
	   b1.setBounds(100,500,120,30);
	  add(l1);add(t1);
	  add(l2); add(t2);
	  add(l3);add(t3); add(l4);add(c1);add(c2);add(c3);add(c4);
      add(l5); add(ch1); add(b1); add(l6); add(tt1);
	 }
	 public static void main (String args[])
	 {
	    
		component cm1 = new component();
		cm1.setSize(500,500);
		cm1.setTitle("Component use");
		cm1.setVisible(true);
	 }
}

 