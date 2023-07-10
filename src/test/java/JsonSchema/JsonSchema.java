package JsonSchema;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

public class JsonSchema {
@Test

public void test() {
	File f=new File(".\\src\\test\\resources\\jsonformatter1.json");
	when().get("https://reqres.in/api/users?page=2")
	.then().assertThat()
	.body(JsonSchemaValidator.matchesJsonSchema(f));
}
}