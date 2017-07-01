package intact.abode;
import java.sql.Connection;
import java.sql.Statement;
public class TestClass {
	static Connection connection = null;
	public void createTable(String tableName)
	{
		connection=DatabaseConnection.getConnection();
		try{
			Statement st_creTable=connection.createStatement();
			
		
		System.out.println("table created succesfully");
			}catch(Exception e){
			
		}
	}
	
	public static void main(String[] args){
		TestClass tc=new TestClass();
		tc.createTable("create table if not exists xyz(eid number(10),ename varchar2(20)");
		
		
		
		
		
	}
	

}
