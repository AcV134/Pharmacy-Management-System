import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import java.awt.Color;
import java.awt.Font;



public class frame extends JFrame{

    frame(String color){

        this.setSize(1000,700); // setting frame size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting frame close operation
        this.setResizable(false); // setting frame non-resizable
        this.setTitle("Pharmacy Management System"); // setting frame title
        ImageIcon image = new ImageIcon("logo1.png"); // creating imageIcon object
        this.setIconImage(image.getImage()); // setting frame icon
        this.setVisible(true); // setting frame visible
        this.getContentPane().setBackground(Color.decode(color)); // setting layout to gray
        this.setLayout(null); // setting layout to null
        this.setLocationRelativeTo(null); // setting frame location to center (screen

        JLabel l = new JLabel(); // creating label
        l.setText("DashBoard"); // setting label text
        l.setBounds(400, 0, 200, 100); // setting label position
        l.setFont(new Font("SansSerif", Font.PLAIN, 40)); // setting label font


        JSeparator s = new JSeparator(); // creating separator
        s.setBounds(0, 80, 1000, 10); // setting separator position
        s.setBackground(new Color(0x000000)); // setting separator color

        this.add(l); // adding label to panel
        this.add(s); // adding separator to panel

    }

}
