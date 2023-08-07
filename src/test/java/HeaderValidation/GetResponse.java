package HeaderValidation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetResponse {
@Test
public void test() {
	baseURI="http://rmgtestingserver";
	port=8084;
	when().get("projects/TY_PROJ_8938")
	
	.then().log().all().assertThat().statusCode(200);
}
}
