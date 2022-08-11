package BasicCRUDoperations;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetSingleProjectTest {
	@Test
	public void getSingleProjectTest()
	{
	/*	//provide necessary details
		
		//send the request
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_417");
		int statusCode = resp.getStatusCode();
	    resp.then().assertThat().statusCode(200);
		resp.then().log().all();*/
		baseURI="http://localhost";
		port=8084;
		
		when()
		   .get("/projects/TY_PROJ_417")
		.then()
		   .assertThat().statusCode(200).log().all();
	}

}
