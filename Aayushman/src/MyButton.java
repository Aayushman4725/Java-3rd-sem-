import javax.swing.*;
import java.awt.event.*;

public class MyButton extends JFrame implements ActionListener
{

	JTextField first,second,answer;
	JButton plus,minus;
	
	public MyButton()
	{
		setSize(500,600);
		first=new JTextField();
		first.setBounds(100,50,350,75);
		second= new JTextField();
		second.setBounds(100,150,350,75);
		answer=new JTextField();
		answer.setBounds(100,250,350,75);
		answer.setEditable(false);
		plus= new JButton("+");
		plus.setBounds(50,350,100,75);
		minus=new JButton("-");
		minus.setBounds(350,350,100,75);
		add(first);
		add(second);
		add(answer);
		add(plus);
		add(minus);
		setLayout(null);
		setVisible(true);
		plus.addActionListener(this);
		minus.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int a=Integer.parseInt(first.getText());
		int b=Integer.parseInt(second.getText());
		int result=0;
		
		if(e.getSource()==plus)
		{
			result=a+b;
			answer.setText(""+result);
		}
		
		else
		{
			result=a-b;
			answer.setText(""+result);
		}
		
	}
	
	public static void main(String [] args)
	{
		new MyButton();
	}
}
