import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b;
	JTextField t;
	
	public View()
	{
		setSize(600,400);
		t=new JTextField();
		b=new JButton("Click");
		add(t);
		add(b);
		t.setColumns(10);
		setLayout(new FlowLayout());
		setVisible(true);
		EventHandler ev=new EventHandler(this);
		b.addActionListener( ev);
	}
	
	public static void main(String [] args)
	{
		new View();
	}
}


