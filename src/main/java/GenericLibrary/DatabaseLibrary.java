package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseLibrary implements IConstants {

	Driver driverRef;
	Connection con=null;
	
	/**
	 * This method will establish the connection with mysql database
	 * @throws SQLException
	 */
	public void connectToDB() throws SQLException
	{ 
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		DriverManager.getConnection(dbURL,dbUserName,dbPassword);
		
	}
/**
 * This method will close the database connection
 * @throws SQLException
 */
	public void closeDB() throws SQLException
	{
		con.close();
	}
/**
 * This method will execute the query and return the value only if the validation is successful
 * @param query
 * @param columnIndex
 * @param expData
 * @return
 * @throws SQLException
 */
	public String readDataFromDBAndValidate(String query,int columnIndex,String expData) throws SQLException
	{
		boolean flag=false;
		ResultSet result = con.createStatement().executeQuery(expData);
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Data verified");
			return expData;
		}
		else
		{
			System.out.println("Data Not verified");
			return "";
		}
	}
}
