package CrudWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class patchProject {
	@Test
	public  void allproj() {
		JSONObject jObj=new JSONObject();
		jObj.put("status","Completeddd");
		jObj.put("teamSize","12");		
		RequestSpecification req = RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		Response response = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_7818");
		//step3-validate the response
		System.out.println(response.getContentType());
		System.out.println(response.asString());
	    System.out.println(response.prettyPrint());
	    System.out.println(response.prettyPeek());
		

		   int actstat = response.getStatusCode();
		   Assert.assertEquals(200,actstat);
		
	}}
