import java.awt.*;
import java.awt.event.*;
import java.io.*;

 class Myframe extends Frame 
 {  
    MenuBar bar;   
    Menu M1,M2,M3,M4,M5,font,bg,fg;
    MenuItem M11,M12,M13,M14,M15,M16,M17,M18,M19;
   
    MenuItem size8,size12,size16,size20,size24,size28,Pink,Cyan,Green,Orange,Yellow,yfg,pfg,cfg,gfg,ofg,wfg;
    CheckboxMenuItem m32;
    TextArea textArea;
    String text;
  Button b1;
   
     Myframe()
    {

        setTitle("My Notepad");
       

            MenuShortcut mshortcutM11 = new MenuShortcut(KeyEvent.VK_N);
            MenuShortcut mshortcutM12 = new MenuShortcut(KeyEvent.VK_O);
            MenuShortcut mshortcutM13 = new MenuShortcut(KeyEvent.VK_S);
            MenuShortcut mshortcutM14 = new MenuShortcut(KeyEvent.VK_X);

            MenuShortcut mshortcutM15 = new MenuShortcut(KeyEvent.VK_C);
            MenuShortcut mshortcutM16 = new MenuShortcut(KeyEvent.VK_V);
            MenuShortcut mshortcutM17 = new MenuShortcut(KeyEvent.VK_T);
            MenuShortcut mshortcutM18 = new MenuShortcut(KeyEvent.VK_A);

            bar = new MenuBar();  

            M1 = new Menu("File");
            M2 = new Menu("Edit");
            
            M3=new Menu("Format");
			M4=new Menu("Setting");
            M5=new Menu("View");
            font=new Menu("Font Size");
			bg=new Menu("Set Background");
			fg=new Menu("Set Foreground");

            Menu m31=new Menu("Zoom");
		MenuItem m311=new MenuItem("Zoom in");
		MenuItem m312=new MenuItem("Zoom out");
		MenuItem m313=new MenuItem("Restore default zoom");
		m31.add(m311);
		m31.add(m312);
		m31.add(m313);
		m32=new CheckboxMenuItem("Status Bar");
		MenuItem m33=new MenuItem("Word wrap");
		M5.add(m31);
		M5.add(m32);
		M5.add(m33);
           
            M11 =new MenuItem("New",mshortcutM11);
            M12 =new MenuItem("Open",mshortcutM12);
            M13 =new MenuItem("Save",mshortcutM13);
            M14 =new MenuItem("Exit",mshortcutM14);

            M15 =new MenuItem("Copy",mshortcutM15);
            M16 =new MenuItem("Paste",mshortcutM16);
            M17 =new MenuItem("Cut",mshortcutM17);
            M18 =new MenuItem("Select All",mshortcutM18);

            size8 =new MenuItem("8");
            size12 =new MenuItem("12");
            size16 =new MenuItem("16");
            size20=new MenuItem("20");
            size24=new MenuItem("24");
            size28=new MenuItem("28");
			
			Pink=new MenuItem("Pink");
			Cyan=new MenuItem("Cyan");
			Green=new MenuItem("Green");
			Orange=new MenuItem("Orange");
			Yellow=new MenuItem("Yellow");
			
			cfg=new MenuItem("Cyan");
			pfg=new MenuItem("Pink");
			ofg=new MenuItem("Orange");
			yfg=new MenuItem("Yellow");
			wfg=new MenuItem("White");
			gfg=new MenuItem("Green");
			
			M19=new MenuItem("Help");
			
			M4.add(M19);
			
			bg.add(Pink);
			bg.add(Cyan);
			bg.add(Green);
			bg.add(Orange);
			bg.add(Yellow);
			
			fg.add(cfg);
			fg.add(pfg);
			fg.add(ofg);
			fg.add(yfg);
			fg.add(wfg);
			fg.add(gfg);

            M1.add(M11);
            M1.add(M12);
            M1.add(M13);
			M1.addSeparator();
            M1.add(M14);
        
            M2.add(M15);
            M2.add(M16);
			M2.addSeparator();
            M2.add(M17);
			M2.addSeparator();
            M2.add(M18);

           M3.add(font);
		   M3.addSeparator();
		   M3.add(bg);
		   M3.add(fg);

           font.add(size8);
           font.add(size12);
           font.add(size16);
           font.add(size20);
           font.add(size24);
           font.add(size28);



            textArea= new TextArea();
	

        
            bar.add(M1);
            bar.add(M2);
            bar.add(M3);
			bar.add(M4);
            bar.add(M5);
		
            setMenuBar(bar);           
            add(textArea);
	
           
            textArea.setForeground(Color.BLUE);
            textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
            
            setSize(1000,600);   
            setVisible(true);
  
        M12.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent event)
			{
                FileDialog dialog = new FileDialog(new Frame(),"Open",FileDialog.LOAD); 
                dialog.setVisible(true);
                String path = dialog.getDirectory()+dialog.getFile(); 
                setTitle(dialog.getFile()+" - NotePad");
                
                try {
                    FileInputStream fi = new FileInputStream(path); 
                    byte b[]=new byte[fi.available()];
                    fi.read(b);
                    String str = new String(b); 
                    textArea.setText(str);
                    fi.close();
                    
                } catch (Exception e) {
                    
                    System.out.println("Something went Wrong :(");
                }
            }
        });

    M11.addActionListener(new ActionListener()
	{
        public void actionPerformed(ActionEvent event) 
		{
            setTitle("Untitled - NotePad");
            textArea.setText(" ");
		textArea.setBackground(Color.white);
        }
    });
	
	
	
	
        M13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                FileDialog dialog = new FileDialog(new Frame(),"Save ",FileDialog.SAVE);
                dialog.setVisible(true);
                String path = dialog.getDirectory()+dialog.getFile();
                setTitle(dialog.getFile()+"- NotePad");
                
                try {

                 FileWriter fw = new FileWriter(path);
                    fw.write(textArea.getText());
                    fw.close();

                }
				catch (Exception e) {
                    
                    System.out.println("Something went Wrong :(");
                }
            }
        });
        M14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                setVisible(false);
            }
        });

  
      
        M15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                    text = textArea.getSelectedText();
            }
        });

  
      
        M16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                   textArea.insert(text,textArea.getCaretPosition()); 
            }
        });

  
      
        M17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                text = textArea.getSelectedText(); 
                textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd()); 
            }
        });
      
        M18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.selectAll(); }}); 
        size8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font("Times New Roman", Font.BOLD,8)); 
            }
        });
        size12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font("Times New Roman", Font.BOLD,12));
            }
        });
        size16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font("Times New Roman", Font.BOLD,16));
            }
        });
        size20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font("Times New Roman", Font.BOLD,20));
            }
        });
        size24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font("Times New Roman", Font.BOLD,24));
            }
        });
        size28.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textArea.setFont(new Font("Times New Roman", Font.BOLD,28));
            }
        });
		     
	
		Pink.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setBackground(Color.pink);
		}});
        
			Cyan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setBackground(Color.cyan);
		}});
		Green.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setBackground(Color.green);
		}});
		Orange.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setBackground(Color.orange);
		}});
		Yellow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setBackground(Color.yellow);
		}});
		
		cfg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setForeground(Color.cyan);
		}});
		ofg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setForeground(Color.orange);
		}});
		pfg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setForeground(Color.pink);
		}});
		wfg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setForeground(Color.white);
		}});
		gfg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setForeground(Color.green);
		}});
		yfg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
				textArea.setForeground(Color.yellow);
		}});  

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent event){
                 setVisible(false);   
            }
        }); 
    }
 }        
    

 

 

public class notepad2{
    public static void main(String[] args) {
        new Myframe();
    }
}
	 