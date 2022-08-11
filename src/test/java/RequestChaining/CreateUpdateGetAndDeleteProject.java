package RequestChaining;

import static  io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUpdateGetAndDeleteProject {

	@Test
	public void createUpdateGetAndDeleteProject()
	{

//Step1: Create a project with created status	
		baseURI="http://localhost:8084";
		Random r=new Random();
		int rand = r.nextInt();
		ProjectLibrary pLib=new ProjectLibrary("Joicy", "Rubians1"+rand, "Created", 8);

		Response response = given()
				.body(pLib)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");
		response.then().assertThat().statusCode(201) .log().all();

//Step 2:Get the projectId from the response of create project 

		String projectId = response.jsonPath().get("projectId");
		
//Step3:update the project with completed status
		ProjectLibrary pLib1=new ProjectLibrary("Joicy", "Rubians1"+rand, "Completed", 8);
		given()
		   .pathParam("pid",projectId)
		   .body(pLib1)
		   .contentType(ContentType.JSON)
		.when()
		   .put("/projects/{pid}")
		.then()
		    .assertThat().statusCode(200).log().all();
		
//get the updated poject

		given()
		.pathParam("pid1",projectId)
		.when()
		.get("/projects/{pid1}")
		.then().assertThat().statusCode(200).log().all();

//use the project id to delete 

		given()
		.pathParam("Pid2", projectId)
		.when()
		.delete("/projects/{Pid2}")
		.then().assertThat().statusCode(204).log().all();

	}
}		


//projectId