package DifferentWaysToPOSTaRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithJSONObject {
	@Test
	public void createProjectWithJSONObject()
	{
		baseURI="http://localhost";
		port=8084;
		
		Random r=new Random();
		int random = r.nextInt(1000);
		
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "Divya");
		jObj.put("projectName", "SDET36-TYSS"+random);
		jObj.put("status", "Created");
		jObj.put("teamSize", 12);
		
		given().body(jObj).contentType(ContentType.JSON).when().post("/addProject").then().assertThat().statusCode(201).log().all();
	}

}
