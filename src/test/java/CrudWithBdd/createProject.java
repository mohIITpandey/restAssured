package CrudWithBdd;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createProject {
	JavaUtility jlib=new JavaUtility();

	@Test
	public void createProj() {

		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Mohittt");
		jObj.put("projectName","kuchBhi"+jlib.getRandomNum());
		jObj.put("status","Completed");
		jObj.put("teamSize","12");
		
		//step1-create the pre requistes--request body

	     Response response = given().body(jObj).contentType(ContentType.JSON)
		 
	    //step2-Perform the actions

		 .when().post("http://rmgtestingserver:8084/addProject");
	     
	 	//step3-validate the response

		System.out.println(response.getContentType());
		System.out.println(response.asString());
	    System.out.println(response.prettyPrint());
	    System.out.println(response.prettyPeek());	
	}
}
