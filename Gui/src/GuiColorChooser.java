import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GuiColorChooser extends JFrame{
  private JButton btn;
  private Color color = Color.WHITE;
  private JPanel panel;
  
  public GuiColorChooser(){
    super("Title");
    panel = new JPanel();
    panel.setBackground(color);
    
    btn = new JButton("Choose a color");
    btn.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event ){
          color = JColorChooser.showDialog(null, "Pick a color", color);
          if(color == null){
            color = (Color.WHITE);
          }
          panel.setBackground(color);
        }
      }
    );
    add(panel, BorderLayout.CENTER);
    add(btn, BorderLayout.SOUTH);
    setSize(200, 400);
    setVisible(true);
  }
  
}
