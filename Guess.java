import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;

public class Guess extends JFrame implements ActionListener 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l;
	JTextField t;
	JButton b;
	int randomNum,attempts;
	
	public Guess()
	{
		setSize(400,500);
		t=new JTextField();
		t.setColumns(10);
		l=new JLabel();
		b=new JButton("Try");
		add(t);
		add(l);
		add(b);
		setLayout(new FlowLayout());
		b.addActionListener(this);
		generateRandomNum();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void generateRandomNum()
	{
		attempts=0;
		l.setText("Attempts:"+attempts);
		Random r=new Random();
		randomNum=r.nextInt(50);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		attempts++;
		l.setText("Attempts:"+attempts);
		int n=Integer.parseInt(t.getText());
		
		
		if(n==randomNum)
		{
			JOptionPane.showMessageDialog(this,"Congratulations for guessing the right number!!!");
			generateRandomNum();
		}
		
		else
		{
			if(n>randomNum)
			{
				JOptionPane.showMessageDialog(this,"Guess Lower","title",JOptionPane.ERROR_MESSAGE);
			}
			
			else
			{
				JOptionPane.showMessageDialog(this,"Guess Higher","title",JOptionPane.ERROR_MESSAGE);
			}
			
			t.setText("");
		}
		
	}
	
	public static void main(String [] args)
	{
		new Guess();
	}
}
