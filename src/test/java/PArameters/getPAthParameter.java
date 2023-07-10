package PArameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getPAthParameter {

	@Test
	
	public void testt() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().pathParam("pid","TY_PROJ_8472").contentType(ContentType.JSON)
		
		.when().get("/projects/{pid}")
		
		.then().log().all().assertThat().statusCode(200);
		
	}
	
	
}
