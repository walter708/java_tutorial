import javax.swing.JFrame;
public class App {
    public static void main(String[] args) throws Exception {
        Gui gui = new Gui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 200);
        gui.setVisible(true);
    }
}
