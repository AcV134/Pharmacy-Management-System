import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


public class Employee implements ActionListener{

    static button b1;
    static button b2;
    static button b3;
    static button b4;
    static button b5;
    static button b6;


    public static void main(String[] args){                
        frame f = new frame();
        b1 = new button(200,100);
        b1.addActionListener(new Employee());
        b1.setBackground(new Color(0xFFFFFF));
        // ImageIcon image = new ImageIcon("logo1.png");
        // b1.setIcon(image);
        b1.setText("Add Medcine");
        f.add(b1);

        b2 = new button(200,250);
        b2.addActionListener(new Employee());
        b2.setBackground(new Color(0xFFFFFF));
        // ImageIcon image = new ImageIcon("logo1.png");
        // b1.setIcon(image);
        b2.setText("Add Medcine");
        // f.add(b2);

        b3 = new button(200,400);
        b3.addActionListener(new Employee());
        b3.setBackground(new Color(0xFFFFFF));
        // ImageIcon image = new ImageIcon("logo1.png");
        // b1.setIcon(image);
        b3.setText("Add Medcine");
        // f.add(b3);

        b4 = new button(850,100);
        b4.addActionListener(new Employee());
        b4.setBackground(new Color(0xFFFFFF));
        // ImageIcon image = new ImageIcon("logo1.png");
        // b1.setIcon(image);
        b4.setText("Add Medcine");
        // f.add(b4);

        b5 = new button(850,250);
        b5.addActionListener(new Employee());
        b5.setBackground(new Color(0xFFFFFF));
        // ImageIcon image = new ImageIcon("logo1.png");
        // b1.setIcon(image);
        b5.setText("Add Medcine");
        // f.add(b5);

        b6 = new button(850,400);
        b6.addActionListener(new Employee());
        b6.setBackground(new Color(0xFFFFFF));
        // ImageIcon image = new ImageIcon("logo1.png");
        // b1.setIcon(image);
        b6.setText("Add Medcine");
        // f.add(b6);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==b1){
            System.out.println("Hello");
        }
        
    }
}