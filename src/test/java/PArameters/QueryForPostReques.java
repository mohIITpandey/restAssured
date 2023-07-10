package PArameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class QueryForPostReques {
@Test

public void test() {
 
	baseURI="https://reqres.in";
	HashMap<String, String> map= new HashMap<String, String>();
	map.put("name","mahi");
	map.put("job","Tysss");
	
	given().body(map).contentType(ContentType.JSON)
	
	.when().post("/api/users")
	
	.then().log().all().assertThat().statusCode(201);
}
}
