import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc1 {

    public static void main(String[] args) {
        AddSub obj=new AddSub();
    }
}

class AddSub1 extends JFrame  {
    JTextField t1,t2;
    JButton b1,b2;
    JLabel l;

    public AddSub1(){
        t1=new JTextField(15);
        t2=new JTextField(15);
        b1=new JButton("ADD");
        b2=new  JButton("SUB");
        l=new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);

        b1.addActionListener(ae -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int value = num1 + num2;

            l.setText(value + "");
        });

        b2.addActionListener(ae -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int value = num1 - num2;

            l.setText(value + "");
        });




        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(3);

    }

}


