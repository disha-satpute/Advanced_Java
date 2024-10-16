
import javax.swing.*;

class pro extends JFrame 
{
  JProgressBar pb;

  pro() {
    setLayout(null);   
    pb = new JProgressBar(1,100);
    pb.setValue(100);
    pb.setStringPainted(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }


  public static void main(String arg[]) {
    pro m = new pro();
    m.setSize(500, 500);
    m.setVisible(true);
  }
}
