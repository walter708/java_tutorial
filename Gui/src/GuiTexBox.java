import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

import javax.swing.*;


public class GuiTexBox extends JFrame{
  private JTextField textField;
  private JCheckBox bold;
  private JCheckBox italize;
  
  public GuiTexBox(){
    super("This is the title");
    setLayout(new FlowLayout());
    
    textField = new JTextField("The is a text", 20);
    textField.setFont(new Font("Serif", Font.PLAIN, 14));
    add(textField);
    
    bold = new JCheckBox("bold");
    italize = new JCheckBox("italize");
    add(bold);
    add(italize);
    Handler handler = new  Handler();
    bold.addItemListener(handler);
    italize.addItemListener(handler);
  }
  
  private class Handler implements ItemListener{
    @Override
    public void itemStateChanged(ItemEvent e) {
      // TODO Auto-generated method stub
      Font font = null;
      boolean isBothSelected = bold.isSelected() && italize.isSelected();
      boolean isItalized = italize.isSelected();
      boolean isBold = bold.isSelected();
   
      if(isBothSelected)
        font = new Font("Serif" ,  Font.BOLD + Font.ITALIC, 14);
      else if(isBold)
        font = new Font("Serif" ,  Font.BOLD, 14);
      else if(isItalized)
        font = new Font("Serif" ,Font.ITALIC, 14);
      else
        font = new Font("Serif" ,Font.PLAIN, 14);
      textField.setFont(font);
    }
  }
  
}
