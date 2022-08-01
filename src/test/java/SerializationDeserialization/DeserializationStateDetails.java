package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.StateDetails;

public class DeserializationStateDetails {
	@Test
	public void deserializationStateDetailsTest() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper om=new ObjectMapper();
		StateDetails data = om.readValue(new File("./StateDetails.json"), StateDetails.class);  //file,class type
		System.out.println(data.getS1().getDname());
		System.out.println(data.getS2().getDname());
		System.out.println(data.getairports()[2]);
	}
}
