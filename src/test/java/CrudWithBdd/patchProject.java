package CrudWithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class patchProject {

@Test
public void test1() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","greatMohit");
	jobj.put("projectName","Mission Dablu");
	jobj.put("status","In Progress");
	jobj.put("teamSize","44");
	
	Response res = given().body(jobj).contentType(ContentType.JSON)
	
	.when().put("http://rmgtestingserver:8084/projects/TY_PROJ_7855");
	
     res.then().assertThat().statusCode(200);
	
}
	

}
