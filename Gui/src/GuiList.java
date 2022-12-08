import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class GuiList  extends JFrame{
  private  JList list;
  private String[] colorNames = {"black", "blue", "yellow", "red", "white"};
  private Color[] colors = {Color.BLACK, Color.BLUE, Color.YELLOW, Color.RED, Color.WHITE}; 
  
  public GuiList(){
    super("Title");
    setLayout(new FlowLayout());
    
    list = new JList(colorNames);
    list.setVisibleRowCount(4);
    list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    add(new JScrollPane(list));
    
    list.addListSelectionListener(
      new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent event){
          getContentPane().setBackground(colors[list.getSelectedIndex()]);
        }
      }
    );
    
  }
}
