
import java.awt.event.*;
import javax.swing.*;

public class Check extends JFrame implements ItemListener 
{
	JLabel l;
	JCheckBox java,math;
	
	public Check()
	{
		setSize(400,300);
		l=new JLabel();
		java=new JCheckBox("Java");
		math=new JCheckBox("Math-3");
		add(l);
		add(java);
		add(math);
		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		setVisible(true);
		java.addItemListener(this);
		math.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==java)
		{
			if(e.getStateChange()==1)
			{
				l.setText("Java is Selected");
			}
			
			else
			{
				l.setText("Java is unchecked");
			}
		}
		
		else
		{
			if(e.getStateChange()==1)
			{
				l.setText("Math is checked");
			}
			
			else
			{
				l.setText("Math is unchecked");
			}
		}
	}
	
	public static void main(String [] args)
	{
		new Check();
	}
}
