package CrudWithBddInReques;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class ListOfSingleUser {
	@Test
public void userTest() {
		
		given().get("https://reqres.in/api/unknown/2").then().log().all().assertThat().statusCode(200);
		
	
}
}
