package GenericUtilities;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class BaseClass {
	DataBaseUtility DbUtils=new DataBaseUtility();
	
	//RestAssured
	public RestAssuredLibrary resLib= new RestAssuredLibrary();
	public RequestSpecification reqB;
	public ResponseSpecification resB;
	@BeforeSuite
	public void connectDataBase() throws SQLException   {
		DbUtils.EstablishDataBaseConnection();
		
		reqB=new RequestSpecBuilder().setBaseUri("http://rmgtestingserver:8084")
				.setContentType(ContentType.JSON).build();
		
		resB=new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		
	}
	@AfterSuite
	public void closeDataBase() throws SQLException {
		DbUtils.closeDataBaseConnection();
	}	
}
