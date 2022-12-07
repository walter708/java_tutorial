import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.crypto.spec.PBEKeySpec;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class MoreGUI extends JFrame{
  private JTextField userNameInput;
  private JTextField nameInput;
  private JTextField emailInput;
  private JPasswordField passwordInput;
  
  public MoreGUI(){
    super("Sign Up Form");
    setLayout(new FlowLayout());
    
    userNameInput = new JTextField("Enter userName ", 10);
    add(userNameInput);
    nameInput = new JTextField("Enter Name ", 20);
    add(nameInput);
    emailInput = new JTextField("Enter Email", 30);
    add(emailInput);
    passwordInput = new JPasswordField( "MyPassword");
    add(passwordInput); 
    
    TheHandler theHandler = new TheHandler();
    userNameInput.addActionListener(theHandler);
    nameInput.addActionListener(theHandler);
    emailInput.addActionListener(theHandler);
    passwordInput.addActionListener(theHandler);
    
  }
  
    private class TheHandler implements ActionListener{
      public void actionPerformed(ActionEvent event){
        String string = "";
        if(event.getSource() == userNameInput){
          string = String.format("userName : %s", event.getActionCommand());
        }
        else if(event.getSource() == nameInput){
          string = String.format("Name : %s", event.getActionCommand());
        }
        else if(event.getSource() == emailInput){
          string = String.format("Email : %s", event.getActionCommand());
        }
        else if(event.getSource() == passwordInput){
          string = String.format("Password : %s", event.getActionCommand());
        }
        JOptionPane.showMessageDialog(null, string);
      }
    }
}
