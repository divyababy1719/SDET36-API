package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;

public class SerializationEmployeeDetails {

	@Test
	public void serializationEmpDetailsTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		//Step1: Create object for pojo class and provide values
		EmployeeDetails emp=new EmployeeDetails("Divya", "TY6713", 987456, "divya@ty.com", "Kerala");
		
		//Create object of object mapper from jackson mapper
		ObjectMapper obj=new ObjectMapper();
		
		//Step3:write data into json file
		obj.writeValue(new File("./EmployeeDetails.json"), emp);
	}
	
}


//nosuitableconstructor