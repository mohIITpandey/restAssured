package CrudWithBdd;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class putProject {
	@Test
	public void putRequest() {
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","mohKiMaya");
		jobj.put("teamSize", "1");
		
		
		Response res = given().body(jobj).contentType(ContentType.JSON)
		
		.when().put("http://rmgtestingserver:8084/projects/TY_PROJ_7855");
		
		 System.out.println(res.prettyPeek());
		
		 
		 res.then().assertThat().statusCode(200);
	}
	
}
