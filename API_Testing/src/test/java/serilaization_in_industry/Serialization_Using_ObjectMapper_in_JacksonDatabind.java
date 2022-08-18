package serilaization_in_industry;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization_Using_ObjectMapper_in_JacksonDatabind {
	@Test
	public void converting_Ui_Data_Into_Json() throws JsonProcessingException {
		Business_Logic_Layer_Using_POJO uiData = new Business_Logic_Layer_Using_POJO();
		uiData.setFirstname("sathiya");
		uiData.setLastname("smart");
		uiData.setCompanyname("A M Components");
		uiData.setDesignation("Quality");
		uiData.setSkills(Arrays.asList("PPAP","NPD","QMS Documentation","ERP"));
		
		
		System.out.println(uiData.getFirstname());
		System.out.println(uiData.getLastname());
		System.out.println(uiData.getCompanyname());
		System.out.println(uiData.getDesignation());
		System.out.println(uiData.getSkills());
		
		ObjectMapper mapper = new ObjectMapper();   //import com.fasterxml.jackson.databind.ObjectMapper;
		String jsonBody = mapper
		.writerWithDefaultPrettyPrinter()			// for print neatly
		.writeValueAsString(uiData);
		
		
		System.out.println(jsonBody);
	
	}

}
