package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithArray;

public class SerializationEmployeeDetailsWithArray {

	@Test
	public void serializeEmployeeDetailsWithArray() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] id= {12345,23456};
		String[] mail= {"divya@gmail.com","divya@tyss.com"};
		EmployeeDetailsWithArray emp=new EmployeeDetailsWithArray("Divya", "TY101", id, mail, "IDUKKI");
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./EmployeeDetailsWithArray.json"), emp);
	}
}
