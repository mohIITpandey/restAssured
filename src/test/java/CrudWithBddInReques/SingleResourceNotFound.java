package CrudWithBddInReques;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class SingleResourceNotFound {
	@Test
public void userTest() {
		
		given().get("https://reqres.in/api/unknown/23").then().log().all().assertThat().statusCode(404);
		
	
}
}
