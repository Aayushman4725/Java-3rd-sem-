import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyColor extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton red,pink,black;
	
	public MyColor()
	{
		setSize(500,300);
		red= new JButton("Red");
		pink=new JButton("Pink");
		black=new JButton("Black");
		add(red);
		add (pink);
		add(black);
		setLayout(new FlowLayout());
		red.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
							getContentPane().setBackground(Color.RED);
					}
				}
				);
		pink.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					
							getContentPane().setBackground(Color.PINK);
						
					}
				}
				);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		black.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
							getContentPane().setBackground(Color.BLACK);
					}
				}
				);
			}
	

	
	
	public static void main(String [] args)
	{
		new MyColor();
	}
	

}
