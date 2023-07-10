package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.LinkedHashSet;

public class staticResponse {
	@Test
	public void test() {
		baseURI="http://rmgtestingserver";
		port=8084;
		String exp="TY_PROJ_6334";
		
		Response res = when().get("projects");
		
		Object act = res.jsonPath().get("[0].projectId");
		System.out.println(act);
		Assert.assertEquals(exp, act);
		System.out.println("---------verified-------");
		
		res.then().log().all();
	
	
//	@Test
//	public void test() {
//		baseURI="http://rmgtestingserver";
//		port=8084;
//		
//		Response res = when().get("projects");
//		 Object act = res.jsonPath().get("createdBy");
//
//System.out.println(act);
     
	   // String[]a=(String[])act;
	//	System.out.println(a);
		
//LinkedHashSet<Object> set=new LinkedHashSet<Object>();
//
////for(Object obj:) {
////	set.add(act);
////}
//System.out.println(set);
	}
}
