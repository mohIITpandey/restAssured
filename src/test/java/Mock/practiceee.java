package Mock;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class practiceee {
@Test
public void test() {
	baseURI="https://reqres.in/";

	JSONObject obj=new JSONObject();
	obj.put("name","mohitjizz");
	obj.put("job","unemployed");

	Response res = given().body(obj).contentType(ContentType.JSON)
	.when().post("/api/users");
	String name = res.jsonPath().get("id");
    int iddd=Integer.parseInt(name);
  
	res.then().log().all().assertThat().statusCode(201);
	  System.out.println(iddd+"------");
	given().pathParam("idd",2 ).contentType(ContentType.JSON)
	.when().get("/api/users/{idd}")
	.then().log().all().assertThat().statusCode(200);
	
	
	
	
}

}
