import javax.swing.*;
import java.awt.event.*;


public class MyExit extends WindowAdapter 
{
	JFrame f;
	
	public MyExit()
	{
		f=new JFrame();
		f.setSize(500,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.addWindowListener(this);
	}
	
	public void windowClosing(WindowEvent e)
	{
		int choice=JOptionPane.showConfirmDialog(null,"Do you want to exit?");
		
		if(choice==JOptionPane.YES_OPTION)
		{
			//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.dispose();
		}
	}
	
	public static void main(String [] args)
	{
		new MyExit();
	}
}
