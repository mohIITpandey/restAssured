package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class getRepoFromBearerToken {
@Test
public void test() {
	baseURI="https://api.github.com";
	
	given().auth().oauth2("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")
	
	.when().get("/repos/mohIITpandey/Mohit44")
	
	.then().log().all();
}
}
