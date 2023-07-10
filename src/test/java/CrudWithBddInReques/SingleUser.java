package CrudWithBddInReques;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class SingleUser {
	@Test
public void userTest() {
		
		given().get("https://reqres.in/api/users/2").then().log().all().assertThat().statusCode(200);
		
	
}
}
