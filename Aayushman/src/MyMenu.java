import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyMenu extends JFrame implements ActionListener
{
	JMenu menu;
	JMenuItem sa,copy,cut,paste,exit;
	JMenuBar bar;
	JTextArea t;
	
	public MyMenu()
	{
		setSize(600,500);
		bar=new JMenuBar();
		setJMenuBar(bar);
		menu=new JMenu("Menu");
		bar.add(menu);
		sa=new JMenuItem("Select All");
		copy=new JMenuItem("Copy");
		cut=new JMenuItem("Cut");
		paste=new JMenuItem("Paste");
		menu.add(sa);
		menu.add(copy);
		menu.add(cut);
		menu.add(paste);
		menu.addSeparator();
		exit=new JMenuItem("Exit");
		menu.add(exit);
		t=new JTextArea();
		t.setBounds(200,100,250,200);
		add(t);
		setLayout(null);
		setVisible(true);
		sa.addActionListener(this);
		copy.addActionListener(this);
		cut.addActionListener(this);
		paste.addActionListener(this);
		exit.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==sa)
		{
			t.selectAll();
		}
		
		else if(e.getSource()==copy)
		{
			t.copy();
		}
		
		else if(e.getSource()==cut)
		{
			t.cut();
		}
		
		else if(e.getSource()==paste)
		{
			t.paste();
		}
		
		else
		{
			System.exit(0);
		}
	}
	
	public static void main(String [] args)
	{
		new MyMenu();
	}
}
