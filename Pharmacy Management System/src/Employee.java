import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Employee implements ActionListener{

    static button b1;
    static button b2;
    static button b3;
    static button b4;
    static button b5;
    static button b6;

    public static void main(String[] args){                
        frame f = new frame("#8AAAE5");

        b1 = new button(200,150,"Add Medicine","medicine.png");
        f.add(b1);

        b2 = new button(200,300,"View Medicine","view.png");
        f.add(b2);

        b3 = new button(200,450,"Update Medicine","update.png");
        f.add(b3);

        b4 = new button(550,150,"Sell Medicine","sell.png");
        f.add(b4);

        b5 = new button(550,300,"View Bill","bill.png");
        f.add(b5);

        b6 = new button(550,450,"Profile","profile.png");
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