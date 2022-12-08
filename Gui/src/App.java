import javax.swing.JFrame;
public class App {
    public static void main(String[] args) throws Exception {
        // AdpClass gui = new AdpClass();
        // gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // gui.setSize(300, 200);
        // gui.setVisible(true);
        FilesWrite fileI = new FilesWrite();
        FileRead readI = new FileRead();
        String path = "C:\\test\\walter.txt";
        
         Data userOne = new Data("Walter", "Okpala");
         Data userTwo = new Data("Chiemela", "Okpala");
         
         fileI.openRecord(path);
         fileI.addRecord(userOne);
         fileI.addRecord(userTwo);
         fileI.closeRecord();
         
         readI.openRecord(path);
         readI.readRecord();
    }

}
