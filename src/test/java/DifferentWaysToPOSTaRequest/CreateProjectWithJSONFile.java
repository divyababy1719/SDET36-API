package DifferentWaysToPOSTaRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectWithJSONFile {
	
	@Test
	public void createProjectWithJSONFile()
	{
		baseURI="http://localhost";
		port=8084;
		
		File fLib=new File(".\\target\\RequestData.json");
		
		
		given()
		.body(fLib)
		.contentType(ContentType.JSON)
		.when()
		   .post("/addProject")
		 .then()
		    .assertThat().statusCode(201).log().all();
		     
		  
	}

}
