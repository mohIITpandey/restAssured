package CrudWithBddInReques;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class PatchUpdate {
	@Test
	public void create() {
		JSONObject jobj=new JSONObject();
		jobj.put("name","bade wale rocky bhai");
		jobj.put("job","Team Lead");
		  
		given().body(jobj).contentType(ContentType.JSON).when().patch("https://reqres.in/api/users/2").then().log().all().assertThat().statusCode(200);
	}
}
