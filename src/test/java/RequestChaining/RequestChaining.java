package RequestChaining;

import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import PojoClass.CreatePojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class RequestChaining {
@Test
public void test() {
	JavaUtility jlib=new JavaUtility();
	CreatePojo poj=new CreatePojo("mohit","Che"+jlib.getRandomNum(),"Created",12);
	
	baseURI="http://rmgtestingserver";
	port=8084;
	
	 Response res = given().body(poj).contentType(ContentType.JSON)
	 
	 .when().post("/addProject");
	 res.then().log().all();
	 
	 
	String pid = res.jsonPath().get("projectId");
	System.out.println(pid);
	
	
	//when().get("/projects/"+pid).then().log().all();
	
	given().pathParam("proId", pid)
	
	.when().get("/projects/{proId}")
	
	.then().log().all();
	
}
}
