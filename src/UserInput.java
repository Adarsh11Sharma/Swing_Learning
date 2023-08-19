import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInput {

    public static void main(String[] args) {
    RadioDemo obj=new RadioDemo();
    }
}

class RadioDemo extends JFrame  {
    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;

    public RadioDemo(){
        b=new JButton("OK");
        t1=new JTextField(15);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        l=new JLabel("Greeting");
        ButtonGroup bg=new ButtonGroup();
         bg.add(r1);
         bg.add(r2);
        add(t1);
        add(b);
        add(r1);
        add(r2);
        add(l);

        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(3);


        b.addActionListener(new ActionListener()
    {
            public void actionPerformed(ActionEvent ae){

            String name=t1.getText();
            if(r1.isSelected()){
                name= "Mr. " + name ;
            }
            else{
                name="Ms. "+name;
            }
            l.setText(name);


            }
        });



    }



}
