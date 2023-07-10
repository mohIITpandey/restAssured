package GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	 Connection connection;
	Driver driver;
	public void EstablishDataBaseConnection() throws SQLException {
		 driver = new Driver();
     	DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection(IConstants.dbUrl, IConstants.dbUserName,IConstants.dbPassword);
	}
	
	
	public void query(String name) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet res = statement.executeQuery("select * from project;");
		while(res.next()) {
			if(name.equalsIgnoreCase(res.getNString(1))) {
			for(int i=1;i<=6;i++) {
				System.out.print(res.getString(i)+" ");
			}
		}
	}}
	
	
	public void closeDataBaseConnection() throws SQLException {
		connection.close();
	}
	/**
	 * This method is used to validate the data into dataBase
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException
	 */
	public String readDataFromDBAndValidate(String query,int columnIndex,String expData) throws SQLException {
		boolean flag=false;
		ResultSet result=connection.createStatement().executeQuery(query);
		while(result.next()) {
			if(result.getString(columnIndex).equalsIgnoreCase(expData)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("verified");
			return expData;
		}else {
			System.out.println("Data not verified");
			return "";
		}
	}
	

}
