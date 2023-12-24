import javax.swing.*;

public class Sum
{
	public static void main(String []  args)
	{
		String a=JOptionPane.showInputDialog(null,"Enter First Number:");
		String b=JOptionPane.showInputDialog(null,"Enter Second Number");
		
		int n1=Integer.parseInt(a);
		int n2=Integer.parseInt(b);
		int result=0;
		result=n1+n2;
		JOptionPane.showMessageDialog(null,"The sum is:"+result);
		
	}
}
