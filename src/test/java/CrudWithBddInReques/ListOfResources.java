package CrudWithBddInReques;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class ListOfResources {
	@Test
public void userTest() {
		
		given().get("https://reqres.in/api/unknown").then().log().all().assertThat().statusCode(200);
		
	
}
}
