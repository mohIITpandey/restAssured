package CrudWithBdd;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class getPRoject {

	@Test
	
	public  void allproj() {
		given().get("http://rmgtestingserver:8084/projects/TY_PROJ_7855").then().log().all().contentType(ContentType.JSON).statusCode(200);
		  
//		  rest.then().assertThat().statusCode(200);
	}
	
	
}
