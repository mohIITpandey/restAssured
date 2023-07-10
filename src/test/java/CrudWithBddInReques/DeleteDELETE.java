package CrudWithBddInReques;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DeleteDELETE {
	@Test
public void deleteTest() {
		
		given().delete("https://reqres.in/api/users/2").then().log().all().assertThat().statusCode(204);
		
	
}
}
