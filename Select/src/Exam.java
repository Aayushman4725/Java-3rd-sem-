

import java.sql.*;

public class Exam 
{
	public static void main(String [] args)throws ClassNotFoundException,SQLException
	{
		String url="jdbc:mysql://localhost/aayushman";
		String uname="root";
		String pwd="";
//		try
//		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(url,uname,pwd);
			Statement stmt=cn.createStatement();
			String q="Select * From student where faculty='IT'";
			ResultSet rs=stmt.executeQuery(q);
			while(rs.next())
			{
			   System.out.println("Name:"+ rs.getString(2)+"\nRoll:"+rs.getInt(1)+"\nFaculty:"+rs.getString(3)+"\nmarks:"+rs.getInt(4));	
			}
		
			cn.close();
		}
//		catch(SQLException e)
//		{
//			System.out.print(e.getMessage());
//		}
//		
//		catch(ClassNotFoundException e1)
//		{
//			System.out.print(e1.getMessage());
//		}
//   }
}



