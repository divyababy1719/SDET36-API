package BasicCRUDoperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	
	@Test
	public void createProjectTest()
	{
		
		//creating random number
		
	/*	Random r=new Random();
		int rand = r.nextInt(500);
		
		//Step 1:Create the necessary Data
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "Divya");
		jObj.put("projectName", "SDET36-TYSS"+rand);
		jObj.put("status", "On Going");
		jObj.put("teamSize", 12);
		
		
		//step 2: send the request
		RequestSpecification request = RestAssured.given();
		request.body(jObj);
		request.contentType(ContentType.JSON);
		
		Response resp = request.post("http://localhost:8084/addProject");
		
		//step3: validate the response;
		
		//System.out.println(resp.asString());
		System.out.println(resp.asPrettyString());*/
		
		baseURI="http://localhost";
		port=8084;
				
		Random r=new Random();
		int rand = r.nextInt(500);
		
		//Step 1:Create the necessary Data
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "Divya");
		jObj.put("projectName", "SDET36-TYSS"+rand);
		jObj.put("status", "On Going");
		jObj.put("teamSize", 12);
		
		given()
		  .body(jObj)
		  .contentType(ContentType.JSON)
		.when()
		   .post("/addProject")
		.then()
		     .assertThat().statusCode(201).log().all();
		
	}

}
