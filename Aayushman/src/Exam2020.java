
import javax.swing.*;
import java.awt.*;

class Exam2020 extends JFrame
{
    public Exam2020()
    {
        //setSize(300,300);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Long Named Button 4");
        JButton b5 = new JButton("5");
        setTitle("Demo");
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b5.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

         setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        // setLayout(new GridLayout(5,1,0,5));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String [] args)
    {
        new Exam2020();
    }
}