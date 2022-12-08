import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiLayoutManipulation extends JFrame{
  private JButton lb;
  private JButton cb;
  private JButton rb;
  private FlowLayout layout;
  private Container container;
  
  public GuiLayoutManipulation(){
    super("The title");
    layout = new FlowLayout();
    container = getContentPane();
    setLayout(layout);
    
    lb = new JButton("left");
    add(lb);
    // align left 
    lb.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event){
          layout.setAlignment(FlowLayout.LEFT);
          layout.layoutContainer(container);
        }
      }
    );    
    
        // align center 
        cb = new JButton("center");
        add(cb);
        cb.addActionListener(
          new ActionListener(){
            public void actionPerformed(ActionEvent event){
              layout.setAlignment(FlowLayout.CENTER);
              layout.layoutContainer(container);
            }
          }
        ); 
          
        // align right 
        rb = new JButton("right");
        add(rb);
        rb.addActionListener(
          new ActionListener(){
            public void actionPerformed(ActionEvent event){
              layout.setAlignment(FlowLayout.RIGHT);
              layout.layoutContainer(container);
            }
          }
        );

  }
}
