package DifferentWaysToPOST;

import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import PojoClass.CreatePojo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;



public class PostWithPojo {
	@Test
	public void postPojo() {
		baseURI="http://rmgtestingserver";
		port=8084;
	JavaUtility jlib =new JavaUtility();
	int Project=jlib.getRandomNum();
	
	CreatePojo poj= new CreatePojo("mohit", "tysss"+Project, "Createdd", 12);
	
	 given().body(poj).contentType(ContentType.JSON)
	
	.when().post("/addProject").then().log().all().assertThat().statusCode(201);
	
	
	
	
	}

}
