import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Radio extends JFrame implements ActionListener 
{
	JRadioButton bold,italic;
	JTextField t;
	public Radio()
	{
		setSize(300,300);
		bold=new JRadioButton("Bold");
		italic=new JRadioButton("Italic");
		add(bold);
		add(italic);
		ButtonGroup g=new ButtonGroup();
		g.add(bold);
		g.add(italic);
		t=new JTextField();
		add(t);
		t.setColumns(10);
		setLayout(new FlowLayout());
		setVisible(true);
		bold.addActionListener(this);
		italic.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(bold.isSelected())
		{
			Font f=new Font("Arial",Font.BOLD,20);
			t.setFont(f);
		}
		
		if(italic.isSelected())
		{
			Font f= new Font("Arial",Font.ITALIC,20);
			t.setFont(f);
		}	
	}
	
	public static void main(String [] args)
	{
		new Radio();
	}
}
