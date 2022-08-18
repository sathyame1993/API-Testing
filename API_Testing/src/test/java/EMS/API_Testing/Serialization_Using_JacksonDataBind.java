package EMS.API_Testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Serialization_Using_JacksonDataBind {

	@Test
	public void create_a_Json_Body() {
		Map<String, Object> jsonBody = new HashMap<String, Object>();
		jsonBody.put("Hero", "Jai");
		jsonBody.put("friend", "Sasikumar");
		jsonBody.put("Comedian", "KanjaKarupu");

		List<String> list = new ArrayList<String>();
		list.add("Comedy");
		list.add("love");
		list.add("action");
		list.add("crime");
		list.add("friendship");

		jsonBody.put("story", list);
				
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.log()
		.all()
		.body(jsonBody)
		.when()
		.post("employees")
		.then()
		.log()
		.all();
		
		//Add below dependency for converting the map output into json output
		
		/*
		 * <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-
		 * databind --> <dependency> 
		 * <groupId>com.fasterxml.jackson.core</groupId>
		 * <artifactId>jackson-databind</artifactId> 
		 * <version>2.13.3</version>
		 * </dependency>
		 */


	}
}
