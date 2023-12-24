import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyMenu2 extends JFrame implements ActionListener,MouseListener
{
	JLabel l;
	JPopupMenu menu;
	JMenuItem one,two;
	
	public MyMenu2()
	{
		setSize(500,400);
		l=new JLabel();
		l.setBounds(150,50,200,100);
		add(l);
		menu=new JPopupMenu();
		add(menu);
		one=new JMenuItem("One");
		two=new JMenuItem("Two");
		menu.add(one);
		menu.add(two);
		setLayout(null);
		setVisible(true);
		one.addActionListener(this);
		two.addActionListener(this);
		addMouseListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mouseClicked(MouseEvent e) 
	{
		menu.show(this,e.getX(),e.getY());
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String item=e.getActionCommand();
		
		l.setText(item+" item is selected");
	}
	
	public void mouseEntered(MouseEvent e) {} 
	public void mouseExited(MouseEvent e) {} 
	public void mousePressed(MouseEvent e) {} 
	public void mouseReleased(MouseEvent e) {}
	
	public static void main(String [] args)
	{
		new MyMenu2();
	}
	
}

