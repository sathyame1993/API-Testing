package EMS.API_Testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Non_BDD_Style {
	@Test(enabled = false)
	public void getallEmployees() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification given = RestAssured.given();
		Response response = given.request(Method.GET,"employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	@Test(enabled =false )
	public void create_an_Employee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification body = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"first_name\": \"saran\",\r\n"
						+ "    \"last_name\": \"sathiya\",\r\n"
						+ "    \"email\": \"saranraj@gmail.com\"\r\n"
						+ "  }");
		Response response = body.request(Method.POST,"employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());

	}

	@Test(enabled =false )
	public void update_an_Employee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification body= RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"first_name\": \"Magizhini\",\r\n"
						+ "    \"last_name\": \"Saran\",\r\n"
						+ "    \"email\": \"saranraj@gmail.com\"\r\n"
						+ "  }");

		Response response = body.request(Method.PUT, "employees/19");
		response.prettyPrint();

	}
	@Test
	public void delete_an_Emplyee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification given = RestAssured.given();
		Response response = given.request(Method.DELETE,"employees/14");

		System.out.println(response.asPrettyString());
	}










}