package CrudWithBddInReques;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getUsers {
	@Test
public void userTest() {
		
		given().get("https://reqres.in/api/users").then().log().all().assertThat().statusCode(200);
		
	
}
}
