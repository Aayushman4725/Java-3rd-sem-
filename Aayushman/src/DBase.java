import java.sql.*;

public class DBase 
{
	public static void main(String [] args)
	{
		String url="jdbc:mysql:\\localhost:3306/aayushman";
		String uname="root";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(url,uname,"");
			Statement stmt=cn.createStatement();
			String q="Select * From student";
			ResultSet rs=stmt.executeQuery(q);
			
			while(rs.next())
			{
				System.out.print("Name:"+ rs.getString(2)+"\tRoll:"+rs.getInt(1)+"\tFaculty:"+rs.getString(3)+"\tmarks:"+rs.getInt(4));
			}
			
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


