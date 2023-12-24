import javax.swing.*;
import java.awt.*;

class Pokhara extends JFrame
{
    JButton com,soft,elec,pok,pou;

    public Pokhara()
    {
        setSize(500,300);
        setTitle("Pokhara University");
        com=new JButton("Computer");
        soft=new JButton("Software");
        elec=new JButton("Electronics");
        pok=new JButton("Pokhara University");
        pou=new JButton("PoU");
        com.setBounds(0,0,166,27);
        soft.setBounds(166,0,166,27);
        elec.setBounds(332,0,168,27);
        pok.setBounds(0,27,500,190);
        pou.setBounds(166,236,332,27);
        add(com);
        add(soft);
        add(elec);
        add(pok);
        add(pou);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Pokhara();
    }
}