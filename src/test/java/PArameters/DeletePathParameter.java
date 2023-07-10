package PArameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeletePathParameter {
	@Test
	
	public void testt() {
	baseURI="http://rmgtestingserver";
	port=8084;
	
	given().pathParam("pid","TY_PROJ_8472").contentType(ContentType.JSON)
	
	.when().delete("/projects/{pid}")
	
	.then().log().all().assertThat().statusCode(204);
	
}
}
