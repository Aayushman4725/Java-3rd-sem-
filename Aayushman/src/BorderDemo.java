import javax.swing.*;
import java.awt.*;

public class BorderDemo extends JFrame
{
	public BorderDemo()
	{
	setSize(400,400);
	JButton n=new JButton("North");
	JButton s=new JButton("South");
	JButton e=new JButton("East");
	JButton w=new JButton("West");
	JButton c=new JButton("Center");
	add(n,BorderLayout.NORTH);
	add(s,BorderLayout.SOUTH);
	add(e,BorderLayout.EAST);
	add(w,BorderLayout.WEST);
	add(c,BorderLayout.CENTER);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String [] args)
	{
		new BorderDemo();
	}
}
