package PArameters;

import static io.restassured.RestAssured.baseURI;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getQueryParameter {
	
	
	@Test
	
	public void test() {
		baseURI="https://reqres.in";
      given().queryParam("page", "2").contentType(ContentType.JSON)
      
      .when().get("api/users")
      
      .then().time(Matchers.lessThan(4000L),TimeUnit.MILLISECONDS).log().all().assertThat().statusCode(200);
		
		
		
	}

}
