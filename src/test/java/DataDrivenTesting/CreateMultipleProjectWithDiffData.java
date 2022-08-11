package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.util.Random;

public class CreateMultipleProjectWithDiffData {
	@Test(dataProvider = "getData",dataProviderClass = DataProviderForMultipleProject.class)
	public void createMultipleProjectWithDiffData(String createdBy,String projectName,String status,int teamSize)
	{
		baseURI="http://localhost:8084";
		Random r=new Random();
		int random = r.nextInt(500);
		ProjectLibrary pLib=new ProjectLibrary(createdBy, projectName+random, status, teamSize);
	    given().body(pLib).contentType(ContentType.JSON).post("/addProject").then().assertThat().statusCode(201).log().all();
	}
}
	


