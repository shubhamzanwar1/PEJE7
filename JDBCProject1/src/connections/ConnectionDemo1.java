package connections;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo1 
{

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("DRIVER LOADED AND REGISTERED");
		
			DriverManager.getConnection("jdbc:mysql://localhost:3306/peje7", "root", "akshay");
		
			System.out.println("CONNECTION ESTABLISHED");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
