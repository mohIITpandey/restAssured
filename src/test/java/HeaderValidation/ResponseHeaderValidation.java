package HeaderValidation;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class ResponseHeaderValidation {
@Test
public void test() {
	baseURI="http://rmgtestingserver";
	port=8084;
	String expected_statusLine = "HTTP/1.1 200 ";
	String actual_Vary="Access-Control-Request-Headers";
	String expected_contentType="application/json";
	String expected_pragma="no-cache";
	String expected_connection="keep-alive";
	
	Response res = when().get("/projects/TY_PROJ_8938");
	
	Headers header = res.getHeaders();
	System.out.println(header);
	
	String statusLine = res.statusLine();
	System.out.println(statusLine);
	Assert.assertEquals(statusLine,expected_statusLine );
	
	String actualVary = res.getHeader("Vary");
	System.out.println(actualVary);
	Assert.assertEquals(actualVary,actual_Vary );
	
	String contentType = res.getHeader("Content-type");
	Assert.assertEquals(contentType,expected_contentType );

	String pragma = res.getHeader("Pragma");
	Assert.assertEquals(pragma,expected_pragma );

	String connection = res.getHeader("Connection");
	Assert.assertEquals(connection,expected_connection );	
}
}
