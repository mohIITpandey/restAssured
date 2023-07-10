package HeaderValidation;

import org.testng.annotations.Test;

import PojoClass.CreatePojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class RequestSend {
@Test
public void test() {
	baseURI="http://rmgtestingserver";
	port=8084;
	CreatePojo poj=new CreatePojo("mohitt","technicalBande", "createdBy",12);
		
	given().body(poj).contentType(ContentType.JSON)
	
	.when().post("/addProject")
	
	.then().log().all().assertThat().statusCode(201);
}
}
