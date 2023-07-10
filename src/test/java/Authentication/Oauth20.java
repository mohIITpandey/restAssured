package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth20 {

	@Test
	public void oauth2() {
		//create a request to generate a token
		Response res = given().formParam("client_id", "Magnet")
		.formParam("client_secret","acc126a6c50fb1134b4864d7949435f9" )
	    .formParam("grant_type", "client_credentials")
	    .formParam("redirect_uri","http://magnetattract.com" )
	    .formParam("code","authorization_code")
	    .when()
	    .post("http://coop.apps.symfonycasts.com/token");
		
		//capture the access token from the response of the above request
		String token = res.jsonPath().get("access_token");
		System.out.println(token);
		res.then().log().all();
		
		//create another request and use the token to access the api
		given().auth().oauth2(token)
		.pathParam("USER_ID",4578)
		
		.when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
		.then().log().all();
		
		
	}
}
