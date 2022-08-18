package schema_validation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;


public class Using_HamcrestMatcher {
	
	@Test
	private void validate() throws IOException {

		File input = new File("empDetails.json");
		File schema = new File("schema.json");
		String inputAsString = FileUtils.readFileToString(input,"UTF-8");
		
		//Add below  dependency for converting the file to string
		/*
		 * <!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
		 * <dependency> <groupId>commons-io</groupId>
		 * <artifactId>commons-io</artifactId> 
		 * <version>2.11.0</version> 
		 * </dependency>
		 */
		
		
		
		//Add below dependency for validation
		/*
		 * <!-- https://mvnrepository.com/artifact/org.hamcrest/hamcrest -->
		 * <dependency> 
		 * <groupId>org.hamcrest</groupId>
		 * <artifactId>hamcrest</artifactId> 
		 * <version>2.2</version> 
		 * <scope>test</scope>
		 * </dependency>
		 */
		
		MatcherAssert.assertThat(inputAsString, JsonSchemaValidator.matchesJsonSchema(schema));

	}

}
