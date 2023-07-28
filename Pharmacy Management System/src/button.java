import javax.swing.JButton;
import java.awt.Color;

public class button extends JButton {
    button(int x,int y,String text){
        this.setBounds(x,y, 220, 100);
        this.setBackground(new Color(0xFFFFFF));
        this.addActionListener(new Employee());
        this.setText(text);
        this.setFocusPainted(false);
    }

}
