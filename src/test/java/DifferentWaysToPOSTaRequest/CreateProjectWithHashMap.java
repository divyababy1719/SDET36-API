package DifferentWaysToPOSTaRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

public class CreateProjectWithHashMap {

	@Test
	public void createProjectWithHashMap()
	{
		baseURI="http://localhost:8084";
		Random r=new Random();
		int random = r.nextInt(1000);
		
		HashMap< String, Object> hm=new HashMap<String, Object>();
		hm.put("createdBy", "Divya");
		hm.put("projectName","Personigo"+random);
		hm.put("status", "created");
		hm.put("teamSize", 8);
		
		given()
		  .body(hm)
		  .contentType(ContentType.JSON)
		.when()
		   .post("/addProject")
		 .then()
		    .assertThat().statusCode(201).log().all();
	}
	
}
