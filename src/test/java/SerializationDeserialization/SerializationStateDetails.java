package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.Districts;
import POJOforSerializationAndDeserialization.StateDetails;

public class SerializationStateDetails {
@Test
public void SerializationStateDetailsTest() throws JsonGenerationException, JsonMappingException, IOException
{
	String[] ap= {"TVM","Calicut","Cochin","Kannur"};
	Districts d1=new Districts("Idukki", 4, "DK");
	Districts d2=new Districts("Kottayam", 6, "TR");
	StateDetails s=new StateDetails("Kerala", 14,ap,d1,d2);
	ObjectMapper om=new ObjectMapper();
	om.writeValue(new File("StateDetails.json"),s);  //file & object of pojo class
	
}
}
