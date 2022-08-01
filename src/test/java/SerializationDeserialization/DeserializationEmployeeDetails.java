package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;

public class DeserializationEmployeeDetails {

	@Test
	public void deserializeEmpDetailsTest() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		
		//read the value from object mapper
	EmployeeDetails e1 = obj.readValue(new File("./EmployeeDetails.json"),EmployeeDetails.class );// if v r copying the file name from that json path it will like .\\
		
	//fetch the value from class
	System.out.println(e1.getEmail());
		System.out.println(e1.geteName());
	}
}


//jsonmappingexception- if we are not creating an empty constructor we will get this exception.because already the paramterized
//constructor is utilized .it hv  so only from deserialization purpose we are creating an empty constructor