import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

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
        b1 = new button(200,150,"Add Medicine");
        ImageIcon image1 = new ImageIcon("medicine.png");
        b1.setIcon(image1);
        f.add(b1);

        b2 = new button(200,300,"View Medicine");
        ImageIcon image2 = new ImageIcon("view.png");
        b2.setIcon(image2);
        f.add(b2);

        b3 = new button(200,450,"Update Medicine");
        ImageIcon image3 = new ImageIcon("update.png");
        b3.setIcon(image3);
        f.add(b3);

        b4 = new button(850,150,"Sell Medicine");
        // ImageIcon image = new ImageIcon("logo1.png");
        // b1.setIcon(image);
        f.add(b4);

        b5 = new button(850,300,"View Bill");
        // ImageIcon image = new ImageIcon("logo1.png");
        // b1.setIcon(image);
        f.add(b5);

        b6 = new button(850,450,"Profile");
        // ImageIcon image = new ImageIcon("logo1.png");
        // b1.setIcon(image);
        f.add(b6);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            System.out.println("Hello");
        }
        if(e.getSource()==b2){
            System.out.println("Hello1");
        }
        if(e.getSource()==b3){
            System.out.println("Hello2");
        }
        if(e.getSource()==b4){
            System.out.println("Hello3");
        }
        if(e.getSource()==b5){
            System.out.println("Hello4");
        }
        if(e.getSource()==b6){
            System.out.println("Hello5");
        }
        
    }
}