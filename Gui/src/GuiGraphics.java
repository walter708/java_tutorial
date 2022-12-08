import java.awt.*;
import javax.swing.*;

public class GuiGraphics extends JPanel{
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    
    g.setColor(Color.BLUE);
    g.fillRect(25, 25, 100, 30);
    
    g.setColor(new Color(120, 140,240));
    g.fillRect(150, 25, 100, 30);
    
    g.setColor(Color.GRAY);
    g.drawString("Hi Welcome", 100, 100);
    
  }
}
