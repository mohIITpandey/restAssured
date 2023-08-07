package CrudWithBdd;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class getPRoject {

	@Test
	
	public  void allproj() {
		//step1-create the pre requistes--request body

		given().get("http://rmgtestingserver:8084/projects/TY_PROJ_7855")
		
	    //step2-Perform the actions
		
		.then().log().all().contentType(ContentType.JSON).statusCode(200);  
}	
}
