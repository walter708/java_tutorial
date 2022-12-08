import java.awt.*;
import javax.swing.*;

public class GuiDrawMoreStuff  extends JPanel{
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    
    g.setColor(Color.BLUE);
    g.drawLine(10, 10, 80, 10);
    
    g.setColor(Color.RED);
    g.drawRect(10, 15, 20, 15);
    
    g.setColor(Color.GREEN);
    g.fillOval(10, 60, 50, 40);
    
    g.setColor(Color.ORANGE);
    g.fill3DRect(10, 110, 80, 10, true);
  }
  
}
