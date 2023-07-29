import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;


public class button extends JButton {
    button(int x,int y,String text,String image){
        this.setBounds(x,y, 220, 100);
        this.setBackground(new Color(0xFFFFFF));
        this.addActionListener(new Employee());
        this.setText(text);
        this.setFocusPainted(false);
        ImageIcon icon = new ImageIcon(image);
        this.setIcon(icon);
    }

}
