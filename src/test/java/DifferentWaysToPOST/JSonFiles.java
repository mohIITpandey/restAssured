package DifferentWaysToPOST;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class JSonFiles {
@Test 
public void files() {
	baseURI="http://rmgtestingserver";
	port=8084;
	File fis= new File("./src/test/resources/jsonfile111.json");
	
	 given().body(fis).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		.then().log().all().assertThat().statusCode(201);
}	
}
