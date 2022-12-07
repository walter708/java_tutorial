import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Gui extends JFrame{
  private JButton reg;
  private JButton custom;
  
  public Gui(){
    super("This is the title");
    setLayout(new FlowLayout());
    
    reg = new JButton("New Button");
    add(reg);
    
    Icon b = new ImageIcon(getClass().getResource("img_a.png"));
    Icon x = new ImageIcon(getClass().getResource("img_b.png"));
    custom = new JButton("Custom Button", b);
    custom.setRolloverIcon(x);
    add(custom);
    HandleEvent handleEvent = new HandleEvent();
    
    custom.addActionListener(handleEvent);
    reg.addActionListener(handleEvent);
    
    
  }
  
  private class HandleEvent implements ActionListener{
    public void actionPerformed(ActionEvent event){
      JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
    }
  }
}