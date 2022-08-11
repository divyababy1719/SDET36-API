package RequestChaining;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateGetAndDeleteProject {

	@Test
	public void createGetAndDeleteProject()
	{

//create the request and capture the projectId 
		baseURI="http://localhost:8084";
		Random r=new Random();
		int rand = r.nextInt();
		ProjectLibrary pLib=new ProjectLibrary("Anu", "IBM"+rand, "Created", 4);

		Response resp = given()
				          .body(pLib)
				          .contentType(ContentType.JSON)
				        .when()
				            .post("/addProject");
//get the project id from the request

		String projectId = resp.jsonPath().get("projectId");
		System.out.println(projectId);
		   given()
		      .pathParam("pid",projectId)
		   .when()
		      .get("/projects/{pid}")
		   .then().assertThat().statusCode(200).log().all();

//use the project id to delete 

		given()
		    .pathParam("Pid", projectId)
		.when()
		    .delete("/projects/{Pid}")
		.then().assertThat().statusCode(204).log().all();

	}
}
//TY_PROJ_2007