import javax.swing.JFrame;

public class Screen extends JFrame{
   public Screen() {
    setTitle("Interface");
    setVisible(true);
    setSize(800, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
   } 
}