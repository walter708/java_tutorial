import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdpClass  extends JFrame{
  private String details;
  private JLabel statusLabel;
  
  public AdpClass(){
    super("Title");
    
    statusLabel = new JLabel("Default input");
    add(statusLabel, BorderLayout.SOUTH);
    addMouseListener(new MouseClass());
  }
  
  private class MouseClass extends MouseAdapter{
    public void mouseClicked(MouseEvent event){
       details = String.format("you clicked %s", event.getClickCount());
       if(event.isMetaDown())
          details+= "with the right mouse button";
       else if(event.isAltDown())
          details+= "with the center mouse button";
       else
        details+= "with the left mouse button";
      statusLabel.setText(details);
    }
    
  }
}
