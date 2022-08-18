package schema_validation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Using_JsonSchemaValidator {
	
	@Test
	
	public void validate_Using_JsonSchema() {
		File jsonBody = new File("empDetails.json");
		File schema = new File("schema.json");
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
//		.log().all()
		.body(jsonBody)
		.when()
		.post("employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(schema))
		.log().all();
		
		
		//Add below dependency for validation
		/*
		 * <dependency> 
		 * <groupId>io.rest-assured</groupId>
		 * <artifactId>json-schema-validator</artifactId>
		 *  <version>5.1.1</version>
		 * <scope>test</scope> 
		 * </dependency>
		 */
		
		
		
	}
	
	

}
