package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponse {
	@Test
	public void test() {
		baseURI="http://rmgtestingserver";
		port=8084;
		String exp="Mohittt";
		
		Response res = when().get("/projects");
	     List<String> lis=res.jsonPath().get("createdBy");
	     boolean flag=false;
	     for(String pid:lis) {
	    	 if(pid.equalsIgnoreCase(exp)) {
	    		 flag= true;
	    	 }
	     }
	     Assert.assertTrue(flag);
	     System.out.println("---verified-----");
	   
	     res.then().log().all(); 
	}
}
