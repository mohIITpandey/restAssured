package CrudWithBddInReques;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateCREATE {
	
	@Test
	public void create() {
		JSONObject jobj=new JSONObject();
		jobj.put("name","rocky bhai");
		jobj.put("job","TestEngg.");
		  
		given().body(jobj).contentType(ContentType.JSON).when().post("https://reqres.in/api/users").then().log().all().assertThat().statusCode(201);
	}

}
