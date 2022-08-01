package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithArrayOfObject;

public class DeserializeEmpWithArrayOfObject {

	@Test
	public void deserializeEmpWithArrayOfObject() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		 EmployeeDetailsWithArrayOfObject data = obj.readValue(new File("./EmployeeWithObjArray.json"), EmployeeDetailsWithArrayOfObject.class);
	    System.out.println(data.getS().getCompany());
	    System.out.println(data.getName());
	}
}
