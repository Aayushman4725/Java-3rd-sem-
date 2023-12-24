import java.sql.*;

public class RSMDSM
{
	public static void main(String [] args)throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/aayushman","root","");
		Statement stmt=cn.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from student");
		ResultSetMetaData meta=rs.getMetaData();
		
		System.out.println("Table name="+meta.getTableName(1));
		System.out.println("No. of columns="+meta.getColumnCount());
		System.out.println("Name of column="+meta.getColumnName(2));
		System.out.println("Type of column="+meta.getColumnTypeName(1));
		
		DatabaseMetaData meta2=cn.getMetaData();
		System.out.println("Username="+meta2.getUserName());
		System.out.println("Driver name="+meta2.getDriverName());
		System.out.println("Driver version="+meta2.getDriverVersion());
		System.out.println("Database name="+meta2.getDatabaseProductName());
		System.out.println("Database version="+meta2.getDatabaseProductVersion());
		
		cn.close();
	}
}
