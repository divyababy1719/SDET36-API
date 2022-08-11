package BasicCRUDoperations;

import static io.restassured.RestAssured.*;

import org.junit.experimental.theories.Theories;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectTest {
	
	@Test
	public void getAllProjectTest()
	{
		/*//Step1:Create Necessary Data
		
		//step 2:Send the request
		Response resp = RestAssured.get("http://localhost:8084/projects");
		//System.out.println(resp.prettyPeek());
		//Step3: validate the response
		resp.getStatusCode();
		resp.then().log().all();*/
		
		baseURI="http://localhost";
		port=8084;
		
		when()
		   .get("/projects")
		   
		.then().assertThat().statusCode(200).log().all();
		
	
		
	}

}
