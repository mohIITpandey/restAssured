package DifferentWaysToPOST;

import java.util.HashMap;

import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Hashmap {
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
		
		given().body(map).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().log().all().assertThat().statusCode(201);
	}
}
