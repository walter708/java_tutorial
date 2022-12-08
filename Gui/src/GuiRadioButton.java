import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GuiRadioButton extends JFrame{
  private JTextField textField;
  private JRadioButton plain;
  private JRadioButton bold;
  private JRadioButton italize;
  private JRadioButton italize_bold;
  private ButtonGroup bg;
  private Font pf;
  private Font bf;
  private Font itf;
  private Font bif;
  
  public GuiRadioButton(){
    super("This is the title");
    setLayout(new FlowLayout());
    
    textField = new JTextField("This is the text", 14);
    add(textField);
    bold = new JRadioButton("bold", false);
    add(bold);
    italize = new JRadioButton("italized", true);
    add(italize);
    italize_bold = new JRadioButton("Italize and bold", false);
    add(italize_bold);
    plain = new JRadioButton("plain", false);
    add(plain);
    bg = new ButtonGroup();
    bg.add(bold);
    bg.add(italize);
    bg.add(italize_bold);
    bg.add(plain);
    pf = new Font("Serif", Font.PLAIN, 14);
    bf = new Font("Serif", Font.BOLD, 14);
    itf = new Font("Serif", Font.ITALIC, 14);
    bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14); 
    textField.setFont(pf);
  
    bold.addItemListener(new HandlerClass(bf));
    italize.addItemListener(new HandlerClass(itf));
    italize_bold.addItemListener(new HandlerClass(bif));
    plain.addItemListener(new HandlerClass(pf));

  }
  private class HandlerClass implements ItemListener{
    Font font = null;
    public HandlerClass(Font f){
      font = f;
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
      // TODO Auto-generated method stub
      textField.setFont(font);
      
    }
  }
}