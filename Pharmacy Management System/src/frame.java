import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class frame extends JFrame{
    frame(){
        JFrame frame = new JFrame(); // creating frame
        frame.setSize(800, 600); // setting frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting frame close operation
        frame.setTitle("Pharmacy Management System"); // setting frame title
        ImageIcon image = new ImageIcon("logo1.png"); // creating imageIcon object
        frame.setIconImage(image.getImage()); // setting frame icon
        frame.setVisible(true); // setting frame visible
        frame.getContentPane().setBackground(Color.gray); // setting layout to gray
    }
}
