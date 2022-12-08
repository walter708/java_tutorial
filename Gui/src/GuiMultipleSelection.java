import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

import javax.swing.*;
import javax.swing.JSpinner.ListEditor;

public class GuiMultipleSelection extends JFrame {
  private JList<String> leftList;
  private JList<String> rightList;
  private JButton move;
  private static String[] foods = {"wings", "beacon", "moreBeacon", "friedMeat", "friedRice", "jolofRice"};
  
  public GuiMultipleSelection(){
    super("Title");
    setLayout(new FlowLayout());
    
    leftList = new JList<String>(foods);
    leftList.setVisibleRowCount(4);
    leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(leftList));
    
    move = new JButton("move -->");
    move.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        rightList.setListData(leftList.getSelectedValuesList().toArray(new String[ImageObserver.HEIGHT]));
      }
    });
    add(move);
    
    rightList = new JList<String>();
    rightList.setVisibleRowCount(4);
    rightList.setFixedCellWidth(100);
    rightList.setFixedCellHeight(13);
    add(new JScrollPane(rightList));
  }
}
