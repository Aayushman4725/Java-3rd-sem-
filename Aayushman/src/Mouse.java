import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse extends JFrame implements MouseListener,MouseMotionListener 
{
	JTextField t1,t2;
	
	public Mouse()
	{
		setSize(400,500);
		t1=new JTextField();
		t2=new JTextField();
		t1.setColumns(10);
		t2.setColumns(10);
		add(t1);
		add(t2);
		setLayout(new FlowLayout());
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void mouseEntered(MouseEvent e)
	{
		t1.setText("In");
	}
	
	public void mouseExited(MouseEvent e)
	{
		t1.setText("Out");
	}
	
	public void mouseMoved(MouseEvent e)
	{
		String loc="X:"+e.getX()+"Y:"+e.getY();
		t2.setText(loc);
	}
	
	public void mouseClicked(MouseEvent e) {}
	
	public void mousePressed(MouseEvent e) {}
	
	public void mouseReleased(MouseEvent e) {}
	
	public void mouseDragged(MouseEvent e) {}
	
	public static void main(String [] args)
	{
		new Mouse();
	}
	
	

}
