package reqSpecBuilderReqSpecResponse;

import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import PojoClass.CreatePojo;
import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class reqSpecBuilderReqSpecResponse {
@Test
public void test() {
	JavaUtility jlib=new JavaUtility();
	CreatePojo poj= new CreatePojo("mohit","tyss"+jlib.getRandomNum(),"created", 10);
	
	 RequestSpecification reqB = new RequestSpecBuilder()
			                  .setBaseUri("http://rmgtestingserver:8084")
			                  .setContentType(ContentType.JSON).build();
	 
	 ResponseSpecification reqR = new ResponseSpecBuilder()
			                   .expectContentType(ContentType.JSON)
			                   .expectStatusCode(201).build();

	 given().spec(reqB).body(poj)
	 
	 .when().post("/addProject")
	 
	 .then().spec(reqR).log().all();                  
}
}
