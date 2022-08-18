package EMS.API_Testing;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Data_From_File {

	
	@Test
	public void create_an_Employee_From_Data_File() {
		File jsonFile = new File("empDetails.json");

		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(jsonFile)
		.when()
		.post("/employees")
		.prettyPrint();
	}

}
