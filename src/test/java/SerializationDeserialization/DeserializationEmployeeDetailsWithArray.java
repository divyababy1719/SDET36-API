package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithArray;

public class DeserializationEmployeeDetailsWithArray {
@Test
public void deserializeEmpDetailsWithrray() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper obj=new ObjectMapper();
	EmployeeDetailsWithArray e1 = obj.readValue(new File("./EmployeeDetailsWithArray.json"), EmployeeDetailsWithArray.class);
System.out.println(e1.getEmail()[1]);

}
}
