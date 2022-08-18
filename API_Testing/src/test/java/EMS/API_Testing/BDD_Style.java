package EMS.API_Testing;

import org.testng.annotations.Test;

import  io.restassured.RestAssured;

public class BDD_Style {
	@Test(enabled =false)
	public void get_All_Employees() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/employees")
		.prettyPrint();
	}
	@Test(enabled =false)
	public void create_an_Employee() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"first_name\": \"Raju\",\r\n"
				+ "    \"last_name\": \"bhai\",\r\n"
				+ "    \"email\": \"raju@bhai.com\"\r\n"
				+ "  }")
		.when()
		.post("/employees")
		.prettyPrint();
	}
	@Test(enabled =false)
	public void update_an_Employee() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"first_name\": \"Rajuparaman\",\r\n"
				+ "    \"last_name\": \"bhaialagar\",\r\n"
				+ "    \"email\": \"raju@alagarbhai.com\"\r\n"
				+ "  }")
		.when()
		.put("/employees/94")
		.prettyPrint();
	}
	@Test
	public void delete_an_Employee() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.when()
		.delete("/employees/94")
		.prettyPrint();
	}
}
