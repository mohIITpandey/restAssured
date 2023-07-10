package PArameters;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class FoamParameter {
	
	@Test
	public void test() {
	 baseURI="http://rmgtestingserver";
		
	 given().formParam("createdBy", "mohitPandey")
	 .formParam("projectName", "tysss")
	 .formParam("status","cheated")
	 .formParam("teamSize", "12").contentType(ContentType.JSON)
	 
	 .when().post("/addProject")
	 
	 .then().time(Matchers.lessThan(3000L),TimeUnit.MILLISECONDS).log().all().assertThat().statusCode(201);
	}

}
