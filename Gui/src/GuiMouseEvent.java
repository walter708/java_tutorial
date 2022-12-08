import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiMouseEvent  extends JFrame{
  private JPanel mouJPanel;
  private  JLabel statusebar;
  
  public GuiMouseEvent(){
    super("title");
    
    mouJPanel = new JPanel();
    mouJPanel.setBackground(Color.WHITE);
    add(mouJPanel, BorderLayout.CENTER);
    
    statusebar = new JLabel("default");
    add(statusebar, BorderLayout.SOUTH);
    
    HandlerClass handler = new HandlerClass();
    
    mouJPanel.addMouseListener(handler);
    mouJPanel.addMouseMotionListener((handler));
  }
  
  private class HandlerClass implements MouseListener, MouseMotionListener {

    @Override
    public void mouseClicked(MouseEvent e) {
      // TODO Auto-generated method stub
      statusebar.setText(String.format("%d , %d", e.getX(), e.getY()));
      
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
      // TODO Auto-generated method stub
      statusebar.setText("You pressed the mouse ");
      
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub
      statusebar.setText("You pressed the Relesed the mouse");
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub
      statusebar.setText("You Entered the Panel");
      mouJPanel.setBackground(Color.RED);
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub
      statusebar.setText("You Exited the Panel");
      mouJPanel.setBackground(Color.WHITE);
      
    }

    @Override
    public void mouseDragged(MouseEvent e) {
      // TODO Auto-generated method stub
      statusebar.setText("You Dragged the mouse");
      
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      // TODO Auto-generated method stub
      statusebar.setText("You  moved the mouse");
      
    }
    
  }
  
  
  
}
