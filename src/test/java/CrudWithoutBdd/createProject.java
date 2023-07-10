package CrudWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createProject {

@Test
public void createProj() {
JavaUtility jlib=new JavaUtility();
	
	
	//step1-create the pre requistes--request body
	JSONObject jObj=new JSONObject();
	jObj.put("createdBy","Mohittt");
	jObj.put("projectName","kuchBhi"+jlib.getRandomNum());
	jObj.put("status","Completed");
	jObj.put("teamSize","12");
	RequestSpecification req = RestAssured.given();
	req.body(jObj);
	req.contentType(ContentType.JSON);
	
	//step2-Perform the actions
	Response response = req.post("http://rmgtestingserver:8084/addProject");
	
	//step3-validate the response
	System.out.println(response.getContentType());
	System.out.println(response.asString());
    System.out.println(response.prettyPrint());
    System.out.println(response.prettyPeek());
}

	
}
