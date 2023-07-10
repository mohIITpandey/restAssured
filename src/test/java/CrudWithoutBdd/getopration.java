package CrudWithoutBdd;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getopration {
@Test
public  void allproj() {
	Response resq = RestAssured.get("http://rmgtestingserver:8084/projects");
	   resq.then().log().all();
	   int actstat = resq.getStatusCode();
	   Assert.assertEquals(200,actstat);
	
	
}
}
