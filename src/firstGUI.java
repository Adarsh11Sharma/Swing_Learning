import javax.swing.*;
import java.awt.*;

public class firstGUI {
    public static void main(String[] args) {

        Abc obj=new Abc ();
        obj.setVisible(true);
        obj.setSize(400,400);
    }

}

class Abc extends  JFrame{
   public Abc(){
       setLayout(new FlowLayout());
       JLabel l=new JLabel("hello world");
       JLabel l1=new JLabel("Welcome Navin");
       add(l);
       add(l1);
       setLayout(new FlowLayout());
       setVisible(true);
       setSize(400,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
