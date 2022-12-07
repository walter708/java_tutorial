import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiJava extends JFrame{
  private JLabel item1;
  
  public GuiJava(){
    super("This is the title");
    setLayout(new FlowLayout());
    item1 = new JLabel("This is a sentence");
    item1.setToolTipText("Hey!!");
    add(item1);
  }
  
}
