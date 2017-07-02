package intact.abode;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	static String driName="org.h2.Driver";
	static String urlName="jdbc:h2:~/test";
	static String userName="sa";
	static String password="1234";
	static Connection connection=null;
	
	public static Connection getConnection()
	{
		try{
			Class.forName(driName);
			connection=DriverManager.getConnection(urlName,userName,password);
			System.out.println("Connection successful");
			
		}catch(Exception e){
			
		}
		return connection;
	}

	
	
	

}
