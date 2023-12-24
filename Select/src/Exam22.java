
import java.sql.*;

public class Exam22 
{
	public static void main(String [] args)
	{
		String url="jdbc:mysql://localhost/aayushman";
		String uname="root";
		String pwd="";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(url,uname,pwd);
			Statement stmt=cn.createStatement();
			String q1="Select count(roll) From student";
			ResultSet rs=stmt.executeQuery(q1);
			rs.next();
			System.out.println("Total Student:"+ rs.getInt(1));
			String q2="Select AVG(marks) From student";
			ResultSet rs2=stmt.executeQuery(q2);
			rs2.next();
			
			System.out.println("Average marks:"+ rs2.getFloat(1));
			
		
			cn.close();
		}
		catch(SQLException e)
		{
			System.out.print(e.getMessage());
		}
		
		catch(ClassNotFoundException e1)
		{
			System.out.print(e1.getMessage());
		}
   }
}



