package SerializationDeserialization;

import java.io.File;
import java.io.IOException;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithArrayOfObject;
import POJOforSerializationAndDeserialization.SpouseDetails;

public class serializationEmpWithArrayOfObject {

	@Test
	public void serializeEmpWithArrayOfObjectTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] id= {12345,23456};
		
		EmployeeDetailsWithArrayOfObject emp=new EmployeeDetailsWithArrayOfObject("sdg", "ds", id, new SpouseDetails("xzx", 478555555l, "tcs"));
	    ObjectMapper obj=new ObjectMapper();
	    obj.writeValue(new File("./EmployeeWithObjArray.json"), emp);
	    
	}
}
