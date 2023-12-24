import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Card extends JFrame implements ActionListener
{
	JButton a,b,c;
	Container cn;
	CardLayout crd;
	
	public Card()
	{
		setSize(400,300);
		setTitle("CardDemo");
		cn=getContentPane();
		crd=new CardLayout();
		a=new JButton("A");
		b=new JButton("B");
		c=new JButton("C");
		cn.add(a);
		cn.add(b);
		cn.add(c);
		cn.setLayout(crd);
		setVisible(true);
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		crd.previous(cn);
	}
	
	public static void main(String [] args)
	{
		new Card();
	}
}
