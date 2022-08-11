package BasicCRUDoperationsPratice;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateTheProjectByUsingpathParameterTest {

	@Test
	public void updateTheProjectByUsingpathParameterTest()
	{
		Random r=new Random();
		int random = r.nextInt(500);
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "Divya");
		jObj.put("projectName", "SDET36-TYSS"+random);
		jObj.put("status", "Created");
		jObj.put("teamSize", 12);
	RequestSpecification req = RestAssured.given();
	req.pathParam("pId", "TY_PROJ_429");
	req.body(jObj);
	req.contentType(ContentType.JSON);
	Response resp = req.put("http://localhost:8084/projects/{pId}");
	resp.then().log().all();
	
		
	}
}
