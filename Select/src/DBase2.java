import java.sql.*;
import java.util.*;

public class DBase2
{
	Connection cn=null;
	Statement stmt=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	static Scanner scan=new Scanner(System.in);
	
	public DBase2()throws ClassNotFoundException,SQLException
	{
		String url="jdbc:mysql://localhost:3306/aayushman";
		String uname="root";
		String pwd="";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection(url,uname,pwd);
		if(cn!=null)
		{
			System.out.println("Database connected");
			showMenu();
		}
	}
	
	public void showMenu()
	{
		System.out.println("*******Menu********");
		System.out.println("1.Insert data \n 2.Show all records \n 3.Search By name \n 4.Delete by roll \n 5.Close");
	}
	
	public void showAllRecords()throws SQLException
	{
		stmt=cn.createStatement();
		rs=stmt.executeQuery("Select * from student");
		while(rs.next())
		{
			System.out.println("\nName:"+rs.getString(2)+"\nRoll:"+rs.getInt(1)+"\nFaculty:"+rs.getString(3)+"\nMarks:"+rs.getInt(4));
		}
	}
	
	public void searchByName() throws SQLException
	{
		
		System.out.println("Enter name:");
		String name=scan.next();
		ps=cn.prepareStatement("Select * from student where name=?");
		ps.setString(1,name);
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println("\nName:"+rs.getString(2)+"\nRoll:"+rs.getInt(1)+"\nFaculty:"+rs.getString(3)+"\nMarks:"+rs.getInt(4));
		}
	}
	
	public void deleteByRoll()throws SQLException
	{
		System.out.println("Enter roll to delete:");
		int roll=scan.nextInt();
		ps=cn.prepareStatement("Delete from student where roll=?");
		ps.setInt(1, roll);
		
		int i=ps.executeUpdate();
		System.out.println("Number of records deleted:"+i);
	}
	
	public void insertData()throws SQLException
	{
		
		ps=cn.prepareStatement("Insert into student values(?,?,?,?)");
		int count=0;
		while(true)
		{
			System.out.println("Enter name:");
			String name=scan.next();
			System.out.println("Enter id:");
			int id=scan.nextInt();
			System.out.println("Enter Faculty:");
			String faculty=scan.next();
			System.out.println("Enter marks:");
			int marks=scan.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3,faculty);
			ps.setInt(4, marks);
			
			int i=ps.executeUpdate();
			count=count+i;
			
			System.out.println("Press N to exit:");
			String prompt=scan.next();
			
			if(prompt.equalsIgnoreCase("n"))
			{
				break;
			}
			System.out.println("No of records inserted:"+count);
		}
		
	}
	
	public void close()throws SQLException
	{
		cn.close();
		System.out.println("Connection Closed!!!");
		System.exit(0);
	}
	
	public static void main(String [] args)throws ClassNotFoundException,SQLException
	{
		DBase2 db=new DBase2();
		
		while(true)
		{
			System.out.println("Enter choice:");
			int choice= scan.nextInt();
			
			switch(choice)
			{
			case 1:
				db.insertData();
				break;
				
			case 2:
				db.showAllRecords();
				break;
			
			case 3:
				db.searchByName();
				break;
				
			case 4:
				db.deleteByRoll();
				break;
			
			case 5:
				db.close();
				
				break;
				
			default:
				db.showMenu();
				
				
			}
		}
	}
}
