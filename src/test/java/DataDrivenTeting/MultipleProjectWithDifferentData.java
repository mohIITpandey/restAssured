package DataDrivenTeting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import PojoClass.CreatePojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class MultipleProjectWithDifferentData {

	
	@Test(dataProvider = "getData")
	
	public void test(String createdBy,String projectName,String status,int teamSize) {
	JavaUtility jlib=new JavaUtility();
	CreatePojo poj=new CreatePojo(createdBy, projectName+jlib.getRandomNum(), status, teamSize);
	
	baseURI="http://rmgtestingserver";
	port=8084;
	
	given().body(poj).contentType(ContentType.JSON)
	
	.when().post("/addProject")
	
	.then().log().all();
	
	}
	
	@DataProvider(name="getData")
	public Object[][] data(){
		Object [][] data=new Object[3][4];
	     data[0][0]="Mohit";
	     data[0][1]="Magnet1.0";
	     data[0][2]="Created";
	     data[0][3]=12;
	     
	     data[1][0]="Pavan";
	     data[1][1]="Magnet1.1";
	     data[1][2]="OnGoing";
	     data[1][3]=13;
	     
	     data[2][0]="Pradeep";
	     data[2][1]="Magnet1.2";
	     data[2][2]="Completed";
	     data[2][3]=14;
	     
	     return data;

	}
	
	
}
