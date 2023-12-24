import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
	 public class EventHandler implements ActionListener
	 {
	  View v;
	  
	  public EventHandler(View v)
	  {
	 	 this.v=v;
	  }
	  
	  public void actionPerformed(ActionEvent e)
	  {
	 	 Font f=new Font("Arial",Font.BOLD,20);
	 	 this.v.t.setFont(f);
	 	 this.v.t.setForeground(Color.red);
	  }
	 }

