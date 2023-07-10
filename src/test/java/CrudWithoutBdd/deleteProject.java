package CrudWithoutBdd;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deleteProject {
	@Test
	public  void allproj() {
		Response resq = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_7813");
		   resq.then().log().all();
		   int actstat = resq.getStatusCode();
		   Assert.assertEquals(204,actstat);
		
		
	}
}
