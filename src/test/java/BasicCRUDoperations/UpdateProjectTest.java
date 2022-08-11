package BasicCRUDoperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {

	@Test
	public void updateProjectTest()
	{
/*		Random r=new Random();
		int random = r.nextInt(500);
		
		//step1: provide all necessary data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Divya");
		jobj.put("projectName", "SDET36-TYSS"+random);
		jobj.put("status", "Completed");
		jobj.put("teamSize", 12);
		
		//send the request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_429");
		
		//validate the response
		resp.then().log().all();*/
		
		baseURI="http://localhost";
		port=8084;
		Random r=new Random();
		int random = r.nextInt(500);
		
		//step1: provide all necessary data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Divya");
		jobj.put("projectName", "SDET36-TYSS"+random);
		jobj.put("status", "Completed");
		jobj.put("teamSize", 12);
		
		given()
		
 		  .body(jobj)
 		  .contentType(ContentType.JSON)
 		.when()
 		    .put("projects/TY_PROJ_429")
 		    
 		 .then()
 		    .assertThat().statusCode(200).log().all();
		   
		
		
	}
}
