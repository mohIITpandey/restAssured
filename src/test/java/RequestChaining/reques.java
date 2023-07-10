package RequestChaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoClass.CreatePojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class reques {
	
	@Test
	public void test() {

		baseURI="https://reqres.in/";
		
//		JSONObject jobj=new JSONObject();
//		jobj.put("name","mohit321");
//		jobj.put("job","TestEngg.");
//		  
//		Response res = given().body(jobj).contentType(ContentType.JSON)
//		.when().post("https://reqres.in/api/users");
//		res.then().log().all().assertThat().statusCode(201);
//		Object idd = res.jsonPath().get("id");
//		System.out.println(idd);
//		
//		when().get("").then().log().all();
    
		Response res = when().get("/api/users?page=2");
		res.then().log().all().assertThat().statusCode(200);
		
		int idd = res.jsonPath().get("data[0].id");
		System.out.println(idd);
		
		when().get("/api/users/"+idd)
		.then().log().all().assertThat().statusCode(200);
		
		
		
		
		
		  
	
		
		

	}

}
