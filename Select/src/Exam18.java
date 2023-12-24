import java.sql.*;

public class Exam18 
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
			String q="update student set marks=70 where faculty='SE'";
			int i=stmt.executeUpdate(q);
			System.out.print("No. of records updated:"+i);
		
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




