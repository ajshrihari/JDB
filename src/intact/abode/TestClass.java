package intact.abode;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestClass {
	static Connection connection = null;
	static int id;
	static String name;
	public void createTable(String tableName)
	{
		connection=DatabaseConnection.getConnection();
		try{
			Statement st_creTable=connection.createStatement();
			
		
		System.out.println("table created succesfully");
			}catch(Exception e){
				
		}finally{
			try{
				connection.close();
			
			}catch(Exception e2){
				
			}
		}
	}
	
	public static void main(String[] args){
		TestClass tc=new TestClass();
		tc.createTable("create table if not exists xyz(eid number(10),ename varchar2(20)");
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter employee id");
		id=in.nextInt();
		System.out.println("Please enter employee name");
		name=in.next();
		try{
			connection=DatabaseConnection.getConnection();
			String insertData="Insert into xyz values(?,?)";
			PreparedStatement ps =connection.prepareStatement(insertData);
			ps.setInt(1,id);
			ps.setString(2,name);
			int inserted=ps.executeUpdate();
			System.out.println("Data insert successful");
			
		}catch(Exception e){}finally{
			try{
				connection.close();
			
			}catch(Exception e3){
				
			}
		}
		
		}
		
		
		
		
		
	}
	


