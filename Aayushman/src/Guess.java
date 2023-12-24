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
	JButton b,reset;
	int randomNum,attempts;
	
	public Guess()
	{
		setSize(400,500);
		t=new JTextField();
		//t.setBounds(80,200,200,30);
		t.setColumns(10);
		l=new JLabel();
		reset=new JButton("Reset");
		b=new JButton("Try");
		//b.setBounds(280,200,45,30);
		add(t);
		add(l);
		add(b);
		add(reset);
		setLayout(new GridBagLayout());
		b.addActionListener(this);
		reset.addActionListener(this);
		generateRandomNum();
		setVisible(true);
		getContentPane().setBackground(Color.cyan);
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
		if(e.getSource()==b)
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
					getContentPane().setBackground(Color.red);
				}
				
				else
				{
					JOptionPane.showMessageDialog(this,"Guess Higher","title",JOptionPane.ERROR_MESSAGE);
					getContentPane().setBackground(Color.red);
				}
				
				
			}
			t.setText("");
			
		}
		
		else
		{
			attempts=0;
			l.setText("Attempts:"+attempts);
			generateRandomNum();
			t.setText("");
			getContentPane().setBackground(Color.cyan);
			
		}
	}
	
	public static void main(String [] args)
	{
		new Guess();
	}
}
