import java.sql.Connection;
import java.sql.DriverManager;

public class UtilityClass 
{
	
	public UtilityClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnectionObject()
	{
		Connection con=null;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
		System.out.println("Connection istablished");
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		return con;
	}

}
