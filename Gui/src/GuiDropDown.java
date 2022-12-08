import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuiDropDown extends JFrame {
  private JComboBox box;
  private JLabel pictures;
  private static String[] filename = {"img_a.png", "img_b.png"};
  private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
  
  public GuiDropDown(){
    super("This is the title");
    setLayout(new FlowLayout());
    
    box  = new JComboBox(filename);
    box.addItemListener(
      /** If you notice this is an anonymose class 
       * which implements ItemListener interface telling you that 
       * you can have an anonymose class that implements an interface and returns an
       * object immediatly
       */
      new ItemListener(){
        public void itemStateChanged(ItemEvent event){
          /** getStateChange return if you trigger an event or not 
           * this line evaluates what was selected
          */
          if(event.getStateChange() == ItemEvent.SELECTED)
            pictures.setIcon(pics[box.getSelectedIndex()]);
        }
      }
    );
    
    add(box);
    pictures = new JLabel(pics[0]);
    add(pictures);
  }
  
}
