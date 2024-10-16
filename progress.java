
import javax.swing.*;

class progress extends JFrame 
{
  JProgressBar pb;

  progress() {
    setLayout(null);   
    pb = new JProgressBar(1,100);
    pb.setValue(100);
    pb.setStringPainted(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }


  public static void main(String arg[]) {
    progress m = new progress();
    m.setSize(500, 500);
    m.setVisible(true);
  }
}
