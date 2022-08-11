package DifferentWaysToPOSTaRequest;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithPOJO {
	
	@Test
	public void createProjectWithPOJO()
	{
		baseURI="http://localhost:8084";
		
		Random r= new Random();
		int rand = r.nextInt(1000);
		
		ProjectLibrary pLib=new ProjectLibrary("Divya", "Personigo"+rand, "created", 12);
		
		given()
		  .body(pLib)
		  .contentType(ContentType.JSON)
		.when()
		   .post("/addProject")
		.then()
		  .assertThat().statusCode(201).log().all();
		
		 
	}

}
