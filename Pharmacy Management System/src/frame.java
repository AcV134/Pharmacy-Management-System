import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import java.awt.Color;
import java.awt.Font;



public class frame extends JFrame{

    frame(){
        JLabel l = new JLabel(); // creating label
        l.setText("Dashboard"); // setting label text
        l.setBounds(600, 0, 200, 100); // setting label position
        l.setFont(new Font("MV Boli", Font.PLAIN, 40)); // setting label font


        JSeparator s = new JSeparator(); // creating separator
        s.setBounds(0, 80, 2000, 10); // setting separator position

        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // setting frame to full screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting frame close operation
        this.setTitle("Pharmacy Management System"); // setting frame title
        ImageIcon image = new ImageIcon("logo1.png"); // creating imageIcon object
        this.setIconImage(image.getImage()); // setting frame icon
        this.setVisible(true); // setting frame visible
        this.getContentPane().setBackground(new Color(0x8AAAE5)); // setting layout to gray
        this.add(l); // adding label to frame
        this.add(s); // adding separator to frame
        this.setLayout(null); // setting layout to null (default) layout is border layout
    }
}
