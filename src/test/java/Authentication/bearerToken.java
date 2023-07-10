package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class bearerToken {

	
	@Test
	public void test() {
		JSONObject jObj=new JSONObject();
		jObj.put("name","Mohit44");
		jObj.put("status", "single");
		baseURI="https://api.github.com";
		
		given().auth().oauth2("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")
		.body(jObj).contentType(ContentType.JSON)
		
		.when().post("/user/repos")
		
		.then().time(Matchers.lessThan(10L),TimeUnit.SECONDS).statusCode(201).log().all();
		
		
		
		
		
		
	}
}
