package PArameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import io.restassured.http.ContentType;

public class putPAthPArameter {
@Test

public void test() {
	baseURI="http://rmgtestingserver";
	port=8084;
    JavaUtility jlib =new JavaUtility();
    int Project=jlib.getRandomNum();
	HashMap<String, String> map= new HashMap<String, String>();
	map.put("createdBy","mahi");
	map.put("projectName","Tysss"+Project);
	map.put("status","created");
	map.put("teamSize","12");
	System.out.println(map);
	
	given().body(map).pathParam("pid", "TY_PROJ_8472").contentType(ContentType.JSON)
	
	
	.when().put("/projects/{pid}")
	
	.then().log().all().assertThat().statusCode(200);

}
}

