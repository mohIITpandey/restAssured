package DifferentWaysToPOST;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class JSonObject {

	@Test
	public void createProj() {
	JSONObject jObj=new JSONObject();
	JSONObject jObj2 = jObj;
	jObj2.put("createdBy","Mohittt");
	jObj2.put("projectName","kuchBhilelo");
	jObj2.put("status","Completed");
	jObj2.put("teamSize","12");
	
	//step1-create the pre requistes--request body

	Response response = given().body(jObj2).contentType(ContentType.JSON)
	 
    //step2-Perform the actions

	 .when().post("http://rmgtestingserver:8084/addProject");
     
 	//step3-validate the response

	System.out.println(response.getContentType());
	System.out.println(response.asString());
    System.out.println(response.prettyPrint());
	}
}
