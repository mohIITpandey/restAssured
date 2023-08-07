package CrudWithBdd;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class deleteProject {

	@Test
	
	public  void allproj() {
		given().delete("http://rmgtestingserver:8084/projects/TY_PROJ_7855").then().log().all().contentType(ContentType.JSON).statusCode(204);  
//		  rest.then().assertThat().statusCode(200);
	}
}
